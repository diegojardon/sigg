package mx.gluo.management.authorizationservice.security;

import io.jsonwebtoken.*;
import mx.gluo.management.authorizationservice.enums.JwtConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.stream.Collectors;

@Component
public class TokenProvider {

    @Value("${jwt.secret}")
    private String secret;

    private static String SIGNING_KEY;

    @Value("${jwt.secret}")
    public void setSigningKey(String secret) {
        TokenProvider.SIGNING_KEY = secret;
    }

    public static String generateToken(Authentication authentication) {

        byte[] apiKeySecretBytes = DatatypeConverter.parseBase64Binary(SIGNING_KEY);
        Key signingKey = new SecretKeySpec(apiKeySecretBytes, SignatureAlgorithm.HS256.getJcaName());

        final String authorities = authentication.getAuthorities().stream()
                .map(GrantedAuthority::getAuthority)
                .collect(Collectors.joining(","));
        return Jwts.builder()
                .setSubject(authentication.getName())
                .claim(JwtConstants.ROLES_KEY.getText(), authorities)
                .claim(JwtConstants.USERNAME_KEY.getText(), authentication.getName())
                .signWith(SignatureAlgorithm.HS256, signingKey)
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setIssuer(JwtConstants.ISSUER_TOKEN.getText())
                .setExpiration(new Date(System.currentTimeMillis() +
                        Integer.parseInt(JwtConstants.ACCESS_TOKEN_VALIDITY_SECONDS.getText()) * 1000))
                .compact();
    }

    public static UsernamePasswordAuthenticationToken getAuthentication(final String token,
                                                                        final UserDetails userDetails) {

        final JwtParser jwtParser = Jwts.parser().setSigningKey(SIGNING_KEY);
        final Jws<Claims> claimsJws = jwtParser.parseClaimsJws(token);
        final Claims claims = claimsJws.getBody();
        final Collection<SimpleGrantedAuthority> authorities =
                Arrays.stream(claims.get(JwtConstants.ROLES_KEY.getText()).toString().split(","))
                        .map(SimpleGrantedAuthority::new)
                        .collect(Collectors.toList());

        return new UsernamePasswordAuthenticationToken(userDetails, "", authorities);
    }

    public static String getUserName(final String token) {
        final JwtParser jwtParser = Jwts.parser().setSigningKey(SIGNING_KEY);
        final Jws<Claims> claimsJws = jwtParser.parseClaimsJws(token);
        return claimsJws.getBody().getSubject();
    }

}



package mx.gluo.management.apigateway.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import mx.gluo.management.apigateway.enums.JwtConstants;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.xml.bind.DatatypeConverter;
import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {

    @Value("${jwt.secret}")
    private String secret;

    private Key key;

   @PostConstruct
    public void init(){
        this.key = Keys.hmacShaKeyFor(secret.getBytes());
    }

    public Claims getAllClaimsFromToken(String token) {
        token = token.replace(JwtConstants.BEARER_TOKEN_PREFIX.getText(), "").trim();
        return Jwts.parserBuilder().setSigningKey(DatatypeConverter.parseBase64Binary(secret)).build().parseClaimsJws(token).getBody();
    }

    private boolean isTokenExpired(String token) {
        token = token.replace(JwtConstants.BEARER_TOKEN_PREFIX.getText(), "").trim();
        return this.getAllClaimsFromToken(token).getExpiration().before(new Date());
    }

    public boolean isInvalid(String token) {
        token = token.replace(JwtConstants.BEARER_TOKEN_PREFIX.getText(), "").trim();
        return this.isTokenExpired(token);
    }

}

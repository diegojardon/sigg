package mx.gluo.management.authorizationservice.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import mx.gluo.management.authorizationservice.enums.JwtConstants;
import mx.gluo.management.authorizationservice.model.AuthorizationRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AbstractAuthenticationProcessingFilter;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

public class JwtAuthenticationFilter extends AbstractAuthenticationProcessingFilter {

    public JwtAuthenticationFilter(String url, AuthenticationManager authManager) {
        super(new AntPathRequestMatcher(url));
        setAuthenticationManager(authManager);
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest req, HttpServletResponse res)
            throws AuthenticationException, IOException, ServletException {

        AuthorizationRequest creds = new ObjectMapper().readValue(req.getInputStream(), AuthorizationRequest.class);
        Authentication auth = null;

        Authentication userPass = new UsernamePasswordAuthenticationToken(creds.getUsername(),
                creds.getPassword(), Collections.emptyList());
        auth = this.getAuthenticationManager().authenticate(userPass);

        //ObjectMapper mapper = new ObjectMapper();
        //String profile = mapper.writeValueAsString(UserConvertToDTO.webUserVOToUserResponse(webUserVO));

        //res.setHeader("Profile", profile);

        return auth;
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response,
                                            FilterChain chain, Authentication auth) throws IOException, ServletException {
        String token = TokenProvider.generateToken(auth);
        response.addHeader(JwtConstants.HEADER_AUTHORIZATION_KEY.getText(), JwtConstants.TOKEN_BEARER_PREFIX.getText() + " " + token);
    }

}

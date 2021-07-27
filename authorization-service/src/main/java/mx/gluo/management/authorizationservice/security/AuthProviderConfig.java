package mx.gluo.management.authorizationservice.security;

import mx.gluo.management.authorizationservice.entity.SiggRole;
import mx.gluo.management.authorizationservice.entity.SiggUser;
import mx.gluo.management.authorizationservice.repository.RoleRepository;
import mx.gluo.management.authorizationservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class AuthProviderConfig implements AuthenticationProvider {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {

        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        SiggUser userAuthenticated = userRepository.findByUserAndPassword(username, password);
        List<SiggRole> userRoles = roleRepository.findUserRoles(userAuthenticated.getId());

        List<GrantedAuthority> grantedAuthorityList = new ArrayList<>();

        //TODO: SETTEAR ROLES OBTENIDOS DE BD
        userRoles.forEach(role -> {
            SimpleGrantedAuthority authority = new SimpleGrantedAuthority(role.getRole());
            grantedAuthorityList.add(authority);
        });

        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken =
                new UsernamePasswordAuthenticationToken(username, password, grantedAuthorityList);
        //usernamePasswordAuthenticationToken.setDetails(webUserVO);
        return usernamePasswordAuthenticationToken;
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }

    /*private static Set<? extends GrantedAuthority> getAuthorities() {
        Set<SimpleGrantedAuthority> authorities = new HashSet<>();
        //TODO: DESCOMENTAR PARA ASIGNAR LOS ROLES
        roles.forEach(role -> authorities.add(new SimpleGrantedAuthority("ROLE_" + role.getName())));
        return authorities;
    }*/
}

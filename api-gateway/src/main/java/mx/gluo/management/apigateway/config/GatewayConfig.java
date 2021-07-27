package mx.gluo.management.apigateway.config;

import mx.gluo.management.apigateway.filter.AuthenticationFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {

    @Autowired
    AuthenticationFilter filter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("authorization-service", r -> r.path("/login/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://authorization-service"))
                .route("user-services", r -> r.path("/register/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://user-services"))
                .route("user-services", r -> r.path("/profile/**")
                        .filters(f -> f.filter(filter))
                        .uri("lb://user-services"))
                .route(p -> p
                        .path("/get")
                        .filters(f -> f.addRequestHeader("Hello", "World"))
                        .uri("http://httpbin.org:80"))
                .build();
    }

}


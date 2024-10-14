package com.nhnacademy.miniDooray.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteLocatorConfig {

    @Bean
    public RouteLocator myRoute(RouteLocatorBuilder builder) {

        return builder.routes()

                .route("account-service", r -> r.path("/account/**")
                        .uri("lb://ACCOUNT-SERVICE"))

                .route("project-service", r -> r.path("/project/**")
                        .uri("http://PROJECT-SERVICE"))

                .build();
    }
}

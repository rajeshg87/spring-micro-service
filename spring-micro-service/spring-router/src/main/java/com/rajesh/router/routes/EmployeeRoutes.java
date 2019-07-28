package com.rajesh.router.routes;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RequestPredicates;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

import com.rajesh.router.handler.RouterHandlers;

@Configuration
public class EmployeeRoutes {
	
	@Bean
    RouterFunction<?> routerFunction(RouterHandlers routerHandlers) {

        return RouterFunctions.route(RequestPredicates.GET("/rest/employee/all"), routerHandlers::getAll)
                .andRoute(RequestPredicates.GET("/rest/employee/{id}"), routerHandlers::getId)
                .andRoute(RequestPredicates.GET("/rest/employee/{id}/events"), routerHandlers::getEvents)
                ;

    }

}

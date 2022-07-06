package com.vishalmamidi.demorestlogger.router;

import com.vishalmamidi.demorestlogger.handler.LogHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class LogRouter {
    @Bean
    RouterFunction<ServerResponse> routes(LogHandler handler) {
        return route()
                .GET("/", handler::justLog)
                .build();
    }
}

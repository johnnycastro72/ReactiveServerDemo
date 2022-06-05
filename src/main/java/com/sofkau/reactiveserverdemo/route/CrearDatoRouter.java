package com.sofkau.reactiveserverdemo.route;

import com.sofkau.reactiveserverdemo.DTO.DatoDTO;
import com.sofkau.reactiveserverdemo.usecase.UseCaseCrear;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.POST;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

@Configuration
public class CrearDatoRouter {
    @Bean
    public RouterFunction<ServerResponse> createQuestion(UseCaseCrear useCaseCrear) {
        return route(POST("/crear").and(accept(MediaType.APPLICATION_JSON)),
                request -> request.bodyToMono(DatoDTO.class)
                        .flatMap(questionDTO -> useCaseCrear.apply(questionDTO)
                                .flatMap(result -> ServerResponse.ok()
                                        .contentType(MediaType.TEXT_PLAIN)
                                        .bodyValue(result))
                        )
        );
    }
}
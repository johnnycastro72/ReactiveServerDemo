package com.sofkau.reactiveserverdemo.usecase;

import com.sofkau.reactiveserverdemo.DTO.DatoDTO;
import reactor.core.publisher.Mono;

@FunctionalInterface
public interface GuardarDato {
    public Mono<String> apply(DatoDTO datoDTO);
}
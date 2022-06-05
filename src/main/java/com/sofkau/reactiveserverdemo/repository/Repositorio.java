package com.sofkau.reactiveserverdemo.repository;

import com.sofkau.reactiveserverdemo.collection.Dato;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface Repositorio extends ReactiveMongoRepository<Dato, String> {
}

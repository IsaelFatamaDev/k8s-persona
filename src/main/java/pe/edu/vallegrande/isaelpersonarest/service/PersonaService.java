package pe.edu.vallegrande.isaelpersonarest.service;

import pe.edu.vallegrande.isaelpersonarest.model.Persona;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface PersonaService {

    Flux<Persona> findAll();

    Mono<Persona> findById(Long id);

    Mono<Persona> save(Persona persona);

    Mono<Persona> update(Long id, Persona persona);

    Mono<Void> deleteById(Long id);

}

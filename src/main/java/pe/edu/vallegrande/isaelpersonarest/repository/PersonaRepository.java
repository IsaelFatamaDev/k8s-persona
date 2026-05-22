package pe.edu.vallegrande.isaelpersonarest.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import pe.edu.vallegrande.isaelpersonarest.model.Persona;

@Repository
public interface PersonaRepository extends ReactiveCrudRepository<Persona, Long> {
}

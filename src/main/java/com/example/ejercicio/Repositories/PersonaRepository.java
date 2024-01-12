package com.example.ejercicio.Repositories;

import com.example.ejercicio.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {
    Persona findPersonaByIdentificacion(long identificacion);
    void deletePersonaByIdentificacion(long identificacion);

}

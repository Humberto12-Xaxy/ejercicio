package com.example.ejercicio.services;

import com.example.ejercicio.Repositories.PersonaRepository;
import com.example.ejercicio.models.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Directorio {

    @Autowired
    private PersonaRepository personaRepository;

    public List<Persona> findPersonas(){
        return personaRepository.findAll();
    }

    public Persona findPersonaByIdentificacion(long identificacion){
        return personaRepository.findPersonaByIdentificacion(identificacion);
    }

    public void deletePersonaByIdentificacion(long identificacion){

        personaRepository.deletePersonaByIdentificacion(identificacion);

    }

    public void storePersona(Persona persona){
        personaRepository.save(persona);

    }
}

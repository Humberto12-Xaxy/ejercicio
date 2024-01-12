package com.example.ejercicio.controller;

import com.example.ejercicio.models.Persona;
import com.example.ejercicio.services.Directorio;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/directorio")
public class DirectorioRestService {

    private final Directorio directorio;

    public DirectorioRestService(Directorio directorio) {
        this.directorio = directorio;
    }

    @GetMapping("/{identificacion}")
    public Persona findPersonaByIdentificación(@PathVariable long identificacion){
        System.out.println(identificacion);
        return directorio.findPersonaByIdentificacion(identificacion);
    }

    @GetMapping("/personas")
    public List<Persona> findPersonas(){

        return directorio.findPersonas();
    }

    @DeleteMapping("/deletePersona/{identificacion}")
    public String deletePersonaByIdentificacion(@PathVariable long identificacion){
        directorio.deletePersonaByIdentificacion(identificacion);
        return "Se ha eliminado el registro";
    }

    @PostMapping("/addPersona")
    public String storePersona(@RequestBody Persona persona){
        directorio.storePersona(persona);

        return "Se ha guardado la persona";
    }
}

package com.example.ejercicio.controller;

import com.example.ejercicio.models.Factura;
import com.example.ejercicio.models.Persona;
import com.example.ejercicio.services.Ventas;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/factura")
public class FacturaRestService {

    private final Ventas ventas;

    public FacturaRestService(Ventas ventas) {
        this.ventas = ventas;
    }

    @GetMapping("/facturaByPersona")
    public Optional<Factura> findFacturaByPersona(@RequestBody Persona persona){

        return ventas.findFacturaByPersona(persona);
    }

    @PostMapping("/addFactura")
    public String storeFactura(@RequestBody Factura factura){
        System.out.println(factura);
        ventas.storeFactura(factura);
        return "Se ha registrado la factura";
    }
}

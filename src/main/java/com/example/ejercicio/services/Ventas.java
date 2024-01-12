package com.example.ejercicio.services;

import com.example.ejercicio.Repositories.FacturaRepository;
import com.example.ejercicio.models.Factura;
import com.example.ejercicio.models.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class Ventas {

    @Autowired
    private FacturaRepository facturaRepository;

    public Optional<Factura> findFacturaByPersona(Persona persona){
        Optional<Factura> factura = facturaRepository.findById(persona.getIdentificacion());
        System.out.println(factura);
        if(factura.isPresent())
            return factura;
        else {
            Optional<Factura> factura2 = null;
            return factura2;
        }
    }

    public void storeFactura(Factura factura){
        facturaRepository.save(factura);
    }
}

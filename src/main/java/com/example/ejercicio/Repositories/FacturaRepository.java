package com.example.ejercicio.Repositories;

import com.example.ejercicio.models.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository<Factura, Long> {
}

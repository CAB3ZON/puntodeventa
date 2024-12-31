package com.seguridad.puntodeventa.controller;

import com.seguridad.puntodeventa.model.Factura;
import com.seguridad.puntodeventa.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/facturas")
public class FacturaController {
    @Autowired
    private FacturaRepository facturaRepository;

    @GetMapping
    public ResponseEntity<List<Factura>> obtenerTodasLasFacturas() {
        List<Factura> facturas = facturaRepository.findAll();
        return ResponseEntity.ok(facturas);
    }

    // Crear una nueva factura
    @PostMapping
    public ResponseEntity<Factura> crearFactura(@RequestBody Factura nuevaFactura) {
        Factura facturaCreada = facturaRepository.save(nuevaFactura);
        return ResponseEntity.status(HttpStatus.CREATED).body(facturaCreada);
    }

    // Actualizar una factura existente
    @PutMapping("/{id}")
    public ResponseEntity<Factura> actualizarFactura(@PathVariable Long id, @RequestBody Factura facturaActualizada) {
        return facturaRepository.findById(id)
                .map(facturaExistente -> {
                    facturaActualizada.setId_factura(id.intValue()); // Asegurarse de mantener el mismo ID
                    Factura facturaGuardada = facturaRepository.save(facturaActualizada);
                    return ResponseEntity.ok(facturaGuardada);
                })
                .orElse(ResponseEntity.notFound().build());
    }

    // Eliminar una factura por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarFactura(@PathVariable Long id) {
        if (facturaRepository.existsById(id)) {
            facturaRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}

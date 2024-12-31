package com.seguridad.puntodeventa.controller;

import com.seguridad.puntodeventa.model.Clasificacion;
import com.seguridad.puntodeventa.repository.ClasificacionRepository;
import com.seguridad.puntodeventa.service.ClasificacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clasificaciones")
public class ClasificacionController {
    @Autowired
    private ClasificacionService clasificacionService;

    @Autowired
    private ClasificacionRepository clasificacionRepository;
    @GetMapping
    public List<Clasificacion> getAllClasificaciones() {
        return clasificacionRepository.findAll();
    }

    // GET: Obtener una clasificación por ID
    @GetMapping("/{id}")
    public ResponseEntity<Clasificacion> getClasificacionById(@PathVariable Long id) {
        Optional<Clasificacion> clasificacion = clasificacionRepository.findById(id);
        return clasificacion.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    // POST: Crear una nueva clasificación
    @PostMapping
    public Clasificacion createClasificacion(@RequestBody Clasificacion clasificacion) {
        return clasificacionRepository.save(clasificacion);
    }

    // PUT: Actualizar una clasificación existente
    @PutMapping("/{id}")
    public ResponseEntity<Clasificacion> updateClasificacion(@PathVariable Long id, @RequestBody Clasificacion clasificacion) {
        if (clasificacionRepository.existsById(id)) {
            clasificacion.setId_clasificacion(id.intValue()); // Establecer el ID de la clasificación existente
            Clasificacion updatedClasificacion = clasificacionRepository.save(clasificacion);
            return ResponseEntity.ok(updatedClasificacion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // DELETE: Eliminar una clasificación por ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClasificacion(@PathVariable Long id) {
        if (clasificacionRepository.existsById(id)) {
            clasificacionRepository.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

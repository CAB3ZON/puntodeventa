package com.seguridad.puntodeventa.controller;

import com.seguridad.puntodeventa.model.Persona;
import com.seguridad.puntodeventa.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/personas")
public class PersonaController {
    @Autowired
    private PersonaService personaService;

    @GetMapping("/buscarP")
    public ResponseEntity<Persona> buscarP(@RequestParam String dni) {
        Optional<Persona> persona = personaService.buscarPorDni(dni);
        return persona.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping("/nombreCompl")
    public ResponseEntity<String> obtenerNombreCompleto(@RequestParam String dni) {
        Optional<String> nombreCompleto = personaService.obtenerNombreCompleto(dni);
        return nombreCompleto.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }
}

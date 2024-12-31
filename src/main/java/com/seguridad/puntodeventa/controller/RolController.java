package com.seguridad.puntodeventa.controller;

import com.seguridad.puntodeventa.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/roles")
public class RolController {
    @Autowired
    private RolService rolService;


    @GetMapping("/siexisterol")
    public ResponseEntity<Boolean> siExisteRol(@RequestParam String rol) {
        boolean existe = rolService.siExisteRol(rol);
        return ResponseEntity.ok(existe);
    }

    // Endpoint para verificar si existe un rol basado en el nombre (opcional)
    @GetMapping("/estado")
    public ResponseEntity<Boolean> existePorNombre(@RequestParam String rol) {
        boolean existe = rolService.existePorNombre(rol);
        return ResponseEntity.ok(existe);
    }
}

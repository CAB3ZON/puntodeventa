package com.seguridad.puntodeventa.controller;

import com.seguridad.puntodeventa.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    private UsuarioService usuarioService;
    @GetMapping("/siexiste")
    public ResponseEntity<Boolean> verificarUsuario(@RequestParam String username) {
        boolean existe = usuarioService.usuarioExiste(username);
        return ResponseEntity.ok(existe);
    }
}

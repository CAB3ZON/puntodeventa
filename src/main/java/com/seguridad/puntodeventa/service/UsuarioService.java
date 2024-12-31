package com.seguridad.puntodeventa.service;

import com.seguridad.puntodeventa.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public boolean usuarioExiste(String username) {
        return usuarioRepository.existsBy(username);
    }
}

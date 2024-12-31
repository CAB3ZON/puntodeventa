package com.seguridad.puntodeventa.service;

import com.seguridad.puntodeventa.repository.RolRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RolService {
    @Autowired
    private RolRepository rolRepository;

    public boolean siExisteRol(String rol) {
        return rolRepository.existsByRol(rol);
    }

    // Método que verifica si existe el rol (usando consulta personalizada)
    public boolean existePorNombre(String rol) {
        return rolRepository.existePorNombreRol(rol);
    }
}

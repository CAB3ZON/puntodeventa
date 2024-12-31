package com.seguridad.puntodeventa.service;

import com.seguridad.puntodeventa.model.Persona;
import com.seguridad.puntodeventa.repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PersonaService {
    @Autowired
    private PersonaRepository personaRepository;

    public Optional<Persona> buscarPorDni(String dni) {
        return personaRepository.findByDni(dni);
    }

    public Optional<String> obtenerNombreCompleto(String dni) {
        return personaRepository.findByDni(dni)
                .map(persona -> persona.getNombre() + " " + persona.getApellido());
    }
}

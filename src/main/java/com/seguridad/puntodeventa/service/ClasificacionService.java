package com.seguridad.puntodeventa.service;

import com.seguridad.puntodeventa.repository.ClasificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClasificacionService {
    @Autowired
    private ClasificacionRepository clasificacionRepository;
}

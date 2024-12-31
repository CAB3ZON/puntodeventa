package com.seguridad.puntodeventa.service;

import com.seguridad.puntodeventa.repository.CompetenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompetenciaService {
    @Autowired
    private CompetenciaRepository competenciaRepository;
}

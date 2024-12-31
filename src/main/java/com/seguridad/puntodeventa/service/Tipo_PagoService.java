package com.seguridad.puntodeventa.service;

import com.seguridad.puntodeventa.repository.Tipo_PagoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Tipo_PagoService {
    @Autowired
    private Tipo_PagoRepository tipoPagoRepository;
}

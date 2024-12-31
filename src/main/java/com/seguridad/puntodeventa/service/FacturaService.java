package com.seguridad.puntodeventa.service;

import com.seguridad.puntodeventa.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaService {
    @Autowired
    private FacturaRepository facturaRepository;
}

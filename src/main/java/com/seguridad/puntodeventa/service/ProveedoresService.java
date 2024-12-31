package com.seguridad.puntodeventa.service;

import com.seguridad.puntodeventa.repository.ProveedoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProveedoresService {
    @Autowired
    private ProveedoresRepository proveedoresRepository;
}

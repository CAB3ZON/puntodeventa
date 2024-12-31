package com.seguridad.puntodeventa.service;

import com.seguridad.puntodeventa.repository.Item_FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Item_FacturaService {
    @Autowired
    private Item_FacturaRepository itemFacturaRepository;
}

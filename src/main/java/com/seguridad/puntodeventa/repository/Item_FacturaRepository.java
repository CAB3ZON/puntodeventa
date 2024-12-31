package com.seguridad.puntodeventa.repository;

import com.seguridad.puntodeventa.model.Item_Factura;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Item_FacturaRepository extends JpaRepository<Item_Factura,Long> {
}

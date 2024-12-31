package com.seguridad.puntodeventa.repository;

import com.seguridad.puntodeventa.model.Tipo_Pago;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Tipo_PagoRepository extends JpaRepository<Tipo_Pago,Long> {
}

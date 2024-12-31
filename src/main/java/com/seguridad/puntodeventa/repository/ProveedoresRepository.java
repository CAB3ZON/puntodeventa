package com.seguridad.puntodeventa.repository;

import com.seguridad.puntodeventa.model.Proveedores;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProveedoresRepository extends JpaRepository<Proveedores,Long> {
}

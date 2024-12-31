package com.seguridad.puntodeventa.repository;

import com.seguridad.puntodeventa.model.Clasificacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClasificacionRepository extends JpaRepository<Clasificacion,Long> {
}

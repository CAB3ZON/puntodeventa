package com.seguridad.puntodeventa.repository;

import com.seguridad.puntodeventa.model.Competencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompetenciaRepository extends JpaRepository<Competencia,Long> {
}

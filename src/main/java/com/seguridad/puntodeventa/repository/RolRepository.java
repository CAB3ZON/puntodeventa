package com.seguridad.puntodeventa.repository;

import com.seguridad.puntodeventa.model.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RolRepository extends JpaRepository<Rol,Long> {
    boolean existsByRol(String rol);

    // Método personalizado para verificar si existe el rol (opcional si ya funciona el derivado)
    @Query("SELECT r.estado FROM Rol r WHERE r.rol = :rol")
    Boolean existePorNombreRol(@Param("rol") String rol);
}

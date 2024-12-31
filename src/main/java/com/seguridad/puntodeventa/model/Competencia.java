package com.seguridad.puntodeventa.model;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Competencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_competencias;
    private String nombre;
    private String descripcion;
    @ManyToMany(mappedBy = "competencias") // Relación con Rol
    private List<Rol> roles;

    public Competencia() {
    }

    public Competencia(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public int getId_competencias() {
        return id_competencias;
    }

    public void setId_competencias(int id_competencias) {
        this.id_competencias = id_competencias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Rol> getRoles() {
        return roles;
    }

    public void setRoles(List<Rol> roles) {
        this.roles = roles;
    }
}

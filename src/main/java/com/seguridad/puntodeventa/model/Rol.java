package com.seguridad.puntodeventa.model;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_rol;
    private String rol;
    private boolean estado;
    @ManyToMany(mappedBy = "roles") // Relación inversa en la clase Usuario
    private List<Usuario> usuarios;

    @ManyToMany
    @JoinTable(
            name = "rol_competencia", // Nueva tabla intermedia
            joinColumns = @JoinColumn(name = "id_rol"), // Referencia a Rol
            inverseJoinColumns = @JoinColumn(name = "id_competencias") // Referencia a Competencia
    )
    private List<Competencia> competencias;

    public Rol() {
    }

    public Rol(String rol, boolean estado) {
        this.rol = rol;
        this.estado = estado;
    }

    public int getId_rol() {
        return id_rol;
    }

    public void setId_rol(int id_rol) {
        this.id_rol = id_rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Competencia> getCompetencias() {
        return competencias;
    }

    public void setCompetencias(List<Competencia> competencias) {
        this.competencias = competencias;
    }
}

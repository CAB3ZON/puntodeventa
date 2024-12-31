package com.seguridad.puntodeventa.model;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Clasificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_clasificacion;
    private String grupo;

    public Clasificacion() {
    }
    @OneToMany(mappedBy = "clasificacion", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Producto> productos;
    public Clasificacion(String grupo) {
        this.grupo = grupo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public int getId_clasificacion() {
        return id_clasificacion;
    }

    public void setId_clasificacion(int id_clasificacion) {
        this.id_clasificacion = id_clasificacion;
    }
}

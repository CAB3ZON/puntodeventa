package com.seguridad.puntodeventa.model;

import jakarta.persistence.*;

import java.util.List;

@Entity

public class Proveedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_proveedor;
    private String ruc;
    private String telefono;
    private String pais;
    private String correo;
    private String moneda;

    public Proveedores() {
    }
    @OneToMany(mappedBy = "proveedores", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Producto> productos;
    public Proveedores(String ruc, String telefono, String pais, String correo, String moneda) {
        this.ruc = ruc;
        this.telefono = telefono;
        this.pais = pais;
        this.correo = correo;
        this.moneda = moneda;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}

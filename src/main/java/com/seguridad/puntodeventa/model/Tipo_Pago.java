package com.seguridad.puntodeventa.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Tipo_Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_tipo_pago;
    private String tipo;
    private String descrip;
    @OneToMany(mappedBy = "tipo_pago", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Factura> facturas;

    public Tipo_Pago() {
    }

    public Tipo_Pago(String tipo, String descrip) {
        this.tipo = tipo;
        this.descrip = descrip;
    }

    public int getId_tipo_pago() {
        return id_tipo_pago;
    }

    public void setId_tipo_pago(int id_tipo_pago) {
        this.id_tipo_pago = id_tipo_pago;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
}

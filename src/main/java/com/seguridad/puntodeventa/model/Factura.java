package com.seguridad.puntodeventa.model;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.List;


@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_factura;
    private String ruc;
    private Date fecha;
    private Double descuento;
    private Double total;
    @ManyToOne
    @JoinColumn(name = "id_persona", nullable = false) // Define la FK en la tabla Factura
    private Persona persona;

    @ManyToOne
    @JoinColumn(name = "id_tipo_pago", nullable = false) // Define la FK en la tabla Factura
    private Tipo_Pago tipo_pago;

    @OneToMany(mappedBy = "factura", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Item_Factura> itemFacturas;

    public Factura() {
    }

    public Factura(String ruc, Date fecha, Double descuento, Double total) {
        this.ruc = ruc;
        this.fecha = fecha;
        this.descuento = descuento;
        this.total = total;
    }

    public int getId_factura() {
        return id_factura;
    }

    public List<Item_Factura> getItemFacturas() {
        return itemFacturas;
    }

    public void setItemFacturas(List<Item_Factura> itemFacturas) {
        this.itemFacturas = itemFacturas;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public String getRuc() {
        return ruc;
    }

    public Tipo_Pago getTipo_pago() {
        return tipo_pago;
    }

    public void setTipo_pago(Tipo_Pago tipo_pago) {
        this.tipo_pago = tipo_pago;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_AltaCohecionYBajoAcoplamiento;

import java.util.Date;
import java.util.List;


/**
 *
 * @author DELL
 */
public class Factura {
    private int idFactura;
    private Cliente cliente;
    private List<Producto> productos;
    private double descuento;
    private double total;
    private Date fechaFactura;

    public Factura(int idFactura, Cliente cliente, List<Producto> productos, double descuento, double total, Date fechaFactura) {
        this.idFactura = idFactura;
        this.cliente = cliente;
        this.productos = productos;
        this.descuento = descuento;
        this.total = total;
        this.fechaFactura = fechaFactura;
    }

    /**
     * @return the idFactura
     */
    public int getIdFactura() {
        return idFactura;
    }

    /**
     * @param idFactura the idFactura to set
     */
    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the productos
     */
    public List<Producto> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    /**
     * @return the descuento
     */
    public double getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    /**
     * @return the total
     */
    public double getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(double total) {
        this.total = total;
    }

    /**
     * @return the fechaFactura
     */
    public Date getFechaFactura() {
        return fechaFactura;
    }

    /**
     * @param fechaFactura the fechaFactura to set
     */
    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }


}
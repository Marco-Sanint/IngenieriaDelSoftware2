/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_AltaCohecionYBajoAcoplamiento;

import java.util.List;



/**
 *
 * @author DELL
 */
public class SistemaFactura {
public SistemaFactura() {
    }
    
    public double calcularTotal(List<Producto> productos) {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.getPrecioProducto();
        }
        return total;
    }

    public double aplicarDescuento(Factura factura, double descuento) {
        double totalConDescuento = factura.getTotal() * (1 - descuento/100);
        factura.setTotal(totalConDescuento);
        return totalConDescuento;
    }

    public String generarNumFactura(Factura factura) {
        return factura.getFechaFactura().getTime() + "";
    }

    public void procesarFactura(Factura factura) {
        System.out.println("Generando factura cliente: " + factura.getCliente().getNombreCliente());
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller11_AltaCohecionYBajoAcoplamiento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Daniel", "Calle R");

        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto(101, "Laptop", 1500.00));
        productos.add(new Producto(102, "Mouse", 20.00));
        productos.add(new Producto(103, "Teclado", 50.00));

        SistemaFactura sf = new SistemaFactura();
        double total = sf.calcularTotal(productos);
        Factura factura = new Factura(0, cliente, productos, 10, total, new Date());
        System.out.println("Total sin descuento: " + total);
        double totalConDescuento = sf.aplicarDescuento(factura, factura.getDescuento());
        System.out.println("Total con descuento: " + totalConDescuento);

        String numeroFactura = sf.generarNumFactura(factura);
        System.out.println("Número de factura: " + numeroFactura);

        
        sf.procesarFactura(factura);
    
    }
    
}
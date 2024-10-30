/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta1;

/**
 *
 * @author DELL
 */
public class Orden {
    public double calcularTotalImpuesto(double precio){
        double impuesto = precio * 0.1; // 10% impuesto
        double total = precio + impuesto;
        return total;
    }
    
    public double calcularDescuentoTotal(double precio, double descuento){
        double descuentoPrecio = precio - descuento;
        double impuesto = descuentoPrecio * 0.1; // 10% impuesto
        double descuentoTotal = descuentoPrecio + impuesto;
        return descuentoTotal;
    }
}

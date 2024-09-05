/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller4;

/**
 *
 * @author DELL
 */
public class CalculoImpuestoIva extends Calculo{

    public CalculoImpuestoIva(String producto, int cantidad, double precio) {
        super(producto, cantidad, precio);
    }

    @Override
    double calcularImpuesto() {
        return (this.getCantidad() * this.getPrecio()) + (this.getCantidad() * this.getPrecio()) * 0.19;
    }
    
}

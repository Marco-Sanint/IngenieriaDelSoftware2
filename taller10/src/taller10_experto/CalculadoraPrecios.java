/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_experto;

/**
 *
 * @author DELL
 */
public class CalculadoraPrecios {
    public double calcularPrecioTotal(Carrito carrito) {
        double total = 0;
        for (Libro libro : carrito.getLibros()) {
            total += libro.getPrecio();
        }
        return total;
    }
}
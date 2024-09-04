/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5;

/**
 *
 * @author DELL
 */
public class Inventario {
    public void calcularCostoTotal(Producto producto){
        System.out.println(producto.calcularPrecio(producto.getPrecio(), producto.getCantidad()));
    }
}

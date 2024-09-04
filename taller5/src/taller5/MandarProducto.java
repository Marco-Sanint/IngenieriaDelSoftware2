/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5;

/**
 *
 * @author DELL
 */
public class MandarProducto {
    public void enviarProducto(ProductoFisico producto, String direccion){
        System.out.println("Producto " + producto.getNombre() + " mandado a la direccion " + direccion);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5;

/**
 *
 * @author DELL
 */
public class ProductoMixto extends Producto implements enviarPorCorreo{
    private double peso;
    private double tamañoArchivo;

    public ProductoMixto(double peso, double tamañoArchivo, String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
        this.peso = peso;
        this.tamañoArchivo = tamañoArchivo;
    }
    

    @Override
    public void mandarProductoPorCorreo(String nombre, String direccion) {
        System.out.println("Producto " + nombre + " mandadno a la direccion " + direccion);
    }


    
}

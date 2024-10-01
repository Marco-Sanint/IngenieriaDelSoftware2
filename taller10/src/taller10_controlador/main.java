/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_controlador;

/**
 *
 * @author DELL
 */

public class main {
    public static void main(String[] args) {
        Tienda tienda = new Tienda();

        tienda.crearComputadora("Intel Core i5", "NVIDIA GeForce GTX 1660", 16);
        tienda.crearComputadora("AMD Ryzen 5", "AMD Radeon RX 560X", 8);
        tienda.crearComputadora("Intel Core i7", "NVIDIA GeForce RTX 3070", 32);

        Orden orden = new Orden();
        
        
    }
}
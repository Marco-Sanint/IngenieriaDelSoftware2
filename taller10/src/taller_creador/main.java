/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_creador;

/**
 *
 * @author DELL
 */

public class main {
    public static void main(String[] args) {
        Entrada entrada1 = new Entrada("E001", "VIP", 100.0);
        Entrada entrada2 = new Entrada("E002", "General", 50.0);
        Entrada entrada3 = new Entrada("E003", "VIP", 100.0);

        Usuario usuario1 = new Usuario("100","Juan", "Pérez", 34);
        Usuario usuario2 = new Usuario("101","María", "Gómez", 28);
        
        Venta venta1 = new Venta(entrada1, usuario1);
        Venta venta2 = new Venta(entrada2, usuario2);
    }
}
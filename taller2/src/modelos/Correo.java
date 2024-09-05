/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DELL
 */
public class Correo {
    public void enviarEmailFactura(Usuario usuario, Factura factura){
        System.out.println("Hola " + usuario.getNombre() + " te compartimos tu factura virtual por la compra de " + factura.getLista());
    }
}

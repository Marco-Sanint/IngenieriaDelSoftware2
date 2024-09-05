/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DELL
 */
public class Dian {
    public void enviarFacturaDian(Usuario usuario, Factura factura){
        System.out.println("Se ha compartido la factura " + factura.getLista() + " a nombre del usuairo " + usuario.getNombre());
    }
}

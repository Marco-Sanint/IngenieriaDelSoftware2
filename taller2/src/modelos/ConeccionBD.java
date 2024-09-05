/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DELL
 */
public class ConeccionBD {
    
    public void guardarCliente(Usuario usuario){
        System.out.println(usuario.getNombre() + " fue guardado en la base de datos");
    }
    
    public void guardarFactura(Factura factura){
        System.out.println("La factura de (" + factura.getLista() + ") fue agregada a la base de datos");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller12_indireccion;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IServicioNotificacionesGmail servicioNotificacionesGmail = new ServicioNotifiacionesGmail();
        Usuario usuario = new Usuario("Marco", "Sanint", "1089930094");
        CorreoGmail cg = servicioNotificacionesGmail.crear(usuario);
        cg.setTitulo("Saludo");
        cg.setBody("Hola mundo");
        System.out.println(cg);
    }
    
}

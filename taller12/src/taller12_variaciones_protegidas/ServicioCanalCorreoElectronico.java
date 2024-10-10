/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12_variaciones_protegidas;

/**
 *
 * @author DELL
 */
public class ServicioCanalCorreoElectronico implements IServicioCanalNotificacion{

    @Override
    public void enviarNotificacion(String titulo, String cuerpo) {
        System.out.println("Correo enviado: " + titulo + " - " + cuerpo);
    }
}

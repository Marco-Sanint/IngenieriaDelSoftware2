/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller12_variaciones_protegidas;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Notificacion notificacion = new CanalSMS("Titulo del SMS", "Cuerpo del SMS");
        IServicioCanalNotificacion sn = new ServicioCanalSMS();
        Notificador servicioImpuesto = new Notificador(sn, notificacion);
        servicioImpuesto.enviar();
    }
}

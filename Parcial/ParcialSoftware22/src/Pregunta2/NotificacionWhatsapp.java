/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta2;

/**
 *
 * @author DELL
 */
public class NotificacionWhatsapp extends Notificacion{
    private String tirulo;

    public NotificacionWhatsapp(String tirulo, String cuerpo) {
        super(cuerpo);
        this.tirulo = tirulo;
    }
}

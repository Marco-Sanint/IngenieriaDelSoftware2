/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12_indireccion;

/**
 *
 * @author DELL
 */
public class ServicioNotifiacionesGmail implements IServicioNotificacionesGmail{

    @Override
    public CorreoGmail crear(Usuario usuario) {
        return new CorreoGmail(usuario);
    }
    
}

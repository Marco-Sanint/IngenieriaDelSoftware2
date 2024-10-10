/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12_variaciones_protegidas;

/**
 *
 * @author DELL
 */
public class Notificador {
    private IServicioCanalNotificacion cn;
    private Notificacion notificacion;

    public Notificador(IServicioCanalNotificacion cn, Notificacion notificacion) {
        this.cn = cn;
        this.notificacion = notificacion;
    }
    
    public void enviar(){
        this.cn.enviarNotificacion(notificacion.getTitulo(), notificacion.getCuerpo());
    }
}

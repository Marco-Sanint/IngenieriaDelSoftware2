/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron_observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class CanalNoticias {
    private Noticia noticia;
    private List<Observador> suscriptores;
    
    public CanalNoticias(){
        suscriptores = new ArrayList<>();
    }
    
    public void agregarSuscriptor(Observador observador){
        suscriptores.add(observador);
    }
    
    public void eliminarSuscriptor(Observador observador){
        suscriptores.remove(observador);
    }
    
    public void notificarSuscriptores(Noticia ultima){
        this.noticia = ultima;
        for (Observador suscriptor: suscriptores){
            suscriptor.actualizar(noticia);
        }
    }
}

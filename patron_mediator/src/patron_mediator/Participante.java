/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron_mediator;

/**
 *
 * @author DELL
 */
public abstract class Participante {
    private Mediator mediator;
    
    public Participante(Mediator mediator){
        this.mediator = mediator;
    }
    
    public abstract void enviar(String mensaje);
    public abstract void recibir(String mensaje);
    
    public Mediator getMediator(){
        return mediator;
    }
}
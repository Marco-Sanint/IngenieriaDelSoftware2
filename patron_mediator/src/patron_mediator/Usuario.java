/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron_mediator;

/**
 *
 * @author DELL
 */
public class Usuario extends Participante {
    private String nombre;
    
    public Usuario(Mediator mediator, String nombre){
        super(mediator);
        this.nombre = nombre;
        
    }
    
    @Override 
    public void enviar(String mensaje){
        getMediator().enviar(mensaje, this);
        
    }
    
    @Override 
    public void recibir(String mensaje){
        System.out.println(nombre + ":" mensaje);
    }
    
}
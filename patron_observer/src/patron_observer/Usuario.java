/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron_observer;

/**
 *
 * @author DELL
 */
public class Usuario implements Observador{
    private String nombre;
    
    public Usuario(String nombre){
        this.nombre = nombre;
    }
    
    @Override 
    public void actualizar(Noticia noticia){
        System.out.println("SOY: " + nombre + "LA ULTIMA NOTICIA: " +noticia.getDescripcion());
    }
}

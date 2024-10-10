/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller12_indireccion;

/**
 *
 * @author DELL
 */
public class Correo {
    private Usuario usuario;
    private String titulo;
    private String body;

    public Correo(Usuario usuario) {
        this.usuario = usuario;
    }

    public String mostrarContenido(){
        return "Correo para " + usuario.toString() + "\n" +
               "Titulo: " + titulo + "\n" +
               "Body: " + body;
    }
    
    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }
    
    
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DELL
 */
public class Usuario {
    private String id;
    private String nombre;
    private String apellido;
    private String genero;
    private int numero;
    private String gmail;

    public Usuario(String id, String nombre, String apellido, String genero, int numero, String gmail) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.numero = numero;
        this.gmail = gmail;
    }
    
    public String obtenerInfoUsuario() {
        return "ID: " + getId() + "\n" +
               "Nombre: " + getNombre() + " " + getApellido() + "\n" +
               "Género: " + getGenero() + "\n" +
               "Número: " + getNumero() + "\n";
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the genero
     */
    public String getGenero() {
        return genero;
    }

    /**
     * @param genero the genero to set
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the gmail
     */
    public String getGmail() {
        return gmail;
    }

    /**
     * @param gmail the gmail to set
     */
    public void setGmail(String gmail) {
        this.gmail = gmail;
    }
}


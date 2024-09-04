/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller61;

/**
 *
 * @author DELL
 */
public class PaquetePeligroso extends Paquete implements IPaquetePeligroso{
    private String etiquetaPeligro;
    private boolean embalajeEspecial;

    public PaquetePeligroso(String etiquetaPeligro, boolean embalajeEspecial, double peso, double dimenciones) {
        super(peso, dimenciones);
        this.etiquetaPeligro = etiquetaPeligro;
        this.embalajeEspecial = embalajeEspecial;
    }

    @Override
    public void verificarContenidoPeligroso() {
        System.out.println("Contenido verificado");
    }

    @Override
    public void asegurarPaquetePeligroso() {
        System.out.println("Paquete asegurado");
    }
}

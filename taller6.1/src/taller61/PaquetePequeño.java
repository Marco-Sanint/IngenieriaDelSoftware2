/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller61;

/**
 *
 * @author DELL
 */
public class PaquetePequeño extends Paquete implements IPaquetePequeño{
    private double valorDeclarado;

    public PaquetePequeño(double valorDeclarado, double peso, double dimenciones) {
        super(peso, dimenciones);
        this.valorDeclarado = valorDeclarado;
    }

    @Override
    public void calcularCostoEnvioPequeño() {
        System.out.println("Costo envio pequeño calculado");
    }
    
}

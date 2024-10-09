/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_Polimorfismo;

/**
 *
 * @author DELL
 */
public class Bicicleta implements Transportable{
    private String tipo;
    private int velocidad;

    public Bicicleta(String tipo) {
        this.tipo = tipo;
        this.velocidad = 0;
    }

    @Override
    public void acelerar() {
        velocidad += 5;
        System.out.println("La bici va a " + velocidad + " km/h.");
    }

    @Override
    public void frenar() {
        velocidad -= 5;
        System.out.println("La bici va a " + velocidad + " km/h.");
    }


    @Override
    public void mostrarInformacion() {
        System.out.println("Tipo de bici: " + tipo);
    }
}

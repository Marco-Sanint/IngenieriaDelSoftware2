/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_Polimorfismo;

/**
 *
 * @author DELL
 */
public class Carro implements Transportable{
    private String marca;
    private int velocidad;

    public Carro(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    @Override
    public void acelerar() {
        velocidad += 20;
        System.out.println("El carro va a " + velocidad + " km/h.");
    }

    @Override
    public void frenar() {
        velocidad -= 20;
        System.out.println("El carro va a " + velocidad + " hm/h.");
    }


    @Override
    public void mostrarInformacion() {
        System.out.println("Marca de carro: " + marca);
    }
}

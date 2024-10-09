/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller11_Polimorfismo;

/**
 *
 * @author DELL
 */
public class Garaje {
    public void estacionar(Transportable transporte) {
        System.out.println("---------------------------------");
        transporte.mostrarInformacion();
        System.out.println("Guardado en garaje");
    }
}

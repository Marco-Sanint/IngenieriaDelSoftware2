/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_1_parcial;

/**
 *
 * @author DELL
 */
public class RegularPackage extends Package {
    public RegularPackage(String type) {
        super(type);
    }

    @Override
    public void send() {
        System.out.println("Enviando paquete " + type + " via Regular.");
    }
}

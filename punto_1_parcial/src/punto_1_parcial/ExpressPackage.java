/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_1_parcial;

/**
 *
 * @author DELL
 */
public class ExpressPackage extends Package {
    public ExpressPackage(String type) {
        super(type);
    }

    @Override
    public void send() {
        System.out.println("EnviandoPaquete " + type + " via Express.");
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_4_parcial;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Configuracion config1 = Configuracion.getInstance();
        Configuracion config2 = Configuracion.getInstance();

        System.out.println(config1 == config2); 
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        
        Envio envioEstandar = new EnvioEstandar(10, 50);
        Envio envioExpress = new EnvioExpress(10, 50);
        Envio envioInternacional = new EnvioInternacional(10, 50);

        Calculadora calculadora = new Calculadora();
        
        double costo = calculadora.calcularCostoEnvio(envioEstandar);
        
        System.out.println("Costo Envio Internacional: " + costo);
    }
}

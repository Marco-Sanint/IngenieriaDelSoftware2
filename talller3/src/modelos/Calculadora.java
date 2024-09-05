/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DELL
 */
public class Calculadora {
    public double calcularCostoEnvio(Envio envio){
        return envio.calcularCosto(envio.getPeso(), envio.getDistancia());
    }
}

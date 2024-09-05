/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DELL
 */
public class EnvioEstandar extends Envio{

    public EnvioEstandar(double peso, double distancia) {
        super(peso, distancia);
    }

    @Override
    public double calcularCosto(double peso, double distancia) {
        return peso * 0.5 + distancia * 0.1;
    }
    
}

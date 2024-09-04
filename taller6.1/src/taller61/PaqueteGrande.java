/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller61;

/**
 *
 * @author DELL
 */
public class PaqueteGrande extends Paquete implements IPaqueteGrande{
    private double volumen;
    private String medioTransporte;

    public PaqueteGrande(double volumen, String medioTransporte, double peso, double dimenciones) {
        super(peso, dimenciones);
        this.volumen = volumen;
        this.medioTransporte = medioTransporte;
    }

    @Override
    public void calcularCostoEnvioGrande() {
        System.out.println("Costo envio grande calculado");
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller4;
import taller4.Factura;
/**
 *
 * @author DELL
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Factura factura = new Factura();
        Calculo calculoImpIva = new CalculoImpuestoIva("Doritos", 5, 7000);
        Calculo calculoImpResIva = new CalculoImpuestoReteIva("Doritos", 5, 7000);
        Calculo calculoImpSalud = new CalculoImpuestoSaludable("Doritos", 5, 7000);
        
        System.out.println("IVA " + factura.totalConImpuesto(calculoImpIva));
        System.out.println("Rete IVA " + factura.totalConImpuesto(calculoImpResIva));
        System.out.println("Salud " + factura.totalConImpuesto(calculoImpSalud));
    }
    
}

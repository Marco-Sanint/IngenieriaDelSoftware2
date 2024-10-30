/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta4;

/**
 *
 * @author DELL
 */
public class Main4 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CalcularImpuestosColombia cic = new CalcularImpuestosColombia();
        CalcularImpuestosEEUU cieu = new CalcularImpuestosEEUU();
        CalcularImpuestosFrancia cif = new CalcularImpuestosFrancia();
        
        cic.calcularImpuestos(0);
        cieu.calcularImpuestos(0);
        cif.calcularImpuestos(0);
    }
}

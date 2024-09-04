/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller61;

/**
 *
 * @author DELL
 */
public class Taller7 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaqueteGrande pg = new PaqueteGrande(10, "camion", 2.10, 3.04);
        PaquetePequeño ppq = new PaquetePequeño(13.98, 10, 54);
        PaquetePeligroso ppg = new PaquetePeligroso("Afilado", true, 10, 98);
        
        pg.calcularCostoEnvioGrande();
        ppq.calcularCostoEnvioPequeño();
        ppg.asegurarPaquetePeligroso();
        ppg.verificarContenidoPeligroso();
    }
    
}

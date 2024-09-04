/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller7;

/**
 *
 * @author DELL
 */
public class Taller7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IProcesarOrdenUPS procesarOrdenUps = new ProcesarOrdenUPS();
        IProcesarOrdenFedex procesarOrdenFedex = new ProcesarOrdenFedex();
        IProcesarOrdenHDL procesarOrdenHdl = new ProcesarOrdenHDL();
        
        SistemaEnvios sistemaEnvios = new SistemaEnvios(procesarOrdenUps, procesarOrdenFedex, procesarOrdenHdl);
        
        Orden orden = new Orden(null, "Universidad", "Casa");
        
        sistemaEnvios.enviarOrdenFedex(orden);
        sistemaEnvios.enviarOrdenHdl(orden);
        sistemaEnvios.enviarOrdenUPS(orden);
    }
    
}

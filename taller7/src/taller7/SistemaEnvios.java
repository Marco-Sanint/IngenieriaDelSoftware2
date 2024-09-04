/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7;

/**
 *
 * @author DELL
 */
public class SistemaEnvios {
    private IProcesarOrdenUPS procesarOrdenUps;
    private IProcesarOrdenFedex procesarOrdenFedex;
    private IProcesarOrdenHDL procesarOrdenHdl;

    public SistemaEnvios(IProcesarOrdenUPS procesarOrdenUps, IProcesarOrdenFedex procesarOrdenFedex, IProcesarOrdenHDL procesarOrdenHdl) {
        this.procesarOrdenUps = procesarOrdenUps;
        this.procesarOrdenFedex = procesarOrdenFedex;
        this.procesarOrdenHdl = procesarOrdenHdl;
    }    
    
    public void enviarOrdenUPS(Orden orden){
        procesarOrdenUps.enviarOrden(orden);
    }
    
    public void enviarOrdenFedex(Orden orden){
        procesarOrdenFedex.enviarOrden(orden);
    }
    
    public void enviarOrdenHdl(Orden orden){
        procesarOrdenHdl.enviarOrden(orden);
    }
}

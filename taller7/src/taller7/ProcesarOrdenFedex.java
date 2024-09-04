/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7;

/**
 *
 * @author DELL
 */
public class ProcesarOrdenFedex implements IProcesarOrdenFedex{

    @Override
    public void enviarOrden(Orden orden) {
        System.out.println(orden.getFecha());
        System.out.println(orden.getLogarDestino());
        System.out.println(orden.getLugarOrigen());
    }
}

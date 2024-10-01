/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Tienda {
    private List<Computador> computadoresAlmacen = new ArrayList<>();
    
    public void crearComputadora(String procesador, String tarjetaGrafica, int ram){
        Computador compu = new Computador(procesador, tarjetaGrafica, ram);
    }
    
    public void crearOrden(){
        
    }
}

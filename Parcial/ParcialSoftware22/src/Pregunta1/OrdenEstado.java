/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta1;

/**
 *
 * @author DELL
 */
public class OrdenEstado {
    public String obtenerEstado(int ordenId){
        
        
        
        if (ordenId < 0){
            return "Orden Invalida";
        } else if (ordenId == 0){
            return "Pendiente";
        } else {
            if(ordenId > 100){
                return "Completa";
            } else if (ordenId > 50){
                return "En progreso";
            } else {
                return "Pendiente";
            }
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9KISS;

import java.util.Arrays;

/**
 *
 * @author DELL
 */
public class GestorDeCadenas {
    public String inveritCadena(String cadena){
        StringBuilder sb = new StringBuilder(cadena);
        return sb.reverse().toString();
    }
    
    public int encontrarMayor(int[] numeros){
        return Arrays.stream(numeros).max().getAsInt();
    } 
}

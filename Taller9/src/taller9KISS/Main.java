/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller9KISS;


/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GestorDeCadenas gdc = new GestorDeCadenas();
        
        String texto = "Hola Mundo";
        String textoInvertido = gdc.inveritCadena(texto);
        System.out.println("Cadena invertida: " + textoInvertido);
        
        int[] numeros = {34, 12, 56, 78, 23, 90, 11};
        int mayor = gdc.encontrarMayor(numeros);
        System.out.println("El valor más alto en el arreglo es: " + mayor);
    }
    
}

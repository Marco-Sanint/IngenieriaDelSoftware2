/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller6;

/**
 *
 * @author DELL
 */
public class Dvd implements LibreriaDvd{
    private String nombre;
    private double tamaño;
    private String archivo;
    private int stock;

    public Dvd(String nombre, double tamaño, String archivo, int stock) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.archivo = archivo;
        this.stock = stock;
    }

    

    @Override
    public void prestar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void devolver() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}

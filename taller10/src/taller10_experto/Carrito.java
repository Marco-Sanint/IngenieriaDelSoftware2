/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_experto;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DELL
 */

public class Carrito {
    private Cliente coliente;
    private List<Libro> libros = new ArrayList<>();

    public Carrito(Cliente coliente) {
        this.coliente = coliente;
    }

    public void agregarLibro(Libro libro) {
        this.libros.add(libro);
    }

    public void removerLibro(Libro libro) {
        this.libros.remove(libro);
    }

    public List<Libro> getLibros() {
        return libros;
    }
}
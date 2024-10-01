/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller10_experto;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("1", "Marco", "Sanint", 20);
        
        Libro libro1 = new Libro("Título 1", "Autor 1", "ISBN 1", 10.99);
        Libro libro2 = new Libro("Título 2", "Autor 2", "ISBN 2", 9.99);
        
        Carrito carrito = new Carrito(cliente1);
        
        carrito.agregarLibro(libro1);
        carrito.agregarLibro(libro2);
        
        CalculadoraPrecios cp = new CalculadoraPrecios();
        
        double total= cp.calcularPrecioTotal(carrito);
        System.out.println(total);
    }
}

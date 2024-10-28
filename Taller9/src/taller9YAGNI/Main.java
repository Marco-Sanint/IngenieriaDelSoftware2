/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller9YAGNI;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro("Hola", "ola", 2020);
        Libro libro2 = new Libro("Chao", "adios", 2010);
        
        Biblioteca biblio = new Biblioteca();
        
        biblio.fase1AgregarLibro(libro1);
        biblio.fase2AgregarLibro(libro1);
        
        biblio.fase1AgregarLibro(libro2);
        biblio.fase2AgregarLibro(libro2);
    }
    
}

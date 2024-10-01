/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller_creador;

/**
 *
 * @author DELL
 */

public class Venta {
    private Entrada entrada;
    private Usuario usuario;

    public Venta(Entrada entrada, Usuario usuario) {
        this.entrada = entrada;
        this.usuario = usuario;
    }

    public void verificarEntrada(Entrada entrada) {
        if (entrada.isDisponible()) {
            entrada.setDisponible(false);
            System.out.println("Entrada comprada con éxito.");
            mostrarEntradas(entrada);
        } else {
            System.out.println("La entrada no está disponible.");
        }
    }

    public void mostrarEntradas(Entrada entrada) {
        System.out.println("ID: " + entrada.getId());
        System.out.println("Tipo: " + entrada.getTipo());
        System.out.println("Precio: " + entrada.getPrecio());
        System.out.println();
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_3_parcial;

/**
 *
 * @author DELL
 */

public class Main {
    public static void main(String[] args) {
        NuevoSistemaPago nuevoSistemaPago = new NuevoSistemaPago("John Doe", "123456789", "john.doe@example.com");
        NuevoSistemaPagoOperacion adapter = new NuevoSistemaPagoOperacion(nuevoSistemaPago);

        adapter.crearSesion();
        adapter.validarCorreo();
        adapter.ValidarAutorizacion();
        adapter.realizarPago();
    }
}

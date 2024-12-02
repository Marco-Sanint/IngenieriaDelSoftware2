/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_3_parcial;

/**
 *
 * @author DELL
 */
public class NuevoSistemaPagoOperacion {
    
    private NuevoSistemaPago nuevoSistemaPago;

    public NuevoSistemaPagoOperacion(NuevoSistemaPago nuevoSistemaPago) {
        this.nuevoSistemaPago = nuevoSistemaPago;
    }

    public void crearSesion() {
        System.out.println("CREANDO LA SESION A: " + nuevoSistemaPago.getNombre());
    }

    public void validarCorreo() {
        System.out.println("VALIDANDO EL CORREO: " + nuevoSistemaPago.getCorreo());
    }

    public void ValidarAutorizacion() {
        System.out.println("VALIDANDO AUTORIZACION");
    }

    public void realizarPago() {
        System.out.println("REALIZANDO EL PAGO");
    }
}
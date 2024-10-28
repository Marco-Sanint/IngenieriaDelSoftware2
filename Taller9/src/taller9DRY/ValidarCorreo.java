/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller9DRY;

/**
 *
 * @author DELL
 */
public class ValidarCorreo {
    public void validar(String correo) {
        if (!correo.contains("@") || !correo.contains(".")){
            System.out.println("Correo invalido");
        } else {
            System.out.println("Correo guardado");
        }
    }
}

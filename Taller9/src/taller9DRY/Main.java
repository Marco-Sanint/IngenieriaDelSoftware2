/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller9DRY;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String correo1 = "marco.sanint#gmail.com";
        String correo2 = "mateo.sanint@gmail.com";
        
        ValidarCorreo validarCorreo = new ValidarCorreo();
        
        validarCorreo.validar(correo1);
        validarCorreo.validar(correo2);
    }
    
}

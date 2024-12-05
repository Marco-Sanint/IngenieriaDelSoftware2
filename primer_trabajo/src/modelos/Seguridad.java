/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author DELL
 */
public class Seguridad{
    public String validarContraseña(String inputPassword, String realPassword){
        if (inputPassword.equals(realPassword))
            return "Contraseña correcta";
        return "Contraseña incorrecta";
    }
}

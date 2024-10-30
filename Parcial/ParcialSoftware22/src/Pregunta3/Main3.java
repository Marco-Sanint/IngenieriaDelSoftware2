/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pregunta3;

/**
 *
 * @author DELL
 */
public class Main3 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        FacturaFisica ff = new FacturaFisica("001", 0, cliente);
        FacturaElectronica fe = new FacturaElectronica("12345", "002", 0, cliente);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller5;

/**
 *
 * @author DELL
 */
public class Taller5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Producto p = new ProductoMixto(10, 12.5, "Pesa de 10 kg", 30000, 5);
        Inventario inv = new Inventario();
        
        inv.calcularCostoTotal(p);
        
        ProductoFisico pf = new ProductoFisico(10, "Pesa 10 kg", 30000, 10);
        MandarProducto mp = new MandarProducto();
        
        mp.enviarProducto(pf, "carrera y calle");
    }
    
}

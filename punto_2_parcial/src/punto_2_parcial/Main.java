/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_2_parcial;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        HamburguesaBuilder builder = new HamburguesaBuilderImp();
        Hamburguesa hamburguesa = builder
            .setTipoTomate("Tomate Cherry")
            .setTipoCarne("Carne de Res")
            .setTipoQueso("Queso Cheddar")
            .setTipoPan("Pan integral")
            .build();

        System.out.println("Hamburguesa creada con:");
        System.out.println("Tipo de Tomate: " + hamburguesa.getTipoTomate());
        System.out.println("Tipo de Carne: " + hamburguesa.getTipoCarne());
        System.out.println("Tipo de Queso: " + hamburguesa.getTipoQueso());
        System.out.println("Tipo de Pan: " + hamburguesa.getTipoPan());
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prunto_5_parcial;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        Computador computador = new Computador();
        Celular celular = new Celular();
        Invoker invoker = new Invoker();

        invoker.setComando(new ComandoEncenderCompu(computador));
        invoker.ejecutarComando();

        invoker.setComando(new ComandoReiniciarCompu(computador));
        invoker.ejecutarComando();

        invoker.setComando(new ComandoEncenderCel(celular));
        invoker.ejecutarComando();
    }
}
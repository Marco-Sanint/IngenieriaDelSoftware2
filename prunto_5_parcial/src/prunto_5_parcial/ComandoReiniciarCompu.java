/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prunto_5_parcial;

/**
 *
 * @author DELL
 */
public class ComandoReiniciarCompu implements Comando {
    private Computador computador;

    public ComandoReiniciarCompu(Computador computador) {
        this.computador = computador;
    }

    @Override
    public void execute() {
        computador.reiniciar();
    }
}
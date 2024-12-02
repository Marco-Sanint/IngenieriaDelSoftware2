/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prunto_5_parcial;

/**
 *
 * @author DELL
 */
public class ComandoEncenderCel implements Comando{
    private Celular celular;

    public ComandoEncenderCel(Celular celular) {
        this.celular = celular;
    }

    @Override
    public void execute() {
        celular.encender();
    }
}

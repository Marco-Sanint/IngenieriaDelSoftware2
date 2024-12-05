/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package patron_command;

/**
 *
 * @author DELL
 */
public class BombillaApagadoComando implements Comando{
    private Bombilla bombilla;
    
    public BombillaApagadoComando(Bombilla bombilla){
        this.bombilla = bombilla;
    }

    @Override
    public void ejecutar() {
       bombilla.apagar();
    }
}
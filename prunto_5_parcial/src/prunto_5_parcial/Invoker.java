/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prunto_5_parcial;

/**
 *
 * @author DELL
 */
public class Invoker {
    private Comando comando;

    public void ejecutarComando() {
        if (getComando() != null) {
            getComando().execute();
        }
    }

    /**
     * @return the comando
     */
    public Comando getComando() {
        return comando;
    }

    /**
     * @param comando the comando to set
     */
    public void setComando(Comando comando) {
        this.comando = comando;
    }
    
}

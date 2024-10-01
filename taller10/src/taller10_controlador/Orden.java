/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller10_controlador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DELL
 */
public class Orden {
    private List<Computador> computadores = new ArrayList<>();

    public void agregarComputador(Computador computador) {
        computadores.add(computador);
    }

    public void eliminarComputador(Computador computador) {
        computadores.remove(computador);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Factura {
    private ArrayList<String> lista = new ArrayList<>();

    public Factura(ArrayList<String> lista) {
        this.lista = lista;
    }

    /**
     * @return the lista
     */
    public ArrayList<String> getLista() {
        return lista;
    }

    /**
     * @param lista the lista to set
     */
    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }
    
}

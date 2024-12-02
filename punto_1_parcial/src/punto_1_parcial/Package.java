/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_1_parcial;

/**
 *
 * @author DELL
 */
public abstract class Package {
    protected String type;

    public Package(String type) {
        this.type = type;
    }

    public abstract void send();
}
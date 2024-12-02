/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_1_parcial;

/**
 *
 * @author DELL
 */
public class ServicioEnvio {
    private PackageFactory factory;

    public ServicioEnvio(PackageFactory factory) {
        this.factory = factory;
    }

    public void enviarFormaExpress(String type) {
        Package pkg = factory.createPackage(type);
        pkg.send();
    }

    public void enviarFormaRegular(String type) {
        Package pkg = factory.createPackage(type);
        pkg.send();
    }
}
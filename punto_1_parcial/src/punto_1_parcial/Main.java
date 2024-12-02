/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_1_parcial;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
        
        PackageFactory expressFactory = new ExpressPackageFactory();
        PackageFactory regularFactory = new RegularPackageFactory();
        
        ServicioEnvio servicioEnvioExpress = new ServicioEnvio(expressFactory);
        ServicioEnvio servicioEnvioRegular = new ServicioEnvio(regularFactory);
        
        servicioEnvioExpress.enviarFormaExpress("Documentos Urgentes");
        servicioEnvioRegular.enviarFormaRegular("Libros");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_1_parcial;

/**
 *
 * @author DELL
 */
public class ExpressPackageFactory implements PackageFactory{
    
    @Override
    public Package createPackage(String type) {
        return new ExpressPackage(type);
    }
}
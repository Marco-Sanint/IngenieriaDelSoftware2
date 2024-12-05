/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractfactory;

/**
 *
 * @author DELL
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BotónFactory factory;
        if (System.getProperty(os.name).equals("Windows")){
            factory = new BotónWindows();
        }else {
            factory = new BotónMac();
        }
        Botón botón = facroty.crearBotón();
        botón.paint();
    }
    
}
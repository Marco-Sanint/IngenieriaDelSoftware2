/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_4_parcial;

/**
 *
 * @author DELL
 */
public class Configuracion {
    private static Configuracion instance;
    
    private String url;
    private String usuario;
    private String password;

    private Configuracion(String url, String usuario, String password) {
        this.url = "URL";
        this.usuario = "Marco";
        this.password = "Hola123";
    }
    
    static Configuracion getInstance() {
        if (instance == null) {
            instance = new Configuracion("URL", "Marco", "Hola123");
        }
        return instance;
    }


    /**
     * @return the url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url the url to set
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    


}
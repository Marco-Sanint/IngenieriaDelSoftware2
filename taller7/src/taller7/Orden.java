/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller7;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class Orden {
    private Date fecha;
    private String lugarOrigen;
    private String logarDestino;

    public Orden(Date fecha, String lugarOrigen, String logarDestino) {
        this.fecha = fecha;
        this.lugarOrigen = lugarOrigen;
        this.logarDestino = logarDestino;
    }

    /**
     * @return the fecha
     */
    public Date getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the lugarOrigen
     */
    public String getLugarOrigen() {
        return lugarOrigen;
    }

    /**
     * @param lugarOrigen the lugarOrigen to set
     */
    public void setLugarOrigen(String lugarOrigen) {
        this.lugarOrigen = lugarOrigen;
    }

    /**
     * @return the logarDestino
     */
    public String getLogarDestino() {
        return logarDestino;
    }

    /**
     * @param logarDestino the logarDestino to set
     */
    public void setLogarDestino(String logarDestino) {
        this.logarDestino = logarDestino;
    }
    
    
}

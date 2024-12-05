/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package patron_mediator;

/**
 *
 * @author DELL
 */
public interface Mediator {
    public void enviar(String mensaje, Participante participante);

    public void enviar(String mensaje, Usuario aThis);
}
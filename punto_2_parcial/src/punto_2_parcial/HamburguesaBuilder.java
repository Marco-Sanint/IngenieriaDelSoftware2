/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package punto_2_parcial;

/**
 *
 * @author DELL
 */
public interface HamburguesaBuilder {
    HamburguesaBuilder setTipoTomate(String tipoTomate);
    HamburguesaBuilder setTipoCarne(String tipoCarne);
    HamburguesaBuilder setTipoQueso(String tipoQueso);
    HamburguesaBuilder setTipoPan(String tipoPan);
    Hamburguesa build();
}

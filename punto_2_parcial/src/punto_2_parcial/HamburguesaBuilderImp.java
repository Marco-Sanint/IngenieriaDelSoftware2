/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package punto_2_parcial;

/**
 *
 * @author DELL
 */
public class HamburguesaBuilderImp implements HamburguesaBuilder {
    private String tipoTomate;
    private String tipoCarne;
    private String tipoQueso;
    private String tipoPan;

    @Override
    public HamburguesaBuilder setTipoTomate(String tipoTomate) {
        this.tipoTomate = tipoTomate;
        return this;
    }

    @Override
    public HamburguesaBuilder setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
        return this;
    }

    @Override
    public HamburguesaBuilder setTipoQueso(String tipoQueso) {
        this.tipoQueso = tipoQueso;
        return this;
    }

    @Override
    public HamburguesaBuilder setTipoPan(String tipoPan) {
        this.tipoPan = tipoPan;
        return this;
    }

    @Override
    public Hamburguesa build() {
        return new Hamburguesa(tipoTomate, tipoCarne, tipoQueso, tipoPan);
    }
}

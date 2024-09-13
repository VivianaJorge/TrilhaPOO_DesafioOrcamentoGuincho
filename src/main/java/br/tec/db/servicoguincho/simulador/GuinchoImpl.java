package br.tec.db.servicoguincho.simulador;

import br.tec.db.servicoguincho.simulador.cargas.TipoGuincho;

public class GuinchoImpl implements Guincho{

    double custoDesloc = 0;
    TipoGuincho guincho;


    public GuinchoImpl(TipoGuincho guincho) {
        this.guincho = guincho;
    }

    public double getCustoDesloc() {
        return custoDesloc;
    }

    public void setCustoDesloc(double custoDesloc) {
        this.custoDesloc = custoDesloc;
    }

    public TipoGuincho getGuincho() {
        return guincho;
    }

    public void setGuincho(TipoGuincho guincho) {
        this.guincho = guincho;
    }

    @Override
    public double calcularCustoDeslocamento(Trajeto trajeto) {
        if(getGuincho().equals(TipoGuincho.CORRENTEEGANCHO)){
            custoDesloc = 2;
        } else if(getGuincho().equals(TipoGuincho.PLATAFORMA)){
            custoDesloc = 5;
        } else if (getGuincho().equals(TipoGuincho.REBOQUEINTEGRADO)){
            custoDesloc = 10;
        }
        return custoDesloc;
    }
}

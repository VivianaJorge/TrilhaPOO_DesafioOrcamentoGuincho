package br.tec.db.servicoguincho.simulador;

import br.tec.db.servicoguincho.simulador.cargas.Rota;

public class TrajetoImpl implements Trajeto{
    Integer distanciaEmKm = 0;
    Rota rota;

    public TrajetoImpl(Rota rota) {
        if (rota == Rota.CPARAC){
            distanciaEmKm = 5;
        }else if (rota == Rota.APARAB) {
            distanciaEmKm = 8;
        }else if (rota == Rota.CPARAA){
            distanciaEmKm = 10;
        }else if (rota == Rota.CPARAB){
            distanciaEmKm = 15;
        }
        setDistanciaEmKm(distanciaEmKm);
    }

    public void setDistanciaEmKm(Integer distanciaEmKm) {
        this.distanciaEmKm = distanciaEmKm;
    }

    @Override
    public Integer getDistanciaEmKM() {
        return distanciaEmKm;
    }
}

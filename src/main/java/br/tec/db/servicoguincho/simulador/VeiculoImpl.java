package br.tec.db.servicoguincho.simulador;

import br.tec.db.servicoguincho.simulador.cargas.EstadoConservacao;
import br.tec.db.servicoguincho.simulador.cargas.TipoVeiculo;

public class VeiculoImpl implements Veiculo{

    TipoVeiculo tipoVeiculo;
    EstadoConservacao estadoConservacao;

    public VeiculoImpl(TipoVeiculo tipoVeiculo, EstadoConservacao estadoConservacao) {
        this.tipoVeiculo = tipoVeiculo;
        this.estadoConservacao = estadoConservacao;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }

    public void setEstadoConservacao(EstadoConservacao estadoConservacao) {
        this.estadoConservacao = estadoConservacao;
    }

    @Override
    public TipoVeiculo getTipo() {
        return tipoVeiculo;
    }

    @Override
    public EstadoConservacao getEstado() {
        return estadoConservacao;
    }

}

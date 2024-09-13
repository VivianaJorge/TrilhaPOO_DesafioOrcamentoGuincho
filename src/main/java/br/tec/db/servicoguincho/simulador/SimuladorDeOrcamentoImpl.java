package br.tec.db.servicoguincho.simulador;
public class SimuladorDeOrcamentoImpl implements SimuladorDeOrcamento{

    Veiculo veiculo;
    Trajeto trajeto;
    Guincho guincho;

    public SimuladorDeOrcamentoImpl() {
        this.veiculo = veiculo;
        this.trajeto = trajeto;
        this.guincho = guincho;
    }

    @Override
    public double calcularCustoTotal(Veiculo veiculo, Trajeto trajeto, Guincho guincho) {
          double custoTotal = trajeto.getDistanciaEmKM() * guincho.calcularCustoDeslocamento(trajeto);
          return custoTotal;
    }
}

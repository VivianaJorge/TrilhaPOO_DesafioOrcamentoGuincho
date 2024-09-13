package br.tec.db.servicoguincho;

import br.tec.db.servicoguincho.simulador.*;
import br.tec.db.servicoguincho.simulador.cargas.TipoGuincho;

import java.text.DecimalFormat;

import static br.tec.db.servicoguincho.simulador.cargas.EstadoConservacao.NOVO;
import static br.tec.db.servicoguincho.simulador.cargas.EstadoConservacao.QUEBRADO;
import static br.tec.db.servicoguincho.simulador.cargas.Rota.*;
import static br.tec.db.servicoguincho.simulador.cargas.TipoVeiculo.*;

public class Main {

    public static void main(String[] args) {

        // Cenário 1 -  carro novo - do centro para o bairro A
        //  SimuladorDeOrcamento simulador; // instanciar implementação de simulaodr
        //Veiculo carroNovo; // instanciar implementação de veiculo
        //Trajeto centroParaBairroA; // instanciar trajeto
        //double custoCenario1 = simulador.calcularCustoTotal(carroNovo, centroParaBairroA);
        //System.out.println("Cenário 1 - Custo Total do Serviço: R$" + custoCenario1);

    //    Cenário 1 -  carro novo - do centro para o bairro A
        SimuladorDeOrcamento simulador = new SimuladorDeOrcamentoImpl();
        VeiculoImpl veiculo = new VeiculoImpl(CARRO, NOVO);
        Trajeto trajeto = new TrajetoImpl(CPARAA);
        Guincho guincho = new GuinchoImpl(TipoGuincho.PLATAFORMA);
        double custoCenario1 = simulador.calcularCustoTotal(veiculo, trajeto, guincho);
        String resultado = String.format("%.2f", custoCenario1);
        System.out.println("Cenário 1 - Custo Total do Serviço: R$ " + resultado);

    //    Cenário 2 -  ônibus quebrado - do bairro A para o bairro B
        SimuladorDeOrcamento simuladoronibus = new SimuladorDeOrcamentoImpl();
        VeiculoImpl veiculopesado = new VeiculoImpl(ONIBUS, QUEBRADO);
        Trajeto trajeto2 = new TrajetoImpl(APARAB);
        Guincho guincho2 = new GuinchoImpl(TipoGuincho.CORRENTEEGANCHO);
        double custoCenario2 = simuladoronibus.calcularCustoTotal(veiculopesado, trajeto2, guincho2);
        String resultado2 = String.format("%.2f", custoCenario2);
        System.out.println("Cenário 2 - Custo Total do Serviço: R$ " + resultado2);


    //    Cenário 3 -  caminhão - do centro para o bairro B
        SimuladorDeOrcamento simuladorcaminhao = new SimuladorDeOrcamentoImpl();
        VeiculoImpl caminhao = new VeiculoImpl(CAMINHAO, NOVO);
        Trajeto trajeto3 = new TrajetoImpl(CPARAB);
        Guincho guincho3 = new GuinchoImpl(TipoGuincho.REBOQUEINTEGRADO);
        double custoCenario3 = simuladorcaminhao.calcularCustoTotal(caminhao, trajeto3, guincho3);
        String resultado3 = String.format("%.2f", custoCenario3);
        System.out.println("Cenário 3 - Custo Total do Serviço: R$ " + resultado3);
    }
}

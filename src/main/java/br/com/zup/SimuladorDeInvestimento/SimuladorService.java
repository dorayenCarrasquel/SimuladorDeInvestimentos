package br.com.zup.SimuladorDeInvestimento;

import br.com.zup.SimuladorDeInvestimento.DTO.SimuladorDTO;
import br.com.zup.SimuladorDeInvestimento.DTO.InvestimentoDTO;
import br.com.zup.SimuladorDeInvestimento.Exception.SimulacaoException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimuladorService {
    private List<InvestimentoDTO> investimentos = new ArrayList<>();


    public void salvaSimulação(InvestimentoDTO investimentoDTO){
        investimentos.add(investimentoDTO);
    }

    public double calcularTaxaJuros(InvestimentoDTO investiendo){
        double taxaJuros = 1+ (Math.pow(investiendo.getRisco().getTaxaRetorno(),
                investiendo.getPeriodoDeAplicacaoMeses()));

        return taxaJuros;
    }
    public double calcularMontanteInicial(InvestimentoDTO investiendo){
         double montante = investiendo.getValorInvestido() * calcularTaxaJuros(investiendo);
         return montante;
    }

    public double calcularJurosCompostos(InvestimentoDTO investimento){
        double jurosCompostos = calcularMontanteInicial(investimento) - investimento.getValorInvestido();
        return jurosCompostos;
    }

    public double calcularMontante (InvestimentoDTO investimento){
        double montante = investimento.getValorInvestido() + calcularJurosCompostos(investimento);

        return montante;
    }

    public SimuladorDTO calcularSimulacao(InvestimentoDTO investimentoDTO){
        SimuladorDTO simulando = new SimuladorDTO();
        simulando.setValorInvestido(investimentoDTO.getValorInvestido());
        simulando.setValorTotalDolucro(calcularMontante(investimentoDTO));
        simulando.setValorTotal(simulando.getValorInvestido()+simulando.getValorTotalDolucro());
        if (investimentoDTO.getValorInvestido()< 5000 && investimentoDTO.getRisco().equals("ALTO")){
            throw new SimulacaoException("Minimo  da Simulação não permitido");
        }
        return simulando;

    }

}

package br.com.zup.SimuladorDeInvestimento;

import br.com.zup.SimuladorDeInvestimento.DTO.SimuladorDTO;
import br.com.zup.SimuladorDeInvestimento.DTO.InvestimentoDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SimuladorService {
    private List<InvestimentoDTO> investimentos = new ArrayList<>();
    private List<SimuladorDTO>simulacao = new ArrayList<>();

    public void salvaSimulação(InvestimentoDTO investimentoDTO){
        investimentos.add(investimentoDTO);
    }

    public double calcularTaxaJuros(InvestimentoDTO investiendo){
        double taxaJuros = 1+ (Math.pow(investiendo.getRisco().getTaxaRetorno(),investiendo.getPeriodoDeAplicacaoMeses()));

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

    public SimuladorDTO calcularSimulacao(InvestimentoDTO investimentoDTO, SimuladorDTO simulando){
        simulando.setValorInvestido(investimentoDTO.getValorInvestido());
        simulando.setValorTotalDolucro(calcularMontante(investimentoDTO));
        simulando.setValorTotal(simulando.getValorInvestido()+simulando.getValorTotalDolucro());
        return simulando;

    }

}

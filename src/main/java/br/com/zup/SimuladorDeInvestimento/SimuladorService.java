package br.com.zup.SimuladorDeInvestimento;

import br.com.zup.SimuladorDeInvestimento.DTO.SimuladorDTO;
import br.com.zup.SimuladorDeInvestimento.DTO.InvestimentoDTO;

import java.util.ArrayList;
import java.util.List;

public class SimuladorService {
    private List<InvestimentoDTO>investimentoInicial = new ArrayList<>();
    private List<SimuladorDTO>simulacao = new ArrayList<>();

    public double calcularTaxaJuros(InvestimentoDTO investiendo){
        double taxaJuros = 1+ (Math.pow(investiendo.getRisco().getTaxaRetorno(),investiendo.getPeriodoDeAplicacaoMeses()));

        return taxaJuros;
    }
    public double calcularMontanteInicial(InvestimentoDTO investiendo){
         double montante = investiendo.getValorInvestido() * calcularTaxaJuros(investiendo);
         return montante;
    }





}

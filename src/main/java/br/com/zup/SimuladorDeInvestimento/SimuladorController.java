package br.com.zup.SimuladorDeInvestimento;

import br.com.zup.SimuladorDeInvestimento.DTO.InvestimentoDTO;
import br.com.zup.SimuladorDeInvestimento.DTO.SimuladorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.validation.Valid;

@RestController
@RequestMapping("/investir")
public class SimuladorController {
    @Autowired
    private SimuladorService simuladorService;


    @PutMapping
    public SimuladorDTO simularInvestimento(@RequestBody @Valid InvestimentoDTO investimentoDTO){
       SimuladorDTO simuladorDTO = simuladorService.calcularSimulacao(investimentoDTO);
       simuladorService.salvaSimulação(investimentoDTO);
       return simuladorDTO;
    }
}

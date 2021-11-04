package br.com.zup.SimuladorDeInvestimento;

import br.com.zup.SimuladorDeInvestimento.DTO.InvestimentoDTO;
import br.com.zup.SimuladorDeInvestimento.DTO.SimuladorDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/investir")
public class SimuladorController {
    @Autowired
    private SimuladorService simuladorService;


    @PutMapping
    public SimuladorDTO simularInvestimento(@RequestBody InvestimentoDTO investimentoDTO){
       SimuladorDTO simuladorDTO = simuladorService.calcularSimulacao(investimentoDTO);
       return simuladorDTO;
    }
}

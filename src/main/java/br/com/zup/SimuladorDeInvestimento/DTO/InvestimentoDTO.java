package br.com.zup.SimuladorDeInvestimento.DTO;

import org.hibernate.validator.constraints.br.CNPJ;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

public class InvestimentoDTO {
    @Email(message = "Email não valido")
    private String email;
    @NotBlank(message = "Nome em branco")
    private String nome;
    @CPF(message = "CPF não Valido")
    private String cpf;
    private double valorInvestido;
    @Min(value = 2, message = "Minimo não permitido")
    private int periodoDeAplicacaoMeses;
    private Risco risco;
    public InvestimentoDTO() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public int getPeriodoDeAplicacaoMeses() {
        return periodoDeAplicacaoMeses;
    }

    public void setPeriodoDeAplicacaoMeses(int periodoDeAplicacaoMeses) {
        this.periodoDeAplicacaoMeses = periodoDeAplicacaoMeses;
    }

    public Risco getRisco() {
        return risco;
    }

    public void setRisco(Risco risco) {
        this.risco = risco;
    }
}

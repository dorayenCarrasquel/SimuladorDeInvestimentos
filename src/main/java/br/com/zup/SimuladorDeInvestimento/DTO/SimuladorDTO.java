package br.com.zup.SimuladorDeInvestimento.DTO;

public class SimuladorDTO {
    private double valorInvestido;
    private double valorTotalDolucro;
    private double valorTotal;

    public SimuladorDTO() {
    }

    public double getValorInvestido() {
        return valorInvestido;
    }

    public SimuladorDTO(double valorInvestido, double valorTotalDolucro, double valorTotal) {
        this.valorInvestido = valorInvestido;
        this.valorTotalDolucro = valorTotalDolucro;
        this.valorTotal = valorTotal;
    }

    public void setValorInvestido(double valorInvestido) {
        this.valorInvestido = valorInvestido;
    }

    public double getValorTotalDolucro() {
        return valorTotalDolucro;
    }

    public void setValorTotalDolucro(double valorTotalDolucro) {
        this.valorTotalDolucro = valorTotalDolucro;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}

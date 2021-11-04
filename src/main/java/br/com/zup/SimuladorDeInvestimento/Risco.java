package br.com.zup.SimuladorDeInvestimento;

public enum Risco {
    ALTO(2.5), MEDIO(0.0015), BAIXO(0.0005);
    private double taxaRetorno;

    Risco(double taxaRetorno) {
        this.taxaRetorno = taxaRetorno;
    }

    public double getTaxaRetorno() {
        return taxaRetorno;
    }


}

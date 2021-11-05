package br.com.zup.SimuladorDeInvestimento.Exception;

public class SimulacaoException extends RuntimeException{

    public SimulacaoException() {
    }

    public SimulacaoException(String message) {
        super(message);
    }

    public SimulacaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public SimulacaoException(Throwable cause) {
        super(cause);
    }

    public SimulacaoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}

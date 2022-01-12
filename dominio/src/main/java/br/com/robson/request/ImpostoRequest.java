package br.com.robson.request;

public class ImpostoRequest {
    public Double valor;

    @Deprecated
    public ImpostoRequest() {
    }

    public ImpostoRequest(Double valor) {
        this.valor = valor;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}

package br.com.robson.response;

import br.com.robson.dominio.Imposto;

public class ImpostoResponse {
    public Double valor;
    public Boolean ehRoubo;
    public ImpostoResponse(Imposto imposto) {
        this.valor = imposto.getValor();
        this.ehRoubo = imposto.getEhRoubo();
    }

    @Deprecated
    public ImpostoResponse() {
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Boolean getEhRoubo() {
        return ehRoubo;
    }

    public void setEhRoubo(Boolean ehRoubo) {
        this.ehRoubo = ehRoubo;
    }
}

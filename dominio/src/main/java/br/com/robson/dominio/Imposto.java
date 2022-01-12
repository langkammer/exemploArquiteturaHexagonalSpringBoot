package br.com.robson.dominio;

import br.com.robson.ImpostoInterface;

public abstract class Imposto implements ImpostoInterface {
    public Double valor;
    public Boolean ehRoubo;

    public Double getValor() {
        return valor;
    }

    public Boolean getEhRoubo() {
        return ehRoubo;
    }
}

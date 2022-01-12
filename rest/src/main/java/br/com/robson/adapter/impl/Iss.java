package br.com.robson.adapter.impl;

import br.com.robson.dominio.Imposto;

public class Iss extends Imposto {
    @Override
    public void calcula(Double valor) {
        //REGRA ALEATORIA DE UM BUROCRATA ESTATAL
        this.valor = valor * 0.05;
    }

    @Override
    public void ehRoubo() {
        this.ehRoubo = true;
    }
}
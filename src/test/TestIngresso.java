package test;

import models.Ingresso;

public class TestIngresso {
    public static void main(String[] args) {
        deveImprimirOValorDoIngresso();
    }

    public static void deveImprimirOValorDoIngresso(){
        Ingresso ingresso = new Ingresso();
        ingresso.imprimeValor();
    }
}

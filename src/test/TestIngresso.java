package test;

import models.Ingresso;
import models.Vip;

public class TestIngresso {
    public static void main(String[] args) {
        System.out.println("------- ingresso normal--------");
        deveImprimirOValorDoIngresso();
        System.out.println("------- ingresso Vip--------");
        deveImprimirOValorDoIngressoVip();
    }

    public static void deveImprimirOValorDoIngresso(){
        Ingresso ingresso = new Ingresso();
        System.out.println(ingresso.imprimeValor());
    }

    public static void deveImprimirOValorDoIngressoVip(){
        Vip vip = new Vip();
        System.out.println(vip.getIngressoVip());
    }
}

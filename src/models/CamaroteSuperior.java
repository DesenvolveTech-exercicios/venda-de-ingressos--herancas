package models;

public class CamaroteSuperior {
    private final double valorAdicional = 21.30;
    public void IngressoVip(){
        double valor = valorAdicional + new Vip().getIngressoVip();
        System.out.println(valor);
    }
}

package models;

public class CamaroteSuperior extends Vip{
    private final double valorAdicional = 21.30;

    public String IngressoVip(){
        double valor = valorAdicional + new Vip().getIngressoVip();
        return Double.toString(valor);
    }
}

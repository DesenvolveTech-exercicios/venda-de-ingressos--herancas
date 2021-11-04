package models;

public class Vip extends Ingresso{
    private final double valorAdicional = 30.50;

    public void IngressoVip(){
        double valorVip = Ingresso.valorIngresso + valorAdicional;
        System.out.println(valorVip);
    }
    public double getIngressoVip(){
        double valorVip = Ingresso.valorIngresso + valorAdicional;
        return valorVip;
    }
}

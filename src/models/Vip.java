package models;

public class Vip extends Ingresso{
    private final double valorAdicional = 30.50;
    private double valorVip = Ingresso.valorIngresso + valorAdicional;

    public double getIngressoVip(){
        return valorVip;
    }
}

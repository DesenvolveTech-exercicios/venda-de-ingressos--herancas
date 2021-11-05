package models;

import java.util.Random;

public class CamaroteInferior extends Vip {
    private int Poltrona = new Random().nextInt(200);

    public int getPoltrona() {
        return Poltrona;
    }

    public void imprimePoltrona(){
        System.out.println("sua poltrona no camarote inferior é: " + Poltrona);
    }
}

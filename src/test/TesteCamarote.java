package test;

import models.CamaroteInferior;

public class TesteCamarote {
    public static void main(String[] args) {
        System.out.println("------numero da poltrona no camarote inferior -------");
        deveImprimirONumeroDaPoltronaNoCamaroteInferior();
    }

    public static void deveImprimirONumeroDaPoltronaNoCamaroteInferior(){
        CamaroteInferior camaroteInferior = new CamaroteInferior();
        camaroteInferior.imprimePoltrona();
    }
}

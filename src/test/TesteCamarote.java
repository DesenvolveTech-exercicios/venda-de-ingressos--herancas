package test;

import models.CamaroteInferior;
import models.CamaroteSuperior;

public class TesteCamarote {
    public static void main(String[] args) {
        System.out.println("------numero da poltrona no camarote inferior -------");
        deveImprimirONumeroDaPoltronaNoCamaroteInferior();
        System.out.println("------Valor do camarote superior-------");
        deveImprimirOValorDoIngressoDOCamaroteSuperior();
    }

    public static void deveImprimirONumeroDaPoltronaNoCamaroteInferior(){
        CamaroteInferior camaroteInferior = new CamaroteInferior();
        camaroteInferior.imprimePoltrona();
    }

    public static void deveImprimirOValorDoIngressoDOCamaroteSuperior(){
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior();
        System.out.println(camaroteSuperior.IngressoVip());
    }
}

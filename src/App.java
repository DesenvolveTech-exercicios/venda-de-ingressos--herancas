import models.CamaroteInferior;
import models.CamaroteSuperior;
import models.Ingresso;

import javax.swing.*;

public class App {
    public static void main(String[] args) {
        String escolha = JOptionPane.showInputDialog(
                "------Venda de ingressos------\n" +
                        "digite 1 para o ingresso normal\n" +
                        "digite 2 para o ingresso VIP"
        );

        switch(escolha){
            case "1":
                JOptionPane.showMessageDialog(null,
                        "O valor do seu ingresso é: " + new Ingresso().imprimeValor());
                break;

            case "2":
                String camarote = JOptionPane.showInputDialog(
                        "digite 1 para o camarote superior\n" +
                        "digite 2 para o camarote inferior");
                if (camarote.equals("1")) {
                    JOptionPane.showMessageDialog(null,
                            "O valor do seu ingresso vip no camarote superior é: " +
                            new CamaroteSuperior().IngressoVip());
                }else{
                    CamaroteInferior inferior = new CamaroteInferior();
                    JOptionPane.showMessageDialog(null,
                            "O valor do seu ingresso vip no camarote inferior é: " +
                                    inferior.getIngressoVip() + "\nNumero da poltrona: " +
                            inferior.getPoltrona());
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "venda cancelada");
        }

    }
}

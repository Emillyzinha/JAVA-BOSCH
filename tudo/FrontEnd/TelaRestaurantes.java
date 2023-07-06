package FrontEnd;

import BackEnd.Aplicativo;
import BackEnd.Restaurante;
import Componentes.BotaoVoltar;
import Componentes.Janela;
import Componentes.Label;

import javax.swing.*;
import java.util.ArrayList;

public class TelaRestaurantes extends JFrame {
    Janela janela = new Janela("Tela de Restaurante", "src/Imagens/TelaTodosRestaurantes.png");
    Aplicativo aplicativo;

    public TelaRestaurantes(Aplicativo aplicativo) {
//        ArrayList<Restaurante> oi = new ArrayList<>();
//        AdicionarRestaurantes adicionarRestaurantes = new AdicionarRestaurantes(oi);
        this.aplicativo = aplicativo;

        janela.setVisible(true);
//        adicionarRestaurantes.janela.setVisible(false);
        BotaoVoltar botaoVoltar = new BotaoVoltar();
        botaoVoltar.addActionListener(e -> telaAnterior());

        Label label = new Label("TESTE", 150);
        Label label2 = new Label("TESTE", 190);

        janela.add(botaoVoltar);
        janela.add(label);
        janela.add(label2);
        janela.add(new JScrollPane());
    }

    private void telaAnterior() {
        AplicativoCompleto aplicativoCompleto = new AplicativoCompleto();
        janela.dispose();
        aplicativoCompleto.setVisible(true);
    }

}

package FrontEnd;

import BackEnd.Aplicativo;
import BackEnd.Restaurante;
import Componentes.Botao;
import Componentes.BotaoVoltar;
import Componentes.Janela;

import javax.swing.*;
import java.util.ArrayList;

public class OpcaoRestaurante extends JFrame {

    Janela janela = new Janela("Tela Restaurante", "src/Imagens/TelaOpcaoRestaurante.png");
    public OpcaoRestaurante() {
        Botao botaoAdcRestaurantes = new Botao(70, 545);
        Botao botaoAdcLanche = new Botao(70, 608);

        botaoAdcRestaurantes.addActionListener(e -> janela.dispose());
        botaoAdcLanche.addActionListener(e -> janela.dispose());
        BotaoVoltar botaoVoltar = new BotaoVoltar();
        botaoVoltar.addActionListener(e -> telaAnterior());

        janela.add(botaoAdcRestaurantes);
        janela.add(botaoAdcLanche);
        janela.add(botaoVoltar);
        janela.setVisible(true);
    }

    private void telaAnterior () {
        janela.dispose();
        AplicativoCompleto aplicativoCompleto = new AplicativoCompleto();
        aplicativoCompleto.setVisible(true);
    }
}

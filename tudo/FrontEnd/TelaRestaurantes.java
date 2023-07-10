package FrontEnd;

import BackEnd.Aplicativo;
import BackEnd.Lanche;
import BackEnd.Restaurante;
import Componentes.Botao;
import Componentes.BotaoVoltar;
import Componentes.Janela;
import Componentes.Label;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.*;

public class TelaRestaurantes extends JFrame {
    Janela janela = new Janela("Tela de Restaurante", "src/Imagens/TelaTodosRestaurantes.png");
    Aplicativo aplicativo;

    Map<Restaurante, ArrayList<Lanche>> restauranteELanche;
    JComboBox<String> comboBoxRestaurante;

    public TelaRestaurantes(Aplicativo aplicativo, Map<Restaurante, ArrayList<Lanche>> restauranteELanche) {
        this.restauranteELanche = restauranteELanche;
        this.aplicativo = aplicativo;

        janela.setVisible(true);
        BotaoVoltar botaoVoltar = new BotaoVoltar();
        botaoVoltar.addActionListener(e -> telaAnterior());

        comboBoxRestaurante = new JComboBox<>(new Vector<>(aplicativo.nomeRestaurante()));
        comboBoxRestaurante.setBounds(26, 150, 250, 40);

        Botao botaoEscolherLanche = new Botao(70, 446);
        botaoEscolherLanche.addActionListener(e -> escolherLanche());

        janela.add(botaoVoltar);
        janela.add(botaoEscolherLanche);
        comboBoxRestaurante.setVisible(true);
        janela.add(comboBoxRestaurante);
        janela.add(new JScrollPane());
    }

    private void escolherLanche() {
        String restauranteEscolhido = comboBoxRestaurante.getItemAt(comboBoxRestaurante.getSelectedIndex());

        ArrayList<Lanche> lanchesDoRestaurante = restauranteELanche.get(new Restaurante(restauranteEscolhido));
        TelaLanches telaLanches = new TelaLanches(aplicativo, lanchesDoRestaurante);
        telaLanches.tornarVisivel();
        janela.dispose();
    }

    private void telaAnterior() {
        AplicativoCompleto aplicativoCompleto = new AplicativoCompleto();
        janela.dispose();
        aplicativoCompleto.setVisible(true);
    }
}

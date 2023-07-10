package FrontEnd;

import BackEnd.Aplicativo;
import BackEnd.Lanche;
import Componentes.Botao;
import Componentes.Janela;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Vector;

public class TelaLanches {
    Janela janela = new Janela("Tela de Restaurante", "src/Imagens/TelaLanches.png");

    JComboBox<String> comboBoxLanches;
    Aplicativo aplicativo;
    ArrayList<Lanche> lanches;
    ArrayList<String> todosLanches = new ArrayList<>();
    public TelaLanches(Aplicativo aplicativo, ArrayList<Lanche> lanches) {

        this.lanches = lanches;
        this.aplicativo = aplicativo;
        janela.setVisible(true);

        Botao botaoIrParaCarrinho = new Botao(70, 446);
        botaoIrParaCarrinho.addActionListener(e -> irParaCarrinho());

        JCheckBox checkBoxTeste = new JCheckBox();
        int y = 180;
        for (Lanche lanche : lanches){
            String lancheEPreco = lanche.nomeLanche + " - R$" + lanche.precoLanche;
            todosLanches.add(lancheEPreco);
            checkBoxTeste = new JCheckBox(lancheEPreco);
            janela.add(checkBoxTeste);

            checkBoxTeste.setBounds(26, y, 280, 40);

            y += 50;
        }
    }

    public void tornarVisivel() {
        janela.setVisible(true);
    }

    private void irParaCarrinho() {

    }
}

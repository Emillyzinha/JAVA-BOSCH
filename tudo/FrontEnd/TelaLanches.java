package FrontEnd;

import BackEnd.Aplicativo;
import BackEnd.Lanche;
import Componentes.Botao;
import Componentes.Janela;

import javax.swing.*;
import java.util.ArrayList;
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

        for (Lanche lanche : lanches){
            String lancheEPreco = lanche.nomeLanche + " - R$" + lanche.precoLanche;
            todosLanches.add(lancheEPreco);
            System.out.println("todos os lanches aqui " + lanche.nomeLanche);
        }

        comboBoxLanches = new JComboBox<>(new Vector<>(todosLanches));
        comboBoxLanches.setBounds(26, 150, 250, 40);

        

        comboBoxLanches.setVisible(true);
        janela.add(comboBoxLanches);
    }

    public void tornarVisivel() {
        janela.setVisible(true);
    }

    private void irParaCarrinho() {

    }
}

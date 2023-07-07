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
//        ArrayList<Restaurante> oi = new ArrayList<>();
//        AdicionarRestaurantes adicionarRestaurantes = new AdicionarRestaurantes(oi);
        this.restauranteELanche = restauranteELanche;
        this.aplicativo = aplicativo;

        janela.setVisible(true);
//        adicionarRestaurantes.janela.setVisible(false);
        BotaoVoltar botaoVoltar = new BotaoVoltar();
        botaoVoltar.addActionListener(e -> telaAnterior());

//        Label label = new Label("TESTE", 150);
//        Label label2 = new Label("TESTE", 190);

        for (ArrayList<Lanche> lanche1 : restauranteELanche.values()){
            for (Lanche teste : lanche1){
//                System.out.println("valores " + lanche1);
//                System.out.println("valores dentro " + teste.nomeLanche);
//                choices = new String[]{};
            }
        }

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
        String teste = comboBoxRestaurante.getItemAt(comboBoxRestaurante.getSelectedIndex());

        ArrayList<Lanche> lanchesDoRestaurante = restauranteELanche.get(new Restaurante(teste));
        TelaLanches telaLanches = new TelaLanches(aplicativo, lanchesDoRestaurante);
        telaLanches.tornarVisivel();
        janela.dispose();

//        for (Lanche lanche : lanchesDoRestaurante){
//            System.out.println("aqui o valor dentro " + lanche.nomeLanche);
//        }
    }

    private void telaAnterior() {
        AplicativoCompleto aplicativoCompleto = new AplicativoCompleto();
        janela.dispose();
        aplicativoCompleto.setVisible(true);
    }

}

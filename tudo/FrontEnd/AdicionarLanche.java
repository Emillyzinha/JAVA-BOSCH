package FrontEnd;

import BackEnd.Aplicativo;
import BackEnd.Lanche;
import BackEnd.Restaurante;
import Componentes.Botao;
import Componentes.BotaoVoltar;
import Componentes.CampoTexto;
import Componentes.Janela;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AdicionarLanche extends JFrame {

    private final Janela janela = new Janela("Adicionar Restaurantes", "src/Imagens/TelaAdicionarLanche.png");

    private Restaurante restaurante;

    Map<Restaurante, ArrayList<Lanche>> restauranteELanche;

    CampoTexto campoNome;
    CampoTexto campoPreco;
    ArrayList<Lanche> lanchess = new ArrayList<>();
    Aplicativo aplicativo;
    public AdicionarLanche(Restaurante restaurante, Map<Restaurante, ArrayList<Lanche>> restauranteELanche, Aplicativo aplicativo) {
        this.aplicativo = aplicativo;
        this.restauranteELanche = restauranteELanche;
        this.restaurante = restaurante;
        campoNome = new CampoTexto(12, 339);
        campoPreco = new CampoTexto(12, 433);

        Botao botaoAdcLanche = new Botao(70, 504);
        Botao botaoVerRestaurantes = new Botao(70, 568);
        BotaoVoltar botaoVoltar = new BotaoVoltar();

        botaoAdcLanche.addActionListener(e -> adcLanche());
        botaoVoltar.addActionListener(e -> janela.dispose());
        botaoVerRestaurantes.addActionListener(e -> {
            janela.dispose();
            TelaCadastro telaCadastro = new TelaCadastro(aplicativo);
            telaCadastro.tornarVisivel();
        });

        janela.add(botaoVoltar);
        janela.add(botaoAdcLanche);
        janela.add(botaoVerRestaurantes);
        janela.add(campoNome);
        janela.add(campoPreco);
    }

    private void adcLanche() {
        String nomeString = campoNome.getText();
        Double precoDouble = Double.valueOf(campoPreco.getText());
        Lanche lanche = new Lanche(nomeString, precoDouble);
        boolean adicionandoLanche = restaurante.adicionarLancheCardapio(lanche);

        if (adicionandoLanche){
            lanchess.add(lanche);

            restauranteELanche.put(restaurante, lanchess);
            for (ArrayList<Lanche> lanche1 : restauranteELanche.values()){
                for (Lanche teste : lanche1){
                    System.out.println("valores " + lanche1);
                    System.out.println("valores dentro " + teste.nomeLanche);
                }
            }

            restauranteELanche.values();
            System.out.println("dicionário" + restauranteELanche);
            System.out.println("tamanho" + restauranteELanche.size());
            campoNome.setText("");
            campoPreco.setText("");
//            janela.dispose();
        }else {
            JOptionPane.showMessageDialog(null, "Lanche já cadastrado", "HomeBurguer", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void tornarVisivel() {
        janela.setVisible(true);
    }
}

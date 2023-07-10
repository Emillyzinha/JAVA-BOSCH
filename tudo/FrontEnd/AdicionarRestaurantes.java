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
import java.util.Map;

public class AdicionarRestaurantes extends JFrame {

    CampoTexto campoNome;
    Aplicativo aplicativo;
    ArrayList<Restaurante> listaRestaurantes;
    Map<Restaurante, ArrayList<Lanche>> restauranteELanche;
    Janela janela = new Janela("Adicionar Restaurantas", "src/Imagens/TelaCadastroRestaurante.png");
    public AdicionarRestaurantes(ArrayList<Restaurante> listaRestaurantes, Aplicativo aplicativo, Map<Restaurante, ArrayList<Lanche>> restauranteELanche) {
        this.restauranteELanche = restauranteELanche;

        this.listaRestaurantes = listaRestaurantes;
        this.aplicativo = aplicativo;
        BotaoVoltar botaoVoltar = new BotaoVoltar();
        botaoVoltar.addActionListener(e -> dispose());

        campoNome = new CampoTexto(12, 340);

        Botao botaoCadastrar = new Botao(70, 446);

        botaoCadastrar.addActionListener(e -> cadastrarRestaurante());

        janela.add(botaoVoltar);
        janela.add(botaoCadastrar);
        janela.add(campoNome);
        janela.add(campoNome);
    }

    public void tornarVisivel() {
        janela.setVisible(true);
    }

    private void cadastrarRestaurante() {
        Restaurante restaurante = new Restaurante(String.valueOf(campoNome.getText()));
        boolean cadastrou = aplicativo.cadastrarRestaurante(restaurante);
        if(cadastrou){
            campoNome.setText("");
            dispose();
            AdicionarLanche adicionarLanche = new AdicionarLanche(restaurante, restauranteELanche, aplicativo);
            adicionarLanche.tornarVisivel();
            listaRestaurantes.add(restaurante);
            JOptionPane.showMessageDialog(null, "Restaurante cadastrado com sucesso!");
        }else {
            JOptionPane.showMessageDialog(null, "Restaurante já cadastrado", "HomeBurguer", JOptionPane.ERROR_MESSAGE);
        }
    }
}

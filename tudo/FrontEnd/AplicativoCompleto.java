package FrontEnd;

import BackEnd.Aplicativo;
import BackEnd.Lanche;
import BackEnd.Restaurante;
import BackEnd.Usuario;
import Componentes.Botao;
import Componentes.BotaoVoltar;
import Componentes.Janela;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AplicativoCompleto extends JFrame {
    Janela janela;
    ArrayList<Restaurante> listaRestaurantes = new ArrayList<>();
    ArrayList<Usuario> listaUsuarios = new ArrayList<>();
    Map<Restaurante, ArrayList<Lanche>> restauranteELanche = new HashMap<>();
    Aplicativo aplicativo = new Aplicativo();

    public AplicativoCompleto() {
        AdicionarRestaurantes adicionarRestaurantes = new AdicionarRestaurantes(listaRestaurantes, aplicativo, restauranteELanche);
        TelaCadastro telaCadastro = new TelaCadastro(aplicativo, restauranteELanche);
        janela  = new Janela("Tela Inicial", "src/Imagens/TelaPrincipal.png");

        Botao botaoAdicionarRestaurante = new Botao(70, 522);
        Botao botaoCadastroUsuario = new Botao(70, 585);
        Botao botaoAdicionarLanche = new Botao(70, 656);

        botaoAdicionarRestaurante.addActionListener(e -> adicionarRestaurantes.tornarVisivel());
        botaoCadastroUsuario.addActionListener(e -> telaCadastro.tornarVisivel());

        janela.add(botaoAdicionarLanche);
        janela.add(botaoAdicionarRestaurante);
        janela.add(botaoCadastroUsuario);
        janela.setVisible(true);
    }
}

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
//        AdicionarLanche adicionarLanche = new AdicionarLanche();
        AdicionarRestaurantes adicionarRestaurantes = new AdicionarRestaurantes(listaRestaurantes, aplicativo, restauranteELanche);
        TelaCadastro telaCadastro = new TelaCadastro(aplicativo);
        janela  = new Janela("Tela Inicial", "src/Imagens/TelaPrincipal.png");

        Botao botaoAdicionarRestaurante = new Botao(70, 522);
        Botao botaoCadastroUsuario = new Botao(70, 585);
        Botao botaoAdicionarLanche = new Botao(70, 656);

        botaoAdicionarRestaurante.addActionListener(e -> adicionarRestaurantes.setVisible(true));
//        botaoAdicionarLanche.addActionListener(e -> adicionarLanche.tornarVisivel());
        botaoCadastroUsuario.addActionListener(e -> telaCadastro.tornarVisivel());

        janela.add(botaoAdicionarLanche);
        janela.add(botaoAdicionarRestaurante);
        janela.add(botaoCadastroUsuario);
        janela.setVisible(true);
    }

//    private void telaInicial() {
////        AdicionarLanche adicionarLanche = new AdicionarLanche();
//        AdicionarRestaurantes adicionarRestaurantes = new AdicionarRestaurantes(listaRestaurantes, aplicativo);
//        janela  = new Janela("Tela Inicial", "src/Imagens/TelaPrincipal.png");
//
//        Botao botaoAdicionarRestaurante = new Botao(70, 522);
//        Botao botaoAdicionarLanche = new Botao(70, 585);
//        Botao botaoCadastroUsuario = new Botao(70, 656);
//
//        botaoAdicionarRestaurante.addActionListener(e -> adicionarRestaurantes.setVisible(true));
////        botaoAdicionarLanche.addActionListener(e -> adicionarLanche.tornarVisivel());
//
//        janela.add(botaoAdicionarLanche);
//        janela.add(botaoAdicionarRestaurante);
//        janela.add(botaoCadastroUsuario);
//        janela.setVisible(true);
//
//    }

//    private void opcaoRestaurante () {
//        AdicionarRestaurantes adicionarRestaurantes = new AdicionarRestaurantes(listaRestaurantes, aplicativo);
//        janela = new Janela("Adicionar Restaurantes", "src/Imagens/TelaCadastroRestaurante.png");
//
//        Botao botaoAdcRestaurantes = new Botao(70, 545);
//
//        Botao botaoAdcLanche = new Botao(70, 608);
//
//        botaoAdcRestaurantes.addActionListener(e -> System.out.println("oi"));
//
//        botaoAdcLanche.addActionListener(e -> {
//            adicionarRestaurantes.setVisible(true);
////            telaInicial();
//        });
//        BotaoVoltar botaoVoltar = new BotaoVoltar();
//
//        botaoVoltar.addActionListener(e -> {
//            adicionarRestaurantes.setVisible(false);
////            telaInicial();
//        });
//
//        janela.add(botaoAdcRestaurantes);
//        janela.add(botaoAdcLanche);
//        janela.add(botaoVoltar);
//        janela.setVisible(true);
//    }

    private void opcaoCliente () {
        janela.dispose();
        OpcaoCliente opcaoCliente = new OpcaoCliente();
        opcaoCliente.setVisible(true);
    }

}

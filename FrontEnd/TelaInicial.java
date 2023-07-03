package FrontEnd;

import Componentes.Botao;
import Componentes.Janela;

public class TelaInicial {
    Janela janela = new Janela("Tela Inicial", "src/Imagens/TelaPrincipal.png");

    public TelaInicial() {
        Botao botaoClientes = new Botao("", 70, 545, 232, 51);
        botaoClientes.setOpaque(false);

        Botao botaoRestaurantes = new Botao("", 70, 608, 232, 51);
        botaoClientes.setOpaque(false);

        botaoClientes.addActionListener(e -> opcaoCliente());
        botaoRestaurantes.addActionListener(e -> opcaoRestaurante());

        janela.add(botaoClientes);
        janela.add(botaoRestaurantes);
        janela.setVisible(true);
    }

    private void opcaoRestaurante () {
        janela.dispose();
        OpcaoRestaurante opcaoRestaurante = new OpcaoRestaurante();
        opcaoRestaurante.setVisible(true);
    }

    private void opcaoCliente () {
        janela.dispose();
        OpcaoCliente opcaoCliente = new OpcaoCliente();
        opcaoCliente.setVisible(true);
    }

}

package FrontEnd;

import Componentes.Botao;
import Componentes.Janela;

import javax.swing.*;

public class OpcaoCliente extends JFrame {

    Janela janela = new Janela("Tela Cliente", "src/Imagens/TelaOpcaoCliente.png");

    public OpcaoCliente() {
        Botao botaoCadastro = new Botao("", 70, 545, 232, 51);

        Botao botaoLogin = new Botao("", 70, 608, 232, 51);

        botaoCadastro.addActionListener(e -> telaCadastro());
        botaoLogin.addActionListener(e -> System.out.println("ciclou res"));

        janela.add(botaoCadastro);
        janela.add(botaoLogin);
        janela.setVisible(true);
    }

    private void telaCadastro () {
        janela.dispose();
        TelaCadastro telaCadastro = new TelaCadastro();
        telaCadastro.setVisible(true);
    }
}

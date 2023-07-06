package FrontEnd;

import Componentes.Botao;
import Componentes.BotaoVoltar;
import Componentes.Janela;

import javax.swing.*;

public class OpcaoCliente extends JFrame {

    Janela janela = new Janela("Tela Cliente", "src/Imagens/TelaOpcaoCliente.png");
    public OpcaoCliente() {

        Botao botaoIrTelaCadastro = new Botao(70, 545);
        Botao botaoIrTelaLogin = new Botao(70, 608);
        BotaoVoltar botaoVoltar = new BotaoVoltar();

        botaoVoltar.addActionListener(e -> telaAnterior());
        botaoIrTelaCadastro.addActionListener(e -> telaCadastro());

        janela.add(botaoIrTelaCadastro);
        janela.add(botaoIrTelaLogin);
        janela.add(botaoVoltar);
        janela.setVisible(true);
    }

    private void telaCadastro () {
        janela.dispose();
//        TelaCadastro telaCadastro = new TelaCadastro();
//        telaCadastro.setVisible(true);
    }

    private void telaAnterior () {
        janela.dispose();
        AplicativoCompleto aplicativoCompleto = new AplicativoCompleto();
        aplicativoCompleto.setVisible(true);
    }


}

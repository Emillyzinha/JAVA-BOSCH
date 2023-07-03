package FrontEnd;

import Componentes.Botao;
import Componentes.Janela;

import javax.swing.*;

public class OpcaoRestaurante extends JFrame {

    public OpcaoRestaurante() {
        Janela janela = new Janela("Tela Restaurante", "src/Imagens/TelaOpcaoRestaurante.png");

        Botao botaoClientes = new Botao("", 70, 545, 232, 51);

        Botao botaoRestaurantes = new Botao("", 70, 608, 232, 51);

        botaoClientes.addActionListener(e -> System.out.println("ciclou mesmo"));
        botaoRestaurantes.addActionListener(e -> System.out.println("ciclou res"));

        janela.add(botaoClientes);
        janela.add(botaoRestaurantes);
        janela.setVisible(true);
    }


}

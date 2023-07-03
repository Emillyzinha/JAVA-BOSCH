package FrontEnd;

import BackEnd.Aplicativo;
import Componentes.Botao;
import Componentes.CampoTexto;
import Componentes.Janela;

import javax.swing.*;
import java.awt.*;

public class TelaCadastro extends JFrame {

    String nome;
    Botao botaoCadastrar;
    CampoTexto campoNome;
    CampoTexto campoEndereco;
    CampoTexto campoCPF;

    public TelaCadastro() {
        Janela janela = new Janela("Tela de Cadastro", "src/Imagens/TelaCadastro.png");
        campoNome = new CampoTexto(12, 315);
        campoEndereco = new CampoTexto(12, 405);
        campoCPF = new CampoTexto(12, 495);

        botaoCadastrar = new Botao("", 70, 586, 232, 51);

        nome = campoNome.getText();
        botaoCadastrar.addActionListener(e -> cadastrarUsuario());

        janela.add(campoNome);
        janela.add(campoEndereco);
        janela.add(campoCPF);
        janela.add(botaoCadastrar);
    }

    private void cadastrarUsuario() {
        Aplicativo aplicativo = new Aplicativo();
        int intCPF = Integer.parseInt(campoCPF.getText());
        boolean cadastrou =  aplicativo.cadastrarCliente(campoNome.getText(), intCPF, campoEndereco.getText());
        if(cadastrou){
            dispose();
            TelaRestaurante telaRestaurante = new TelaRestaurante();
            telaRestaurante.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "Usuário já cadastrado", "HomeBurguer", JOptionPane.ERROR_MESSAGE);
        }
    }

}

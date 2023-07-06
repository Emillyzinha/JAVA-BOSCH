package FrontEnd;

import BackEnd.Aplicativo;
import Componentes.*;

import javax.swing.*;

public class TelaCadastro extends JFrame {

    CampoTexto campoNome = new CampoTexto(12, 315);
    CampoTexto campoEndereco = new CampoTexto(12, 405);
    CampoTexto campoCPF = new CampoTexto(12, 495);
    Aplicativo aplicativo;

    private final Janela janela = new Janela("Tela de Cadastro", "src/Imagens/TelaCadastro.png");
    public TelaCadastro(Aplicativo aplicativo) {
        this.aplicativo = aplicativo;
        Botao botaoCadastrar = new Botao(70, 586);
        BotaoVoltar botaoVoltar = new BotaoVoltar();

        botaoVoltar.addActionListener(e -> janela.dispose());

        botaoCadastrar.addActionListener(e -> cadastrarUsuario());

        janela.add(campoNome);
        janela.add(campoEndereco);
        janela.add(campoCPF);
        janela.add(botaoVoltar);
        janela.add(botaoCadastrar);
    }

    public void tornarVisivel() {
        janela.setVisible(true);
    }

    private void cadastrarUsuario() {
        int intCPF = Integer.parseInt(campoCPF.getText());
        boolean cadastrou =  aplicativo.cadastrarCliente(campoNome.getText(), intCPF, campoEndereco.getText());
        if(cadastrou){
//            TelaRestaurantes telaRestaurantes = new TelaRestaurantes();
            this.dispose();
//            telaRestaurantes.setVisible(true);
        }else {
            JOptionPane.showMessageDialog(null, "Usuário já cadastrado", "HomeBurguer", JOptionPane.ERROR_MESSAGE);
        }
    }
}

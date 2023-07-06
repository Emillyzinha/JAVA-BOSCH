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
//    private final Janela janela = new Janela("Adicionar Restaurantes", "src/Imagens/TelaCadastroRestaurante.png");
    public AdicionarRestaurantes(ArrayList<Restaurante> listaRestaurantes, Aplicativo aplicativo, Map<Restaurante, ArrayList<Lanche>> restauranteELanche) {
        this.restauranteELanche = restauranteELanche;

        setTitle("Adicionar Restaurantes");
        setSize(390, 880);
        setLocation(690, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        setContentPane(new JLabel(new ImageIcon("src/Imagens/TelaCadastroRestaurante.png")));

        this.listaRestaurantes = listaRestaurantes;
        this.aplicativo = aplicativo;
        BotaoVoltar botaoVoltar = new BotaoVoltar();
        botaoVoltar.addActionListener(e -> dispose());

        campoNome = new CampoTexto(12, 340);

        Botao botaoCadastrar = new Botao(70, 446);

        botaoCadastrar.addActionListener(e -> cadastrarRestaurante());

        add(botaoVoltar);
        add(botaoCadastrar);
        add(campoNome);
        add(campoNome);
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
//                TelaRestaurantes telaRestaurantes = new TelaRestaurantes(aplicativo);
//                telaRestaurantes.setVisible(true);

        }else {
            JOptionPane.showMessageDialog(null, "Restaurante já cadastrado", "HomeBurguer", JOptionPane.ERROR_MESSAGE);
        }
        System.out.println(listaRestaurantes);
        System.out.println(listaRestaurantes.size());
    }
}

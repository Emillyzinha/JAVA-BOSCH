package App;

import Componentes.Botao;
import Componentes.Janela;

public class TelaInicial {
    public static void main(String[] args) {
        Janela janela = new Janela("Tela Inicial");
        Botao botao = new Botao("Teste", 200, 200);

        janela.add(botao);
        janela.setVisible(true);
    }
}

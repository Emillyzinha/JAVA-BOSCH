package Componentes;

import javax.swing.*;

public class BotaoIrTela extends JButton {

    JFrame telaParaIr;
    Janela janela;
    public BotaoIrTela(int x, int y, int width, int height, Janela janela, JFrame telaParaIr) {

        this.janela = janela;
        this.telaParaIr = telaParaIr;
        this.setSize(width, height);
        this.setLocation(x, y);
//        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);

//        this.addActionListener(e -> irParaTela());


//        this.setBackground(new Color(157, 0,255));

//        this.addActionListener(e -> System.out.println("clicou"));
//        this.addActionListener(e -> setBackground(new Color(157, 0,255)));

    }

    public void irParaTela() {
        janela.dispose();
        telaParaIr.setVisible(true);
    }
}

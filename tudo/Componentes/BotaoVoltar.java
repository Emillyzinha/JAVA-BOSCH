package Componentes;

import FrontEnd.TelaCadastro;

import javax.swing.*;

public class BotaoVoltar extends JButton {
    public BotaoVoltar() {
        this.setSize(86, 35);
        this.setLocation(7, 28);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);

//        this.addActionListener(e -> voltarTela());
    }
//    public void voltarTela() {
//        janela.dispose();
//        irPara.setVisible(true);
//    }
}

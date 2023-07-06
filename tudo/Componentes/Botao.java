package Componentes;

import javax.swing.*;

public class Botao extends JButton {
    public Botao(int x, int y) {
        this.setSize(232, 51);
        this.setLocation(x, y);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);
    }
}

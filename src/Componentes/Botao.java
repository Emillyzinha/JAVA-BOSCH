package Componentes;

import javax.swing.*;

public class Botao extends JButton {
    public Botao(String text, int x, int y) {
        super(text);
        this.setSize(150, 70);
        this.setLocation(x, y);
    }
}

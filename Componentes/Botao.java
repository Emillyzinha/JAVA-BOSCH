package Componentes;

import javax.swing.*;
import java.awt.*;

public class Botao extends JButton {
    public Botao(String text, int x, int y, int width, int height) {
        super(text);
        this.setSize(width, height);
        this.setLocation(x, y);
//        this.setOpaque(false);
        this.setContentAreaFilled(false);
        this.setBorderPainted(false);

//        this.setBackground(new Color(157, 0,255));

//        this.addActionListener(e -> System.out.println("clicou"));
//        this.addActionListener(e -> setBackground(new Color(157, 0,255)));

    }
}

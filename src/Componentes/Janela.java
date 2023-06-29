package Componentes;

import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {
    public Janela(String title) {
        super(title);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 800);
        setLayout(null);
        setBackground(Color.GRAY);
    }
}

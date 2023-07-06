package Componentes;

import javax.swing.*;
import java.awt.*;

public class Label extends JLabel {
    public Label(String texto, int y) {
        setBounds(26, y, 300, 55);
        setFont(new Font("Sans",Font.BOLD, 30));
        setForeground(new Color(157, 0, 255));
        setText("teste");
    }

}

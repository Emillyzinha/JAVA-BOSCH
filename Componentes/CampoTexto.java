package Componentes;

import javax.swing.*;
import java.awt.*;

public class CampoTexto extends JTextField {
    public CampoTexto(int x, int y) {
        setSize(350, 30);
        setLocation(x, y);
        setFont(new Font("Sans",Font.PLAIN, 20));
        setOpaque(false);
        setBorder(null);
    }
}

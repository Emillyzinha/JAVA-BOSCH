package Componentes;

import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {
    public Janela(String title, String imagemURL) {
//        JFrame j = new JFrame(title);

        super(title);

        setSize(390, 880);
        setLocation(690, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

//        new BackgroundImage("src/Imagens/Tela principal.png", j);
        setContentPane(new JLabel(new ImageIcon(imagemURL)));


//        JLabel label = new JLabel("TESTANDO");
//        label.setForeground(new Color(157, 0, 255));
//        label.setFont(new Font("Sans", Font.BOLD, 40));
//        label.setBounds(100, 100, 300, 200);
//        add(label);


        setVisible(true);
    }
}

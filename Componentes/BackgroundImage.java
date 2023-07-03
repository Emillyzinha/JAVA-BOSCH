package Componentes;
import javax.swing.*;

public class BackgroundImage extends JFrame {
    public BackgroundImage(String urlImagem, JFrame jframe) {
        jframe.setContentPane(new JLabel(new ImageIcon(urlImagem)));
        jframe.setVisible(true);
    }

}

package interfaz;

import javax.swing.*;
import java.awt.*;

public class Animales extends JPanel {

    public Animales() {
        this.setLayout(new GridLayout(6,1));
        this.setBackground(Color.GRAY);

        JButton anim1 = new JButton("leon");
        JButton anim2 = new JButton("carpincho");
        JButton anim3 = new JButton("serpiente");
        JButton anim4 = new JButton("canguro");
        JButton anim5 = new JButton("peces");
        JButton anim6 = new JButton("buho");

        this.add(anim1);
        this.add(anim2);
        this.add(anim3);
        this.add(anim4);
        this.add(anim5);
        this.add(anim6);
    }
}

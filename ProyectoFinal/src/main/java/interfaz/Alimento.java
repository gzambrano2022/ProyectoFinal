package interfaz;

import javax.swing.*;
import java.awt.*;

public class Alimento extends JPanel {
    public Alimento() {
        this.setLayout(new GridLayout(11,1));
        this.setBackground(Color.GRAY);

        JButton alim1 = new JButton("comida 1");
        JButton alim2 = new JButton("comida 2");
        JButton alim3 = new JButton("comida 3");
        JButton alim4 = new JButton("comida 4");
        JButton alim5 = new JButton("comida 5");
        JButton alim6 = new JButton("comida 6");
        JButton alim7 = new JButton("comida 7");
        JButton alim8 = new JButton("comida 8");
        JButton alim9 = new JButton("comida 9");
        JButton alim10 = new JButton("comida 10");
        JButton alim11 = new JButton("comida 11");

        this.add(alim1);
        this.add(alim2);
        this.add(alim3);
        this.add(alim4);
        this.add(alim5);
        this.add(alim6);
        this.add(alim7);
        this.add(alim8);
        this.add(alim9);
        this.add(alim10);
        this.add(alim11);
    }
}

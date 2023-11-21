package interfaz;

import javax.swing.*;
import java.awt.*;

public class Habitat extends JPanel {
    public Habitat() {

        this.setLayout(new GridLayout(2,3));
        this.setBackground(Color.GRAY);

        JButton hab1 = new JButton("habitat 1");
        JButton hab2 = new JButton("habitat 2");
        JButton hab3 = new JButton("habitat 3");
        JButton hab4 = new JButton("habitat 4");
        JButton hab5 = new JButton("habitat 5");
        JButton hab6 = new JButton("habitat 6");

        this.add(hab1);
        this.add(hab2);
        this.add(hab3);
        this.add(hab4);
        this.add(hab5);
        this.add(hab6);
    }
}

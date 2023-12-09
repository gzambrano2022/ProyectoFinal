package interfaz;

import javax.swing.*;
import java.awt.*;

public class AlimentoIF extends JPanel {
    public AlimentoIF() {
        this.setLayout(new GridLayout(6,1));
        this.setBackground(Color.GRAY);

        JButton alim1 = new JButton("comida 1");
        JButton alim2 = new JButton("comida 2");
        JButton alim3 = new JButton("comida 3");
        JButton alim4 = new JButton("comida 4");
        JButton alim5 = new JButton("comida 5");
        JButton alim6 = new JButton("comida 6");

        this.add(alim1);
        this.add(alim2);
        this.add(alim3);
        this.add(alim4);
        this.add(alim5);
        this.add(alim6);
    }
}

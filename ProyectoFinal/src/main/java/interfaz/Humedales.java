package interfaz;

import javax.swing.*;
import java.awt.*;

public class Humedales extends JFrame {
    private JPanel mypanel;
    private Alimento alimento;
    private Animales animales;
    private PanelHumedales panelHumedales;

    public Humedales() {
        this.setLayout(new BorderLayout());
        mypanel = new JPanel();
        animales = new Animales();
        alimento = new Alimento();
        panelHumedales = new PanelHumedales();

        this.add(alimento,BorderLayout.EAST);
        this.add(animales,BorderLayout.WEST);
        this.add(panelHumedales, BorderLayout.CENTER);

        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

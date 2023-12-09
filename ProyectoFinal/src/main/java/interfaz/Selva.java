package interfaz;

import javax.swing.*;
import java.awt.*;

public class Selva extends JFrame {
    private JPanel mypanel;
    private Alimento alimento;
    private Animales animales;
    private PanelSelva panelSelva;
    private PanelSabana panSab;

    public Selva() {
        this.setLayout(new BorderLayout());
        mypanel = new JPanel();
        animales = new Animales(panSab);
        alimento = new Alimento();
        panelSelva = new PanelSelva(alimento, animales);

        this.add(alimento,BorderLayout.EAST);
        this.add(animales,BorderLayout.WEST);
        this.add(panelSelva,BorderLayout.CENTER);

        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

package interfaz;

import javax.swing.*;
import java.awt.*;

public class Bosque extends JFrame {
    private JPanel mypanel;
    private Alimento alimento;
    private Animales animales;
    private PanelBosque panelBosque;


    public Bosque() {
        this.setLayout(new BorderLayout());
        mypanel = new JPanel();
        animales = new Animales();
        alimento = new Alimento();
        panelBosque = new PanelBosque();

        this.add(alimento,BorderLayout.EAST);
        this.add(animales,BorderLayout.WEST);
        this.add(panelBosque,BorderLayout.CENTER);

        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

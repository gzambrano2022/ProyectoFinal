package interfaz;

import javax.swing.*;
import java.awt.*;

public class Aviario extends JFrame {
    private JPanel mypanel;
    private Alimento alimento;
    private Animales animales;
    private PanelAviario panelAviario;


    public Aviario() {
        this.setLayout(new BorderLayout());
        mypanel = new JPanel();
        animales = new Animales();
        alimento = new Alimento();
        panelAviario = new PanelAviario();

        this.add(alimento,BorderLayout.EAST);
        this.add(animales,BorderLayout.WEST);
        this.add(panelAviario,BorderLayout.CENTER);

        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

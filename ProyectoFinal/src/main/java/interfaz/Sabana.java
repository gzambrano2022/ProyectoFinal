package interfaz;

import org.example.SaturacionException;

import javax.swing.*;
import java.awt.*;

public class Sabana extends JFrame {
    private JPanel mypanel;
    private Alimento alimento;
    private Animales animales;
    private PanelSabana panelSabana;



    public Sabana() throws SaturacionException {
        this.setLayout(new BorderLayout());
        mypanel = new JPanel();
        animales = new Animales(panelSabana);

        alimento = new Alimento();
        panelSabana = new PanelSabana();

        this.add(alimento,BorderLayout.EAST);
        this.add(animales,BorderLayout.WEST);
        this.add(panelSabana, BorderLayout.CENTER);

        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

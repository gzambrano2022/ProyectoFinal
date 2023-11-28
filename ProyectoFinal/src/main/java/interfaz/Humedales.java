package interfaz;

import javax.swing.*;
import java.awt.*;

public class Humedales extends JFrame {
    private JPanel panelSabana;

    private Alimento alimento;
    private Animales animales;


    public Humedales() {
        this.setLayout(new BorderLayout());
        panelSabana = new JPanel();
        animales = new Animales();
        alimento = new Alimento();

        this.add(alimento,BorderLayout.EAST);
        this.add(animales,BorderLayout.WEST);

        this.setSize(700,700);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
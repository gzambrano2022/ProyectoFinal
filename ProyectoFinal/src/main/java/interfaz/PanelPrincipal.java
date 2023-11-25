package interfaz;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {

    private Alimento comida;
    private Animales animales;
    private Habitat habitat;

    public PanelPrincipal() {

        comida = new Alimento();
        animales = new Animales();
        habitat = new Habitat();

        this.setLayout(new BorderLayout());
        this.setBackground(Color.white);

        this.add(habitat, BorderLayout.CENTER);

    }
}

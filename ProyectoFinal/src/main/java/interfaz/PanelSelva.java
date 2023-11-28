package interfaz;

import javax.swing.*;
import java.awt.*;

public class PanelSelva extends JPanel {
    private Alimento alimento;
    private Animales animales;

    public PanelSelva(Alimento alimento, Animales animales) {
        this.alimento = alimento;
        this.animales = animales;

        this.setPreferredSize(new Dimension(1000, 800));
        this.setBackground(Color.BLACK);
    }
}

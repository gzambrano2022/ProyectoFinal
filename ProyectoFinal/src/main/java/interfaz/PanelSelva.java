package interfaz;

import javax.swing.*;
import java.awt.*;

public class PanelSelva extends JPanel {
    private AlimentoIF alimento;
    private AnimalesIF animales;

    public PanelSelva(AlimentoIF alimento, AnimalesIF animales) {
        this.alimento = alimento;
        this.animales = animales;

        this.setPreferredSize(new Dimension(1000, 800));
        this.setBackground(Color.BLACK);
    }
}

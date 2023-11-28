package interfaz;

import javax.swing.*;
import java.awt.*;

public class PanelBosque extends JPanel {
    private Alimento alimento;
    private Animales animales;

    public PanelBosque() {

        this.setPreferredSize(new Dimension(1000, 800));
        this.setBackground(Color.BLACK);
    }
}

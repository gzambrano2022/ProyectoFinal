package interfaz;

import javax.swing.*;
import java.awt.*;

public class PanelAviario extends JPanel {
    private AlimentoIF alimento;
    private AnimalesIF animales;

    public PanelAviario() {

        this.setPreferredSize(new Dimension(1000, 800));
        this.setBackground(Color.BLACK);
    }
}

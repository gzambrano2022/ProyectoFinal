package interfaz;

import javax.swing.*;
import java.awt.*;

public class PanelHumedales extends JPanel {
    private Alimento alimento;
    private Animales animales;

    private ImageIcon fondo;
    public PanelHumedales() {
        fondo = new ImageIcon("src/main/java/interfaz/Imagenes/panelhumedal.jpg");

        this.setPreferredSize(new Dimension(1000, 800));
    }
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja la imagen de fondo
        g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
    }
}

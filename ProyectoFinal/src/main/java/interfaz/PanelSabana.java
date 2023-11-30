package interfaz;

import org.example.Sabana;
import org.example.SaturacionException;

import javax.swing.*;
import java.awt.*;

public class PanelSabana extends JPanel {
    private Alimento alimento;
    private Animales animales;
    private ImageIcon fondo;
    private Sabana sab;

    public PanelSabana() throws SaturacionException {
        sab = new Sabana(4);
        fondo = new ImageIcon("src/main/java/interfaz/Imagenes/panelsabana.jpg");
        this.setPreferredSize(new Dimension(1000, 800));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja la imagen de fondo
        g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);
    }
}

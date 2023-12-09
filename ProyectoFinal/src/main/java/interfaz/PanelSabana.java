package interfaz;

import org.example.Sabana;
import org.example.SaturacionException;

import javax.swing.*;
import java.awt.*;

public class PanelSabana extends JPanel {
    private AlimentoIF alimento;
    private AnimalesIF animales;
    private ImageIcon fondo;
    private ImageIcon leon = null;
    private Sabana sab;

    public PanelSabana() throws SaturacionException {
        sab = new Sabana();
        fondo = new ImageIcon("src/main/java/interfaz/Imagenes/panelsabana.jpg");
        leon = new ImageIcon("src/main/java/interfaz/Imagenes/leon.png");
        this.setPreferredSize(new Dimension(1000, 800));
    }

    public void dibujaLeon(){
        leon = new ImageIcon("src/main/java/interfaz/Imagenes/leon.png");
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // Dibuja la imagen de fondo
        g.drawImage(fondo.getImage(), 0, 0, getWidth(), getHeight(), this);

        if (leon != null) {
            Graphics2D g2d = (Graphics2D) g;
            g2d.drawImage(leon.getImage(), 0, 0, this);
        }

    }
}

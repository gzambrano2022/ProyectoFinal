package interfaz;

import org.example.Sabana;

import javax.swing.*;
import java.awt.*;

public class PanelPrincipal extends JPanel {
    private HabitatIF habitat;

    public PanelPrincipal(Sabana sabana) {

        habitat = new HabitatIF();

        this.setLayout(new BorderLayout());
        this.setBackground(Color.white);

        this.add(habitat, BorderLayout.CENTER);

    }
}

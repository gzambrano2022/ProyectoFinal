package interfaz;

import javax.swing.*;
import java.awt.*;

public class SelvaIF extends JFrame {
    private JPanel mypanel;
    private AlimentoIF alimento;
    private AnimalesIF animales;
    private PanelSelva panelSelva;
    private PanelSabana panSab;

    public SelvaIF() {
        this.setLayout(new BorderLayout());
        mypanel = new JPanel();
        animales = new AnimalesIF(panSab);
        alimento = new AlimentoIF();
        panelSelva = new PanelSelva(alimento, animales);

        this.add(alimento,BorderLayout.EAST);
        this.add(animales,BorderLayout.WEST);
        this.add(panelSelva,BorderLayout.CENTER);

        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

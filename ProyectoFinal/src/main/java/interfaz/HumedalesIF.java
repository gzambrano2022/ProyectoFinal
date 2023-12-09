package interfaz;

import javax.swing.*;
import java.awt.*;

public class HumedalesIF extends JFrame {
    private JPanel mypanel;
    private AlimentoIF alimento;
    private AnimalesIF animales;
    private PanelHumedales panelHumedales;
    private PanelSabana panSab;

    public HumedalesIF() {
        this.setLayout(new BorderLayout());
        mypanel = new JPanel();
        animales = new AnimalesIF(panSab);
        alimento = new AlimentoIF();
        panelHumedales = new PanelHumedales();

        this.add(alimento,BorderLayout.EAST);
        this.add(animales,BorderLayout.WEST);
        this.add(panelHumedales, BorderLayout.CENTER);

        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

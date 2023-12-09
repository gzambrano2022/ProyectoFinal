package interfaz;

import javax.swing.*;
import java.awt.*;

public class BosqueIF extends JFrame {
    private JPanel mypanel;
    private AlimentoIF alimento;
    private AnimalesIF animales;
    private PanelBosque panelBosque;
    private PanelSabana panSab;

    public BosqueIF() {
        this.setLayout(new BorderLayout());
        mypanel = new JPanel();
        animales = new AnimalesIF(panSab);
        alimento = new AlimentoIF();
        panelBosque = new PanelBosque();

        this.add(alimento,BorderLayout.EAST);
        this.add(animales,BorderLayout.WEST);
        this.add(panelBosque,BorderLayout.CENTER);

        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

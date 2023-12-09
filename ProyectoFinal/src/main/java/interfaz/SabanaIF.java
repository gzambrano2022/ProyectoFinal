package interfaz;

import org.example.SaturacionException;

import javax.swing.*;
import java.awt.*;

public class SabanaIF extends JFrame {
    private JPanel mypanel;
    private AlimentoIF alimento;
    private AnimalesIF animales;
    private PanelSabana panelSabana;



    public SabanaIF() throws SaturacionException {
        this.setLayout(new BorderLayout());
        mypanel = new JPanel();
        animales = new AnimalesIF(panelSabana);

        alimento = new AlimentoIF();
        panelSabana = new PanelSabana();

        this.add(alimento,BorderLayout.EAST);
        this.add(animales,BorderLayout.WEST);
        this.add(panelSabana, BorderLayout.CENTER);

        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

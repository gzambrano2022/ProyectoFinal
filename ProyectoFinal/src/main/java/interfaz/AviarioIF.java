package interfaz;

import javax.swing.*;
import java.awt.*;

public class AviarioIF extends JFrame {
    private JPanel mypanel;
    private AlimentoIF alimento;
    private AnimalesIF animales;
    private PanelAviario panelAviario;
    private PanelSabana panSab;


    public AviarioIF() {
        this.setLayout(new BorderLayout());
        mypanel = new JPanel();
        animales = new AnimalesIF(panSab);
        alimento = new AlimentoIF();
        panelAviario = new PanelAviario();

        this.add(alimento,BorderLayout.EAST);
        this.add(animales,BorderLayout.WEST);
        this.add(panelAviario,BorderLayout.CENTER);

        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

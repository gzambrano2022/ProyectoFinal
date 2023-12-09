package interfaz;

import javax.swing.*;
import java.awt.*;

public class AcuarioIF extends JFrame {
    private JPanel mypanel;
    private AlimentoIF alimento;
    private AnimalesIF animales;
    private PanelAcuario panelAcuario;
    private PanelSabana panSab;

    public AcuarioIF() {
        this.setLayout(new BorderLayout());
        mypanel = new JPanel();
        animales = new AnimalesIF(panSab);
        alimento = new AlimentoIF();
        panelAcuario = new PanelAcuario();

        this.add(alimento,BorderLayout.EAST);
        this.add(animales,BorderLayout.WEST);
        this.add(panelAcuario, BorderLayout.CENTER);

        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

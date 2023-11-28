package interfaz;

import javax.swing.*;
import java.awt.*;

public class Acuario extends JFrame {
    private JPanel mypanel;
    private Alimento alimento;
    private Animales animales;
    private PanelAcuario panelAcuario;


    public Acuario() {
        this.setLayout(new BorderLayout());
        mypanel = new JPanel();
        animales = new Animales();
        alimento = new Alimento();
        panelAcuario = new PanelAcuario();

        this.add(alimento,BorderLayout.EAST);
        this.add(animales,BorderLayout.WEST);
        this.add(panelAcuario, BorderLayout.CENTER);

        this.setSize(1000,800);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

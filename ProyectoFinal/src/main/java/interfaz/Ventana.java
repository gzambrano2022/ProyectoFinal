package interfaz;

import org.example.Sabana;
import org.example.SaturacionException;

import javax.swing.*;

public class Ventana extends JFrame {
    private PanelPrincipal mypanel;
    private Sabana sabana;

    public Ventana() throws SaturacionException {
        sabana = new Sabana();
        mypanel = new PanelPrincipal(sabana);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1200,  800);
        this.add(mypanel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

package interfaz;

import javax.swing.*;

public class Ventana extends JFrame {
    private PanelPrincipal mypanel;

    public Ventana(){
        mypanel = new PanelPrincipal();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1090,  900);
        this.add(mypanel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

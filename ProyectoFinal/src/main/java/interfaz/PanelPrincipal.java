package interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PanelPrincipal extends JPanel {
    private Rectangle rectangulo;
    public PanelPrincipal() {
        this.setBackground(Color.BLACK);
        rectangulo = new Rectangle(50, 0, 70, 50);
        agregaMouseListener();
    }

    private void agregaMouseListener(){
        this.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if(rectangulo.contains(e.getPoint())){
                    abrirNuevoFrame();
                }
            }
        });
    }

    private void abrirNuevoFrame() {
        JFrame nuevoFrame = new JFrame("Nuevo JFrame");
        nuevoFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        nuevoFrame.setSize(300, 200);
        nuevoFrame.setLocationRelativeTo(null);
        nuevoFrame.setVisible(true);
    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        g.fillRect(rectangulo.x,rectangulo.y, rectangulo.width, rectangulo.height);
    }
}

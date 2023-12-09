package interfaz;

import org.example.Sabana;
import org.example.SaturacionException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnimalesIF extends JPanel {
    private Sabana sab;
    private PanelSabana panelSabana;
    public AnimalesIF(PanelSabana panelSabana) {
        this.panelSabana = panelSabana;

        this.setLayout(new GridLayout(6,1));
        this.setBackground(Color.GRAY);

        JButton anim1 = new JButton("leon");
        JButton anim2 = new JButton("carpincho");
        JButton anim3 = new JButton("serpiente");
        JButton anim4 = new JButton("canguro");
        JButton anim5 = new JButton("peces");
        JButton anim6 = new JButton("buho");

        this.add(anim1);
        this.add(anim2);
        this.add(anim3);
        this.add(anim4);
        this.add(anim5);
        this.add(anim6);

        anim1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panelSabana.dibujaLeon();
                /*try {
                    sab.agregaAnimal(1);
                } catch (SaturacionException ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }*/
            }
        });

    }
    public void setSabana(Sabana sabana) {
        this.sab=sabana;
    }
}

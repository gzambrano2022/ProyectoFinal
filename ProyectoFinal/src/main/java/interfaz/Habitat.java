package interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Habitat extends JPanel {
    private Sabana sabana;
    private Humedales humedales;
    private Bosque bosque;
    private Aviario aviario;
    private Selva selva;
    private Acuario acuario;
    public Habitat() {

        this.setLayout(new GridLayout(2,3));
        this.setBackground(Color.GRAY);

        JButton hab1 = new JButton("habitat 1");
        JButton hab2 = new JButton("habitat 2");
        JButton hab3 = new JButton("habitat 3");
        JButton hab4 = new JButton("habitat 4");
        JButton hab5 = new JButton("habitat 5");
        JButton hab6 = new JButton("habitat 6");

        this.add(hab1);
        this.add(hab2);
        this.add(hab3);
        this.add(hab4);
        this.add(hab5);
        this.add(hab6);

        hab1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sabana = new Sabana();
            }
        });

        hab2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                humedales = new Humedales();
            }
        });

        hab3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bosque = new Bosque();
            }
        });

        hab4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aviario = new Aviario();
            }
        });

        hab5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                selva = new Selva();
            }
        });

        hab6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                acuario = new Acuario();
            }
        });

    }
}

package interfaz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Habitat extends JPanel {
    private Image sa, hu, bo, av, se, ac;
    private Sabana sabana;
    private Humedales humedales;
    private Bosque bosque;
    private Aviario aviario;
    private Selva selva;
    private Acuario acuario;
    public Habitat() {

        this.setLayout(new GridLayout(2,3));
        this.setBackground(Color.GRAY);

        sa = new ImageIcon("src/main/java/interfaz/Imagenes/sabana.jpg").getImage();
        ac = new ImageIcon("src/main/java/interfaz/Imagenes/acuario.jpg").getImage();
        hu = new ImageIcon("src/main/java/interfaz/Imagenes/humedal.jpg").getImage();
        bo = new ImageIcon("src/main/java/interfaz/Imagenes/bosque.jpg").getImage();
        av = new ImageIcon("src/main/java/interfaz/Imagenes/aviario.jpg").getImage();
        se = new ImageIcon("src/main/java/interfaz/Imagenes/selva.jpg").getImage();

        JButton hab1 = new JButton(new ImageIcon(sa));
        JButton hab2 = new JButton(new ImageIcon(hu));
        JButton hab3 = new JButton(new ImageIcon(bo));
        JButton hab4 = new JButton(new ImageIcon(av));
        JButton hab5 = new JButton(new ImageIcon(se));
        JButton hab6 = new JButton(new ImageIcon(ac));

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

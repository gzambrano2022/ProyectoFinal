package interfaz;

import org.example.SaturacionException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;

public class Habitat extends JPanel {
    private Sabana sabana;
    private Humedales humedales;
    private Bosque bosque;
    private Aviario aviario;
    private Selva selva;
    private Acuario acuario;

    public Habitat() {
        this.setLayout(new GridLayout(2, 3));
        this.setBackground(Color.GRAY);

        JButton hab1 = createImageButton("src/main/java/interfaz/Imagenes/sabana.jpg", "Sabana");
        JButton hab2 = createImageButton("src/main/java/interfaz/Imagenes/humedal.jpg", "Humedales");
        JButton hab3 = createImageButton("src/main/java/interfaz/Imagenes/bosque.jpg", "Bosque");
        JButton hab4 = createImageButton("src/main/java/interfaz/Imagenes/aviario.jpg", "Aviario");
        JButton hab5 = createImageButton("src/main/java/interfaz/Imagenes/selva.jpg", "Selva");
        JButton hab6 = createImageButton("src/main/java/interfaz/Imagenes/acuario.jpg", "Acuario");

        this.add(hab1);
        this.add(hab2);
        this.add(hab3);
        this.add(hab4);
        this.add(hab5);
        this.add(hab6);

        hab1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    sabana = new Sabana();
                } catch (SaturacionException ex) {
                    throw new RuntimeException(ex);
                }
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

    private JButton createImageButton(String imagePath, String tooltipText) {
        ImageIcon icon = new ImageIcon(imagePath);
        Image img = icon.getImage();
        Image scaledImg = img.getScaledInstance(350, 300, Image.SCALE_SMOOTH);
        ImageIcon scaledIcon = new ImageIcon(scaledImg);

        JButton button = new JButton() {
            @Override
            public Point getToolTipLocation(MouseEvent event) {
                Point point = new Point();
                point.setLocation(this.getWidth() / 2, 10);
                return point;
            }
        };

        button.setIcon(scaledIcon);
        button.setContentAreaFilled(false);
        button.setBorderPainted(false);
        button.setToolTipText(tooltipText);

        return button;
    }
}

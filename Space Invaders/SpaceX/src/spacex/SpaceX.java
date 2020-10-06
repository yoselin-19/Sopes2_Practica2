/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacex;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/**
 *
 * @author Ruben
 */
public class SpaceX extends JFrame {

    /**
     * @param args the command line arguments
     */
    /**
     *
     */
    private JButton start;
    Variables var_global  = new Variables();
    /*
	 * Inicio
     */
    JFrame frame = new JFrame("Space Invaders");
    JFrame frame2 = new JFrame("Space Invaders");

    public SpaceX() {
        start = new JButton("Iniciar");
        start.addActionListener(new ButtonListener());
        start.setBounds(800, 800, 200, 100);

        JPanel framejuego = new JPanel();
        framejuego.add(start);

        frame2.add(framejuego, BorderLayout.PAGE_END);
        frame2.setSize(80, 80);
        frame2.setLocationRelativeTo(null);
        frame2.setVisible(true);
        frame2.setResizable(false);

    }



    public static void main(String[] args) {
        new SpaceX();
    }

    private class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(var_global.getANCHO_PANTALLA(), var_global.getALTO_PANTALLA());
            frame.getContentPane().add(new Pantalla());
            frame.setResizable(false);
            frame.setLocationRelativeTo(null);
            frame.setVisible(true);
          

        }
    }



}

class TrainCanvas extends JComponent {

    private int lastX = 0;

    public TrainCanvas() {
        Thread animationThread = new Thread(new Runnable() {
            public void run() {
                while (true) {
                    repaint();
                    try {
                        Thread.sleep(10);
                    } catch (Exception ex) {
                    }
                }
            }
        });

        animationThread.start();
    }

    public void paintComponent(Graphics g) {
        Graphics2D gg = (Graphics2D) g;

        int w = getWidth();
        int h = getHeight();

        int trainW = 100;
        int trainH = 10;
        int trainSpeed = 3;

        int x = lastX + trainSpeed;

        if (x > w + trainW) {
            x = -trainW;
        }

        gg.setColor(Color.BLACK);
        gg.fillRect(x, h / 2 + trainH, trainW, trainH);

        lastX = x;
    }

}

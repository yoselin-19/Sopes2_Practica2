/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacex;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author Ruben
 */
public class Pantalla extends JPanel implements Runnable {

    private int direccion = -1; //inicializar la direccion
    private int pos_alien_x = 150;
    private int pos_alien_y = 25;
    private int muertes = 0; //inicializar el contador de muertes
    private Thread animacion;
    private Dimension dimension; //dimensiones
    private ArrayList aliens; //Lista de aliens
    private Jugador jugador; //Objeto Jugador
    private Disparo disparo; //Objeto disparo
    private final String explode = "imagenes/explosion.png";
    private final String alienimagen = "imagenes/alien1.png";

    private boolean enjuego = true;
    private boolean juegofinalizado;
    private final Variables var_global = new Variables();
    private boolean ganar;

    public Pantalla() {
        addKeyListener(new nuevoAdaptador());
        setFocusable(true);
        dimension = new Dimension(var_global.getANCHO_PANTALLA(), var_global.getALTO_PANTALLA());
        setBackground(Color.black);

        iniciarJuego();
        setDoubleBuffered(true);
    }

    public void animacionGeneralJuego() {
        if (muertes == var_global.getNUMERO_ALIENS()) {
            //se terminó el juego
            enjuego = false;
        }
        jugador.movimiento();
        if (disparo.isVisible()) {
            Iterator it = aliens.iterator();
            int shotX = disparo.getX();
            int shotY = disparo.getY();

            while (it.hasNext()) {
                Alien alien = (Alien) it.next();
                int alienX = alien.getX();
                int alienY = alien.getY();

                if (alien.isVisible() && disparo.isVisible()) {
                    //si el disparo coincide con la posicion del alien
                    if (shotX >= (alienX) && shotX <= (alienX + var_global.getANCHO_ALIEN())
                            && shotY >= (alienY)
                            && shotY <= (alienY + var_global.getALTURA_ALIEN())) {
                        ImageIcon imageicon = new ImageIcon(getClass().getResource(explode));
                        alien.setImagen(imageicon.getImage());
                        alien.setMuriendo(true);
                        muertes++;
                        //desaparecer disparo
                        disparo.morir();
                    }
                }
            }

            int y = disparo.getY();
            //disminuir la posicion del disparo
            //quiere decir que va para arriba
            y -= 8;
            if (y < 0) {
                disparo.morir();
            } else {
                disparo.setY(y);
            }
        }

        // aliens
        Iterator it1 = aliens.iterator();

        while (it1.hasNext()) {
            Alien a1 = (Alien) it1.next();
            int x = a1.getX();

            if (x >= var_global.getANCHO_PANTALLA() - var_global.getLIMITE_DERECHO() && direccion != -1) {
                direccion = -1;
                Iterator i1 = aliens.iterator();
                while (i1.hasNext()) {
                    Alien a2 = (Alien) i1.next();
                    a2.setY(a2.getY() + var_global.getGO_DOWN());
                }
            }

            if (x <= var_global.getLIMITE_IZQUIERDO() && direccion != 1) {
                direccion = 1;

                Iterator i2 = aliens.iterator();
                while (i2.hasNext()) {
                    Alien a = (Alien) i2.next();
                    a.setY(a.getY() + var_global.getGO_DOWN());
                }
            }
        }

        Iterator it = aliens.iterator();

        while (it.hasNext()) {
            Alien alien = (Alien) it.next();
            if (alien.isVisible()) {

                int y = alien.getY();
                //se perdió el juego ya que los aliens estan a la altura del suelo
                if (y > var_global.getGROUND() - var_global.getALTURA_ALIEN()) {
                    ganar = false;
                    enjuego = false;
                }
                alien.movimiento(direccion);
            }
        }

        //  lasers
        Iterator iteracion3 = aliens.iterator();
        Random generator = new Random();
        //iterar a los aliens para los disparos
        while (iteracion3.hasNext()) {
            int disparo_local = generator.nextInt(15);
            Alien a = (Alien) iteracion3.next();
            Laser laser = a.getLaser();
            if (disparo_local == var_global.getCHANCE() && a.isVisible() && laser.esDestruido()) {
                laser.setDestruido(false);
                laser.setX(a.getX());
                laser.setY(a.getY());
            }

            int jugadorX = jugador.getX();
            int jugadorY = jugador.getY();
            int laserX = laser.getX();
            int laserY = laser.getY();

            if (jugador.isVisible() && !laser.esDestruido()) {
                if (laserX >= (jugadorX) && laserX <= (jugadorX + var_global.getANCHO_ALIEN()) && laserY >= (jugadorY) && laserY <= (jugadorY + var_global.getALTO_JUGADOR())) {
                    ImageIcon imageicon = new ImageIcon(this.getClass().getResource(explode));
                    jugador.setImagen(imageicon.getImage());
                    jugador.setMuriendo(true);
                    laser.setDestruido(true);
                }
            }

            if (!laser.esDestruido()) {
                laser.setY(laser.getY() + 1);
                if (laser.getY() >= var_global.getGROUND() - var_global.getALTO_MISIL()) {
                    laser.setDestruido(true);
                }
            }
        }
    }

    @Override
    public void run() {
        long beforeTime, diferencia, sleep;

        beforeTime = System.currentTimeMillis();

        while (enjuego) {
            repaint();
            animacionGeneralJuego();

            diferencia = System.currentTimeMillis() - beforeTime;
            sleep = var_global.getDELAY() - diferencia;

            if (sleep < 0) {
                sleep = 1;
            }
            try {
                Thread.sleep(sleep);
            } catch (InterruptedException e) {
                System.out.println("interrupted");
            }
            beforeTime = System.currentTimeMillis();
        }
        terminarJuego();
    }

    public void terminarJuego() {
        //fin de juego
        System.out.println("terminó el juego");
    }

    public void iniciarJuego() {
        aliens = new ArrayList();
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 8; j++) {
                Alien alien = new Alien(pos_alien_x + 30 * j, pos_alien_y + 30 * i);
                aliens.add(alien);
            }
        }

        jugador = new Jugador(300, 400, "imagenes/jugador.png");
        disparo = new Disparo(300, 400);

        if (animacion == null || !enjuego) {
            //iniciar hilo del juego
            animacion = new Thread(this);
            animacion.start();
        }
    }

    public void dibujarAliens(Graphics g) {
        //Iterador para tener la lista de aliens
        Iterator it = aliens.iterator();
        //moverse dentro de la iteracion
        while (it.hasNext()) {
            Alien alien = (Alien) it.next();
            if (alien.isVisible()) {
                g.drawImage(alien.getImagen(), alien.getX(), alien.getY(), this);
            }
            //Si el alien tiene poca vida
            if (alien.isMuriendo()) {
                alien.morir();
            }
        }
    }

    public void dibujarLaser(Graphics g) {
        //por cada enemigo colocar un laser
        Iterator iterador = aliens.iterator();

        while (iterador.hasNext()) {
            Alien a = (Alien) iterador.next();
            Laser b = a.getLaser();
            if (!b.esDestruido()) {
                g.drawImage(b.getImagen(), b.getX(), b.getY(), this);
            }
        }
    }

    public void dibujarJugador(Graphics g) {
        if (jugador.isVisible()) {
            g.drawImage(jugador.getImagen(), jugador.getX(), jugador.getY(), this);
        }

       
        if (jugador.isMuriendo()) {
            jugador.morir();
            ganar = false;
            enjuego = false;
        }
    }

    public void dibujarDisparo(Graphics g) {
        if (disparo.isVisible()) {
            g.drawImage(disparo.getImagen(), disparo.getX(), disparo.getY(), this);
        }
    }

    public void paint(Graphics g) {
        super.paint(g);

        g.setColor(Color.black);


        if (enjuego) {
            enjuego = true;
            g.drawLine(0, var_global.getGROUND(), var_global.getANCHO_PANTALLA(), var_global.getGROUND());
            dibujarJugador(g);
            dibujarDisparo(g);
            dibujarLaser(g);
            dibujarAliens(g);
            
        }

        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    private class nuevoAdaptador extends KeyAdapter {

        public void keyReleased(KeyEvent e) {
            jugador.keyReleased(e);
        }

        public void keyPressed(KeyEvent e) {
            //obtener metodo de objeto jugador
            jugador.keyPressed(e);

            int x = jugador.getX();
            int y = jugador.getY();

            if (enjuego) {
                int key = e.getKeyCode();
                if (key == KeyEvent.VK_SPACE) {
                    if (!disparo.isVisible()) {
                        disparo = new Disparo(x, y);
                    }
                }
            }
        }
    }

}

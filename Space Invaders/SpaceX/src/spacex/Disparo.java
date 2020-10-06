/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacex;

import javax.swing.ImageIcon;

/**
 *
 * @author Ruben
 */
public class Disparo extends AbstractJugador {
    private String imagen_disparo = "imagenes/bala.png";
    private final int alto_space = 6;
    private final int vacio_space = 1;


    public Disparo(int pos_x, int pos_y) {
        ImageIcon imageicon = new ImageIcon(this.getClass().getResource(imagen_disparo));
        setImagen(imageicon.getImage());
        //posicionar la bala en x
        setX(pos_x + alto_space);
        // posicionar la bala en y
        setY(pos_y - vacio_space);
    }
}

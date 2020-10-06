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
public class Laser extends AbstractJugador{
    private final String imagen_laser = "imagenes/laser.png";
    private boolean destruido;
    public Laser(int pos_x, int pos_y){
        setDestruido(true);
        ImageIcon imageicon = new ImageIcon(this.getClass().getResource(imagen_laser));
        setImagen(imageicon.getImage());
        this.x = pos_x;
        this.y = pos_y;
    }
    
    public void setDestruido(boolean destruido) {
	this.destruido = destruido;
    }
    
    public boolean esDestruido(){
        return destruido;
    }
}


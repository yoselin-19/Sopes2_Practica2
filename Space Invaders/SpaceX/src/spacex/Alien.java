/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacex;

import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author Ruben
 */
public class Alien extends AbstractJugador{
    private Laser laser;
    private final String[] imagenes_alien = new String[]{"imagenes/alien1.png", "imagenes/alien2.png"};
    
    public Alien(int pos_x, int pos_y){
        this.x = pos_x;
        this.y = pos_y;
        //la posicion del laser del alien sera la misma que la del alien
        laser = new Laser(x, y);
        //imagen del alien
        //obtener una imagen aleatorea entre dos imagenes
        Random r = new Random();
        int low = 0;
        int high = 1;
        int result = r.nextInt((high-low)+1) + low;
        ImageIcon imageicon = new ImageIcon(this.getClass().getResource(imagenes_alien[result]));
        setImagen(imageicon.getImage());        
    }
    
    public void movimiento(int direccion) {
        this.x += direccion;
    }
    public Laser getLaser(){
        return laser;
    }
}

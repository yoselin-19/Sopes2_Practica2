/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacex;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;



/**
 *
 * @author Ruben
 */
public class Jugador extends AbstractJugador {
    private int ancho;
    private Variables var_global = new Variables();
    public Jugador(int pos_inicio_x, int pos_inicio_y, String imagen_jugador){
        ImageIcon imageicon = new ImageIcon(this.getClass().getResource(imagen_jugador));
        ancho = imageicon.getImage().getWidth(null); 
        setImagen(imageicon.getImage());
        setX(pos_inicio_x);
        setY(pos_inicio_y);
        
    }

    public void movimiento() {
        x += dx;
        if (x <= 2){
            x = 2;
        }            
        if (x >= var_global.getANCHO_PANTALLA() - 2 * ancho){
            x = var_global.getANCHO_PANTALLA() - 2 * ancho;
        }            
    }
    
    public void keyPressed(KeyEvent e) {
        //obtener la tecla que se ha presionado
        int tecla = e.getKeyCode();
        //si es a la derecha mover 2 pasos a la derecha
        if (tecla == KeyEvent.VK_D) {
            dx = 2;
        }
        //si es a la izquierda mover 2 pasos a la izquierda
        if (tecla == KeyEvent.VK_A) {
            dx = -2;
        }
    }
    
    public void keyReleased(KeyEvent e) {
        //obtener tecla
        int tecla = e.getKeyCode();
        //cuando se libera la tecla la diferencia en x es cero
        if (tecla == KeyEvent.VK_D || tecla == KeyEvent.VK_A ) {
            dx = 0;
        }
    }
}

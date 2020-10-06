/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spacex;

import java.awt.Image;

/**
 *
 * @author Ruben
 */
public class AbstractJugador {
    protected int x;
    protected int y;
    protected boolean muriendo = false;
    protected int dx;
    protected int dy; //no se usará
    private boolean visible = true;
    private Image imagen;
    
    
    public AbstractJugador(){
        visible = true;
        muriendo = false;
    }

    public void morir() {
        visible = false;
    }
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean isMuriendo() {
        return muriendo;
    }

    public void setMuriendo(boolean morir) {
        this.muriendo = morir;
    }

    public int getDx() {
        return dx;
    }

    public void setDx(int dx) {
        this.dx = dx;
    }

    public int getDy() {
        return dy;
    }

    public void setDy(int dy) {
        this.dy = dy;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }

    public Image getImagen() {
        return imagen;
    }

    public void setImagen(Image imagen) {
        this.imagen = imagen;
    }
    
    
        
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberodormilon;

import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author annel
 */
public class Silla {
    private JPanel elemento;
    private boolean estado;

    public Silla(JPanel elemento, boolean estado) {
        this.elemento = elemento;
        this.estado = estado;
    }

    public JPanel getElemento() {
        return elemento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setColor(JPanel elemento, Color col) {
        elemento.setBackground(col);
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}

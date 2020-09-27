/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberodormilon;

import static barberodormilon.BarberoDormilon.atendidos;
import static barberodormilon.BarberoDormilon.lbl_atendidos;
import static barberodormilon.BarberoDormilon.retirados;
import java.awt.Color;

/**
 *
 * @author annel
 */
public class HiloBarbero implements Runnable {

    ColaSillas<Silla> cola;
    private boolean estado;
    private boolean trabaja;
    private int total;

    public HiloBarbero(ColaSillas<Silla> cola, int total) {
        this.cola = cola;
        this.estado = false;
        this.trabaja = false;
        this.total = total;
    }

    @Override
    public void run() {
        while (atendidos + retirados <= total) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            
            if (!estado) {
                try {
                    Thread.sleep(50);
                } catch (Exception e) {
                }
                BarberoDormilon.jp_barbero.setBackground(Color.red);
                this.cola.remover();
                estado = true;
            } else { //Cortando pelo
                try {
                    Thread.sleep(100);
                } catch (Exception e) {
                }
                estado = false;
                lbl_atendidos.setText("" + atendidos);
                atendidos++;
                BarberoDormilon.jp_barbero.setBackground(Color.cyan);
            }
        }

    }
}

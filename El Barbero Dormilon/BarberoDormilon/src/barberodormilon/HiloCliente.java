/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberodormilon;

import static barberodormilon.BarberoDormilon.lbl_retirados;
import static barberodormilon.BarberoDormilon.retirados;

/**
 *
 * @author annel
 */
public class HiloCliente implements Runnable {

    ColaSillas<Silla> cola;

    public HiloCliente(ColaSillas<Silla> cola) {
        this.cola = cola;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(50);
        } catch (Exception e) {
        }
        if (this.cola.getContador() < this.cola.getMax()) { //Si se puede agregar clientes a la cola
            try {
                Thread.sleep(50);
            } catch (Exception e) {
            }
            this.cola.insertar();
        } else { //No se pueden agregar mas cliente a la cola
            try {
                Thread.sleep(100);
            } catch (Exception e) {
            }
            retirados++;
            try {
                Thread.sleep(300);
            } catch (Exception e) {
            }
            lbl_retirados.setText("" + retirados);
        }
    }
}

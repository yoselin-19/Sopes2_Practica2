/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberodormilon;

import java.awt.Color;
import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import barberodormilon.BarberoDormilon;

/**
 *
 * @author annel
 */
public class ColaSillas<E> {

    private int max;
    private LinkedList<E> cola;
    private int contador;

    // concurrencia
    private ReentrantLock bloqueo = new ReentrantLock(true);
    private Condition noVacio = bloqueo.newCondition();
    private Condition noLleno = bloqueo.newCondition();

    public ColaSillas(int max) {
        this.max = max;
        this.cola = new LinkedList<>();
        this.contador = 0;
    }

    public void insertar() {
        bloqueo.lock();
        try {
            while (this.getContador() == this.getMax()) {
                noLleno.wait();
            }

            //Agregando el elemento
            for (int i = 0; i < cola.size(); i++) {
                Silla e = (Silla) cola.get(i);
                if (!e.isEstado()) {
                    e.setEstado(true);
                    e.setColor(e.getElemento(), Color.red);
                    this.contador++;
                    break;
                }
            }
            noVacio.signalAll();
        } catch (Exception e) {
        } finally {
            bloqueo.unlock();
        }
    }

    public void remover() {
        bloqueo.lock();
        try {
            while (this.getContador() == 0) {
                noVacio.wait();
            }
            //Eliminando el elemento
            for (int i = 0; i < cola.size(); i++) {
                Silla e = (Silla) cola.get(i);
                if (e.isEstado()) {
                    e.setEstado(false);
                    e.setColor(e.getElemento(), Color.yellow);
                    this.contador--;
                    break;
                }
            }
            noLleno.signalAll();
        } catch (Exception e) {
        } finally {
            bloqueo.unlock();
        }
    }

    public void print() {
        for (int i = 0; i < this.cola.size(); i++) {
            System.out.println("Se insertó en : [" + i + "] - valor : " + cola.get(i));
        }
    }

    public int getMax() {
        return max;
    }

    public LinkedList<E> getCola() {
        return cola;
    }

    public int getContador() {
        return contador;
    }

}

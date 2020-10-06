/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopes2_practica2_parte1;

import java.awt.Color;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;

/**
 *
 * @author bredly
 */
public class HiloColaIn implements Runnable {

    
    public LinkedList<Integer> listaIn;
    ReentrantLock lockIn;
    public HiloColaIn(LinkedList<Integer> listaIN){
        this.listaIn = listaIN;
        this.lockIn = new ReentrantLock();
    }
    
    @Override
    public void run() {
        while(true){
            try {
                verificandoListaIn();
                Thread.sleep(Ventana.timerOut);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
    
    
    private void verificandoListaIn(){
        try {
            this.lockIn.lock();
            if(this.listaIn.isEmpty()) return;
            if(Estanteria.espaciosOcupados > 20){
                Ventana.logs.append("Se quiso colocar una caja de la cola, pero esta llena la estanteria\n\n");
                return;
            }
            
            if(Estanteria.verDisponibilidad(this.listaIn.getFirst()) == 0){// si ahora quiere colocar en un indice vacio
                Estanteria.llenandoIndiceEstanteria(this.listaIn.getFirst());
                Ventana.arregloLabel[this.listaIn.getFirst()].setBackground(Color.BLACK);
                Ventana.logs.append("Se colocó caja en indice " + this.listaIn.getFirst() + ", desde la cola.\n\n");
                this.listaIn.removeFirst();
                Ventana.lblTotalColaIn.setText(String.valueOf(this.listaIn.size()));
                return;
            }
            Ventana.logs.append("Se trato de colocar en indice " + this.listaIn.getFirst() + ", pero esta ocupado, por lo que sigue en cola.\n\n");
        } catch(Exception e){
            
        } finally {
            this.lockIn.unlock();
        }
    }
    
    
    
}

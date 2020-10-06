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
public class HiloColaOut implements Runnable {
    
    
    public LinkedList<Integer> listaOut;
    ReentrantLock lockIn;
    public HiloColaOut(LinkedList<Integer> listaIN){
        this.listaOut = listaIN;
        this.lockIn = new ReentrantLock();
    }
    
    @Override
    public void run() {
        while(true){
            try {
                verificandoListaOut();
                Thread.sleep(Ventana.timerOut);
            } catch (InterruptedException e) {
                return;
            }
        }
    }
    
    
    private void verificandoListaOut(){
        try {
            this.lockIn.lock();
            if(this.listaOut.isEmpty()) return;
            
            if(Estanteria.espaciosOcupados == 0){
                Ventana.logs.append("Quiso sacar del indice " + this.listaOut.getFirst() + ", pero la estanteria esta vacia\n\n");
                return;
            }
            
            if(Estanteria.verDisponibilidad(this.listaOut.getFirst()) == 1){
                
                Estanteria.vaciandoIndiceEstanteria(this.listaOut.getFirst());
                Ventana.arregloLabel[this.listaOut.getFirst()].setBackground(Color.WHITE);
                Ventana.logs.append("Se saco del indice " + this.listaOut.getFirst() + " desde la cola\n\n");
                this.listaOut.removeFirst();
                Ventana.lblTotalColaOut.setText(String.valueOf(this.listaOut.size()));
                return;
            }
            Ventana.logs.append("La persona en cola trato de sacar caja de un indice vacio: " + this.listaOut.getFirst() + ". Sigue esperando...\n\n");
            
        } catch (Exception e) {
        } finally {
            this.lockIn.unlock();
        }
    }
    
    
}

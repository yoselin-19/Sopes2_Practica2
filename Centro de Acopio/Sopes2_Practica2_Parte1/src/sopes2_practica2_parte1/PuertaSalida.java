/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopes2_practica2_parte1;

import java.awt.Color;
import java.util.LinkedList;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bredly
 */
public class PuertaSalida implements Runnable {
    
    private boolean estaAbierta = true; 
    public LinkedList<Integer> listaOut;
    ReentrantLock lockIn;
    
    public PuertaSalida(LinkedList<Integer> listaEsperaOut){
        this.lockIn = new ReentrantLock();
        this.listaOut = listaEsperaOut;
    }
    
    @Override
    public void run() {
        //sacandoCajaDeEstanteria();
        while(estaAbierta){
            try {
                sacandoCajaDeEstanteria();
                Thread.sleep(Ventana.timerSleep);
                verificandoListaOut();
                Thread.sleep(Ventana.timerSleep);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
                return;
                //Logger.getLogger(PuertaEntrada.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
    }
    
    /* ES LOCK PARA PERMITIR QUE NO SE TRASLAPEN LOS HILOS Y UNICAMENTE SE PUEDA COLOCAR EN UNA POSICION DE LA ESTANTERIA*/
    private void sacandoCajaDeEstanteria(){
        try {
            this.lockIn.lock();
            int indice = Estanteria.getIndiceRandom();
            if(Estanteria.espaciosOcupados > 0){
                Ventana.logs.append("Se quiere sacar caja de indice " + indice + ", cajas colocadas: " + Estanteria.espaciosOcupados + "\n\n");
                if(Estanteria.verDisponibilidad(indice) == 0){
                    Ventana.logs.append("Quiso sacar caja de indice vacio: " + indice + " , va a cola\n\n");
                    this.listaOut.add(indice);
                    Ventana.lblTotalColaOut.setText(String.valueOf(this.listaOut.size()));
                    return;
                }
                Estanteria.vaciandoIndiceEstanteria(indice);
                Ventana.arregloLabel[indice].setBackground(Color.WHITE);
                Ventana.logs.append("Se saco del indice " + indice + " de la estantería\n\n");            
            }
            else{
                Ventana.logs.append("Error al sacar caja de indice " + indice + ", La estanteria está vacia, mandando a cola\n\n");
                this.listaOut.add(indice);
                Ventana.lblTotalColaOut.setText(String.valueOf(this.listaOut.size()));
            }
        } catch (Exception e) {
        } finally {
            this.lockIn.unlock();
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
    
    
    public boolean getEstaAbierta(){
        return this.estaAbierta;
    }
    
    public void setEstaAbierta(boolean nuevoValor){
        this.estaAbierta = nuevoValor;
    }
    
    
    
    
}

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
public class PuertaEntrada implements Runnable {
    
    ReentrantLock lockIn;
    public LinkedList<Integer> listaIn;
    
    public PuertaEntrada(LinkedList<Integer> listaEsperaIn){
        this.lockIn = new ReentrantLock();
        this.listaIn = listaEsperaIn;
    }
    
    
    @Override
    public void run() {
        //colocandoCajaEnEstanteria();
        while(true){
            try {
                colocandoCajaEnEstanteria();
                Thread.sleep(Ventana.timerSleep);
            } catch (InterruptedException ex) {
                //System.out.println(ex.getMessage());
                return;
            }
        }
    }
    
    /* ES PARA PERMITIR QUE NO SE TRASLAPEN LOS HILOS Y UNICAMENTE SE PUEDA COLOCAR EN UNA POSICION DE LA ESTANTERIA*/
    private void colocandoCajaEnEstanteria(){
        
        try {
            this.lockIn.lock();
            int indice = Estanteria.getIndiceRandom();
            if(Estanteria.espaciosOcupados < 20){    
                Ventana.logs.append("Se quiere colocar caja en indice " + indice + ", espacios ocupados: " + Estanteria.espaciosOcupados + "\n");
                if(Estanteria.verDisponibilidad(indice) == 1){
                    Ventana.logs.append("Quiso colocar en indice ocupado: " + indice + " , va a cola\n\n");
                    this.listaIn.add(indice);
                    Ventana.lblTotalColaIn.setText(String.valueOf(this.listaIn.size()));
                    return;
                }
                Estanteria.llenandoIndiceEstanteria(indice);
                Ventana.arregloLabel[indice].setBackground(Color.BLACK);
                Ventana.logs.append("Se colocó caja en indice " + indice + "\n\n");
            }
            else{
                Ventana.logs.append("Error al ingresar caja en indice" + indice + ", la estanteria está llena, mandando a cola\n\n");
                this.listaIn.add(indice);
                Ventana.lblTotalColaIn.setText(String.valueOf(this.listaIn.size()));
            }
        } catch (Exception e) {
        } finally {
            this.lockIn.unlock();
        }
    }
}

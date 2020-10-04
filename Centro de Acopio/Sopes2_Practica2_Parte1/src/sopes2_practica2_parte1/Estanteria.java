/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sopes2_practica2_parte1;

import java.awt.Color;

/**
 *
 * @author bredly
 */
public class Estanteria {
    
    public static int [] miEstanteria = new int[20];
    //0 - no hay nada en esa posicion de la estanteria
    //1 - hay una caja ocupando en esa posicion de la estanteria
    public static int espaciosOcupados = 0;
    
    public Estanteria(){//inicializando toda la estanteria como vacia
        for(int i = 0; i < 20; i++){
            miEstanteria[i] = 0;
        }
    }
    
    public static int getIndiceOcupado(){
        for(int i = 0; i < 20; i++){
            if(miEstanteria[i] == 1)
                return i;
        }
        return -1;
    }
    
    public static int getIndiceRandom(){
        double valor = Math.random() * 19;
        return (int)valor;
    }
    
    public synchronized static int verDisponibilidad(int indice){
        return miEstanteria[indice];
    }
    
    public static int getIndiceVacio() {
        for(int i = 0; i < 20; i++){
            if(miEstanteria[i] == 0)
                return i;
        }
        return -1;
    }
    
    public int [] getMiEstanteria(){
        return miEstanteria;
    }
    
    public static void reiniciandoEstanteria (){
        for(int i = 0; i < 20; i++){
            miEstanteria[i] = 0;
            Ventana.arregloLabel[i].setBackground(Color.WHITE);
        }
        espaciosOcupados = 0;
    }
    
    public synchronized static void vaciandoIndiceEstanteria(int indice){
        miEstanteria[indice] = 0;
        espaciosOcupados--;
    }
    
    public static void llenandoIndiceEstanteria(int indice){
        miEstanteria[indice] = 1;
        espaciosOcupados++;
    }
    
    
    
}

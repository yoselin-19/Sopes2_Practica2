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
public class ColaSillas <E> {
    private int max;
    private LinkedList<E> cola ;
    
    // concurrencia
    private ReentrantLock bloqueo = new ReentrantLock(true);
    private Condition noVacio = bloqueo.newCondition();
    private Condition noLleno = bloqueo.newCondition();

    public ColaSillas(int max) {
        this.max = max;
        this.cola = new LinkedList<>();
    }
    
    public void insertar(E element){
        
        bloqueo.lock();
        
        try {
            
            while(cola.size() == max){
                noLleno.wait(); // -> 4 productores esperando
            }
            // ---> 4 continuan
            
            cola.add(element);
            int tam = cola.size();
            pintarSillas(tam, true);
                   
            noVacio.signalAll();  // -> 1 productor insertó
            
            //noVacio.signal();
 
        } catch (Exception e) {
            
        } finally {
            bloqueo.unlock();
        }
    }
    
    public E remover(){
        bloqueo.lock();
        
        try {
            
            while(cola.size() == 0){
                noVacio.wait();  // -> 3 consumidores esprando
            }
            // -> 3 consumidores van a retirar
            
            E element = cola.remove();
            
            noLleno.signalAll();  // -> Libere 2 
            int tam = cola.size();
            pintarSillas(tam, false);
            BarberoDormilon.jp_barbero.setBackground(Color.red);
            BarberoDormilon.atendidos++;
            try{
                Thread.sleep(600);
            }catch(Exception e){}
            
            BarberoDormilon.jp_barbero.setBackground(Color.cyan);
            
            return element;
            
            
        } catch (Exception e) {
            
            return null;
        } finally {
            bloqueo.unlock();
        }
    }
    
    public void print(){
        for (int i = 0; i < this.cola.size(); i++) {
            System.out.println( "Se insertó en : [" +i + "] - valor : " +  cola.get(i));
            
        }
    }
    
    public void pintarSillas(int num, boolean tipo){
        Color col;
        if (tipo){
            col = Color.red;
        } else{
            col = Color.yellow;
        }
        switch(num){
            case 1:
                BarberoDormilon.jp_1.setBackground(col);
                break;
            case 2:
                BarberoDormilon.jp_2.setBackground(col);
                break;
            case 3:
                BarberoDormilon.jp_3.setBackground(col);
                break;
            case 4:
                BarberoDormilon.jp_4.setBackground(col);
                break;
            case 5:
                BarberoDormilon.jp_5.setBackground(col);
                break;
            case 6:
                BarberoDormilon.jp_6.setBackground(col);
                break;
            case 7:
                BarberoDormilon.jp_7.setBackground(col);
                break;
            case 8:
                BarberoDormilon.jp_8.setBackground(col);
                break;
            case 9:
                BarberoDormilon.jp_9.setBackground(col);
                break;
            case 10:
                BarberoDormilon.jp_10.setBackground(col);
                break;
            case 11:
                BarberoDormilon.jp_11.setBackground(col);
                break;
            case 12:
                BarberoDormilon.jp_12.setBackground(col);
                break;
            case 13:
                BarberoDormilon.jp_13.setBackground(col);
                break;
            case 14:
                BarberoDormilon.jp_14.setBackground(col);
                break;
            case 15:
                BarberoDormilon.jp_15.setBackground(col);
                break;
            case 16:
                BarberoDormilon.jp_16.setBackground(col);
                break;
            case 17:
                BarberoDormilon.jp_17.setBackground(col);
                break;
            case 18:
                BarberoDormilon.jp_18.setBackground(col);
                break;
            case 19:
                BarberoDormilon.jp_19.setBackground(col);
                break;
            case 20:
                BarberoDormilon.jp_20.setBackground(col);
                break;                
        }
    }
    
    public int getSizeCola(){
        return cola.size();
    }
}

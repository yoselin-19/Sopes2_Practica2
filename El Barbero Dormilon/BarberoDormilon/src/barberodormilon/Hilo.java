/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberodormilon;

/**
 *
 * @author annel
 */
public class Hilo implements Runnable {
    
    ColaSillas<Integer> cola;
    int numero;

    public Hilo(ColaSillas<Integer> cola, int numero) {
        this.cola = cola;
        this.numero = numero;
    }

    @Override
    public void run() {
        if(this.cola.getSizeCola()>0){
            cola.remover();
        }else if(this.cola.getSizeCola()==20){
            BarberoDormilon.retirados++;
        }else{
            cola.insertar(numero);            
        }
//        Random r = new Random();
//        int random_number = r.nextInt(2);
//        
//        if(random_number == 0){
//            cola.insertar(numero);
//        } else {
//            cola.remover();
//        }
    }
}

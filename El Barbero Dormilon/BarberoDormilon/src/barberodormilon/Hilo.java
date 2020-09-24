/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barberodormilon;

import static barberodormilon.BarberoDormilon.lbl_retirados;
import static barberodormilon.BarberoDormilon.retirados;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author annel
 */
public class Hilo implements Runnable {

    ColaSillas<Silla> cola;
    int numero;

    public Hilo(ColaSillas<Silla> cola, int numero) {
        this.cola = cola;
        this.numero = numero;
    }

    @Override
    public void run() {
        ExecutorService clientes = Executors.newCachedThreadPool();
        for (int i = 0; i < this.numero; i++) {
            try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
            clientes.execute(new HiloCliente(cola));
        }
        
        clientes.shutdown();
        
        try {
            clientes.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
        } catch (Exception e) {
        }
    }

}

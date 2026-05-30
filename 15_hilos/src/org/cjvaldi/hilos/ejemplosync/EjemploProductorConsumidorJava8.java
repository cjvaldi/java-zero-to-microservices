package org.cjvaldi.hilos.ejemplosync;

import org.cjvaldi.hilos.ejemplosync.runnable.Consumidor;
import org.cjvaldi.hilos.ejemplosync.runnable.Panadero;

import java.util.concurrent.ThreadLocalRandom;

public class EjemploProductorConsumidorJava8 {
    public static void main(String[] args) {

        Panaderia p = new Panaderia();
        /* Aquí usamos expresiones Landa para gestionar los metodos run de Consumidor y Panadero*/
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                p.hornear("Pan nº: " + i);
                try {
                    Thread.sleep(ThreadLocalRandom.current().nextInt(500, 2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                p.consumir();
            }
        }).start();
    }
}

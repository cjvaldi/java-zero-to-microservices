package org.cjvaldi.hilos.ejemplos;

import org.cjvaldi.hilos.ejemplos.runnable.ImprimirFrase;

public class EjemploSincronizacionThread {
    public static void main(String[] args) throws InterruptedException {

        new Thread(new ImprimirFrase("Hola ","que tal!")).start();
        new Thread(new ImprimirFrase("¿Quien eres ","tú?")).start();
        Thread.sleep(100);
        Thread h3 = new Thread(new ImprimirFrase("Muchas ","gracias amigo!"));
        h3.start();
        Thread.sleep(100);
        System.out.println(h3.getState());

    }

    /* synchronized hace que termine y luego continue con el siguiente hi
    lo */
    public synchronized static void imprimirFrases(String frase1, String frase2){
        System.out.print(frase1);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(frase2);
    }
}

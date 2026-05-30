package org.cjvaldi.hilos.ejemplotimer;

import java.awt.*;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.atomic.AtomicInteger;

public class EjemploAgendarTareaTimerPeriodo {
    public static void main(String[] args) {

        // Sonido
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        // Alternativa al contador
        AtomicInteger contadorAtomic = new AtomicInteger(3);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            //private int contador = 3;

            @Override
            public void run() {
                int i = contadorAtomic.getAndDecrement();
                //if (contador > 0) {
                if (i > 0) {
                    toolkit.beep();
                    //System.out.println("Tarea " + contador + " periódica en: "
                    System.out.println("Tarea " + i + " periódica en: "
                            + new Date() + " nombre del Thread: "
                            + Thread.currentThread().getName());  // para ver el nombre del Thread actual
                    //contador--;
                } else {
                    System.out.println("Finaliza el tiempo");
                    timer.cancel();  // se le agrega un contador
                }
            }
        }, 1000, 10000);
        System.out.println("Agendamos una tarea inmediata que se repite cada 10 segundos .....");
    }
}

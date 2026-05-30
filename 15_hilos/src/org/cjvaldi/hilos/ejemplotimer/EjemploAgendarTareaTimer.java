package org.cjvaldi.hilos.ejemplotimer;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class EjemploAgendarTareaTimer {
    public static void main(String[] args) {

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Tarea realizada en: "+new Date()+" nombre del Thread:"
                +Thread.currentThread().getName());  // para ver el nombre del Thread actual
                System.out.println("Finaliza el tiempo");
                timer.cancel();
            }
        },5000);
        System.out.println("Agendamos una tarea para 5 segundos más.....");
    }
}

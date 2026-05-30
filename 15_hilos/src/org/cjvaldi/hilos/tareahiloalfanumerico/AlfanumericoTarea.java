package org.cjvaldi.hilos.tareahiloalfanumerico;

import java.util.concurrent.TimeUnit;

public class AlfanumericoTarea implements Runnable {

    // Definición del enum Tipo
    public enum Tipo {NUMERO, LETRA}

    private final Tipo tipo;

    public AlfanumericoTarea(Tipo tipo) {
        this.tipo = tipo;
    }

    @Override
    public void run() {
        try {
            switch (tipo) {
                case NUMERO:
                    // Del 1 al 10 excluyendo el último (es decir, hasta el 9)
                    for (int i = 1; i < 10; i++) {
                        System.out.println(Thread.currentThread().getName() + "- Número: " + i);
                        TimeUnit.MILLISECONDS.sleep(100);
                    }
                    break;
                case LETRA:
                    for (char c = 'A'; c <= 'Z'; c++) {
                        System.out.println(Thread.currentThread().getName() + "- Letra: " + c);
                        TimeUnit.MILLISECONDS.sleep(100);
                    }
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.err.println("El hilo fue interrumpido: " + e.getMessage());
        }
    }
}

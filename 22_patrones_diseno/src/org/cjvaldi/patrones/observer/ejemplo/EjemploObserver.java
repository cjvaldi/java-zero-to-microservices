package org.cjvaldi.patrones.observer.ejemplo;

import org.cjvaldi.patrones.observer.Corporacion;

public class EjemploObserver {
    public static void main(String[] args) {
        Corporacion google = new Corporacion("Google", 1000);
        google.addObserver((observable, obj) -> {
            System.out.println("Jhon: " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Cristian: " + observable);
        });

        google.addObserver((observable, obj) -> {
            System.out.println("Jacson: " + observable);
        });

        google.modificaPrecio(2000);

    }
}

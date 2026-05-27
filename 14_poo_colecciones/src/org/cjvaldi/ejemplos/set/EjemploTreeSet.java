package org.cjvaldi.ejemplos.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSet {
    public static void main(String[] args) {

        Set<String> ts = new TreeSet<>((a,b) -> b.compareTo(a)); // ordena de forma natural alfabética,pero no repite, la función flecha ordena al revés
//        Set<String> ts = new TreeSet<>(Comparator.reverseOrder()); // ordena de forma natural alfabética,pero no repite,
        ts.add("uno");
        ts.add("dos");
        ts.add("tres");
        ts.add("tres");
        ts.add("cuatro");
        ts.add("cinco");

        System.out.println("ts = " + ts);

//        Set<Integer> numeros = new TreeSet<>();
        Set<Integer> numeros = new TreeSet<>(Comparator.reverseOrder());
        numeros.add(1);
        numeros.add(5);
        numeros.add(4);
        numeros.add(2);
        numeros.add(3);
        numeros.add(10);
        System.out.println("numeros = " + numeros);
    }
}

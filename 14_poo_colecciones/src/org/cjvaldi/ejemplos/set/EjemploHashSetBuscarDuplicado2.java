package org.cjvaldi.ejemplos.set;

import java.util.HashSet;
import java.util.Set;

public class EjemploHashSetBuscarDuplicado2 {
    public static void main(String[] args) {

        String[] peces = {"Corvina", "Lenguado", "Pejerrey", "Robalo", "Atun", "Lenguado"};

        Set<String> unicos = new HashSet<>();
        Set<String> duplicados = new HashSet<>();
        for (String pez : peces) {
            if (!unicos.add(pez)) {
                duplicados.add(pez);
            }
        }
        unicos.removeAll(duplicados);
        System.out.println(unicos.size() + " Unicos : " + unicos);
        System.out.println(duplicados.size() + " Duplicados : " + duplicados);
    }
}

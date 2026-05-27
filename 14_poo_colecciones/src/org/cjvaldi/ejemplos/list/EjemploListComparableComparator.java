package org.cjvaldi.ejemplos.list;

import org.cjvaldi.ejemplos.modelo.Alumno;

import java.util.*;


public class EjemploListComparableComparator {
    public static void main(String[] args) {

        //List<Alumno> sa = new ArrayList<>();
        List<Alumno> sa = new LinkedList<>();
        sa.add(new Alumno("Pato",5));
        sa.add(new Alumno("Cata",6));
        sa.add(new Alumno("Luci",4));
        sa.add(new Alumno("Jano",7));
        sa.add(new Alumno("Andres",3));
        sa.add(new Alumno("Zeus2",2));
        sa.add(new Alumno("Zeus",2));
        sa.add(new Alumno("Lucas",2));
        sa.add(new Alumno("Lucas",3));
        //para sobreescribir el compareTo de la clase
        //Collections.sort(sa,(a,b)->b.getNota().compareTo(a.getNota())); // este es el método propuesto
        // y la alternativa es: sa.sort
        //sa.sort((a,b)->a.getNota().compareTo(b.getNota())); // nota de menor a mayor
        //sa.sort((a,b)->b.getNota().compareTo(a.getNota())); // nota de mayor a menor

        //java 8 y diferentes formas
        //sa.sort(Comparator.comparing((Alumno a)->a.getNota()));  // orden normal de menor a mayor
        //sa.sort(Comparator.comparing((Alumno a)->a.getNota()).reversed()); se puede simplificar
        //sa.sort(Comparator.comparing(Alumno::getNota).reversed());
        //sa.sort(Comparator.comparing(Alumno::getNota));
        sa.sort(Comparator.comparing(Alumno::getNombre));
        System.out.println(sa);

        System.out.println("Iterando usando Stream forEach");
        sa.forEach(System.out::println);

    }
}

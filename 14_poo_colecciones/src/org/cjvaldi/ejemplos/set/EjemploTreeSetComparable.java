package org.cjvaldi.ejemplos.set;

import org.cjvaldi.ejemplos.modelo.Alumno;

import java.util.Set;
import java.util.TreeSet;

public class EjemploTreeSetComparable {
    public static void main(String[] args) {

        // Deferentes formas de ordenar
        //Set<Alumno> sa = new TreeSet<>();  // esto sería la comparacion por defecto con nota
        //Set<Alumno> sa = new TreeSet<>((a,b)->a.getNombre().compareTo(b.getNombre())); // compara por nombre, sobreescribe
        Set<Alumno> sa = new TreeSet<>((a,b)->b.getNombre().compareTo(a.getNombre())); // compara por nombre, descendente
        //Set<Alumno> sa = new TreeSet<>((a,b)->b.getNota().compareTo(a.getNota())); // compara por nota, descendente
        // no permite duplicados, pero depende del campo de comparación, ej: no pueden haber mismas notas o mismos nombres
        sa.add(new Alumno("Pato",5));
        sa.add(new Alumno("Cata",6));
        sa.add(new Alumno("Luci",4));
        sa.add(new Alumno("Jano",7));
        sa.add(new Alumno("Andres",3));
        sa.add(new Alumno("Cristian",8));
        sa.add(new Alumno("Lucas",8)); // si fuera por nota no lo tomaría
        System.out.println(sa);

    }
}

package org.cjvaldi.ejemplos.list;

import org.cjvaldi.ejemplos.modelo.Alumno;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static java.util.Comparator.comparing;


public class EjemploArrayList {
    public static void main(String[] args) {

        List<Alumno> al = new ArrayList<>();
        System.out.println(al + ", size = " + al.size());
        System.out.println("está vacía = " + al.isEmpty());
        al.add(new Alumno("Pato", 5));
        al.add(new Alumno("Cata", 6));
        al.add(new Alumno("Luci", 4));
        al.add(2, new Alumno("Jano", 7));  // agrega en la posición
        al.set(3, new Alumno("Andres", 3));     // modifica

        System.out.println(al + ", size : " + al.size());

        // al.remove(new Alumno("Jano",7));    // elimina si coincide nombre y nota método equal de la clase alumno  ==== > return Objects.equals(nombre, alumno.nombre) && Objects.equals(nota, alumno.nota);
        al.remove(2); // remueve por indice
        System.out.println(al + ", size : " + al.size());

        boolean b = al.contains(new Alumno("Jano", 7));
        System.out.println("La lista contiene a Jano =" + b);

        Object a[] = al.toArray();
        for (int i = 0; i < a.length; i++) {
            System.out.println("desde el arreglo = " + a[i]);
        }

    }
}

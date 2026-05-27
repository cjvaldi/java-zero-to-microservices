package org.cjvaldi.ejemplos.set;

import org.cjvaldi.ejemplos.modelo.Alumno;

import java.util.*;

public class EjemploTreeSetUnicidad {
    public static void main(String[] args) {

        Set<Alumno> sa = new HashSet<>();  // no permite elementos con mismo nombre y código
        //List<Alumno>sa = new ArrayList<>();  // támbien funciona
        //List<Alumno>sa = new LinkedList<>();  // támbien funciona
        sa.add(new Alumno("Pato",5));
        sa.add(new Alumno("Cata",6));
        sa.add(new Alumno("Luci",4));
        sa.add(new Alumno("Jano",7));
        sa.add(new Alumno("Andres",3));
        sa.add(new Alumno("Cristian",2));
        sa.add(new Alumno("CristianJ",2));
        sa.add(new Alumno("Lucas",2));
        sa.add(new Alumno("Lucas",3));
        System.out.println(sa);

        // para List<> y LinkedList<>,,para otras dan error (HashSet)
       /* System.out.println("Utilizando un for clasico");
        for (int i = 0; i < sa.size(); i++) {
            Alumno a = sa.get(i);
            System.out.println(a.getNombre());
        }*/

        System.out.println("iterando usando un forEach");
        for (Alumno a: sa){
            System.out.println(a.getNombre() );
        }

        System.out.println("Iterando usando While y iterator");
        Iterator<Alumno> it = sa.iterator();
        while(it.hasNext()){
            Alumno a = it.next();
            System.out.println(a.getNombre());
        }

        System.out.println("Iterando usando Stream forEach o Lamda");
//        sa.forEach(a-> System.out.println(a.getNombre()) ); // se simplifica
        sa.forEach(System.out::println);

    }
}

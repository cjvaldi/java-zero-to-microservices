package org.cjvaldi.api.stream.ejemplos;

import org.cjvaldi.api.stream.ejemplos.models.Usuario;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamDistinctUsuarioSum {
    public static void main(String[] args) {

        IntStream largoNombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena",
                        "Pepe Garcia","Pato Guzman","Pato Guzman")

                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .distinct()
                .mapToInt(u->u.toString().length())
                .peek(System.out::println);  //largoNombres.forEach(System.out::println);


        //largoNombres.forEach(System.out::println); //
        IntSummaryStatistics stats = largoNombres.summaryStatistics();
        System.out.println("Total = " + stats.getSum());
        System.out.println("Max = " + stats.getMax());
        System.out.println("Min = " + stats.getMin());
        System.out.println("Promedio = " + stats.getAverage());
        System.out.println("sCantidad = " + stats.getCount());


    }
}

package org.cjvaldi.api.stream.ejemplos;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class EjemploStreamRange {
    public static void main(String[] args) {

        //IntStream num = IntStream.range(5,20).peek(System.out::println); // no incluye b
        IntStream num = IntStream.rangeClosed(5,20).peek(System.out::println); // incluye a b

        //int resultado = num.reduce(0, Integer::sum);  // suma total
        //int resultado = num.sum();  // suma total
        IntSummaryStatistics stats =  num.summaryStatistics();
        System.out.println("max = " + stats.getMax());
        System.out.println("min = " + stats.getMin());
        System.out.println("sum = " + stats.getSum());
        System.out.println("promedio = " + stats.getAverage());
        System.out.println("total = " + stats.getCount());


    }
}

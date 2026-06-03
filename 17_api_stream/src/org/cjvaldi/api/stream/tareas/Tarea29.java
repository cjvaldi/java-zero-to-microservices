package org.cjvaldi.api.stream.tareas;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

/*
Tarea 29 Modificar flujo y devolver la suma.

Como desafió consiste en un arreglo de 100 elementos del 1 al 100, del tipo int, 
utilizando el api stream se pide eliminar los divisibles en 10, 
luego convertir los elementos restante del flujo en tipo double y dividirlos en 2, 
para finalmente devolver la suma total de todos ellos usando el operador terminal reduce. 
El resultado debería ser 2250.0
 */
public class Tarea29 {
    public static void main(String[] args) {

        // 1. Creamos el arreglo de 10 elementos (del 1 al 100).
        int[] numeros = IntStream.rangeClosed(1, 100).toArray();

        // 2. Procesamos el flujo utilizando la AI Stream
        double resultadoSuma = Arrays.stream(numeros)
                // Filtrar: eliminar los divisibles por 10 (nos quedamos con los que NO son divisibles)
                .filter(n -> n % 10 != 0)
                // Transformar: convertir a double y dividir por 2
                .mapToDouble(n -> (double) n / 2)
                // Operador terminal: Reducir sumando todos los elementos restantes
                .reduce(0.0, (acumulador, elemento) -> acumulador + elemento);

        // 3. Mostrar resultado
        System.out.println("Suma total: " + resultadoSuma);
    }
}

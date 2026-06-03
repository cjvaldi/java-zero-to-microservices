package org.cjvaldi.api.stream.tareas;

import java.util.Arrays;
import java.util.function.Function;

/*
Tarea 30: Obtener el numero mayor en un arreglo
El siguiente ejercicio es obtener el numero mayor de un arreglo pero utilizando
programación funcional, implementando la expresión lambda Function<T,R>
(que viene predefinida) con el api stream y operador reduce.
 */
public class Tarea30 {
    public static void main(String[] args) {

// 1. Definimos la expresión Lambda usando la interfaz predefinida Function
        // Recibe un int[] (Arreglo) y devuelve un Integer (El número mayor)
        Function<int[], Integer> buscarMayor = arreglo -> Arrays.stream(arreglo)
                // Reducimos comparando el acumulador con el elemento actual
                // Math.max nos devuelve directamente el mayor de los dos en cada paso
                .reduce(Integer.MIN_VALUE, (acumulador, elemento) -> Math.max(acumulador, elemento));

        // 2. Arreglo de prueba con números desordenados y negativos
        int[] datos = {23, 5, 87, 450, 12, 98, -4, 67, 32};

        // 3. Ejecutamos la función pasando nuestro arreglo
        Integer numeroMayor = buscarMayor.apply(datos);

        // 4. Mostramos el resultado en consola
        System.out.println("--- Buscador de Número Mayor mediante Funciones y Streams ---");
        System.out.println("El número más grande del arreglo es: " + numeroMayor);
    }
}


/*
resultado del profesor
public class ProyectoJava8Stream {

    public static void main(String[] args) {
        // la función lambda que obtiene el numero mayor del arreglo usando api stream en su implementación
        Function<Integer[], Integer> max = arr -> Arrays.stream(arr).reduce(0, (ac, e) -> ac > e? ac: e);

        int resultado = max.apply(new Integer[]{1, 78, -1700, 2500, 0, 2000, 54, 2});
        System.out.println(resultado);
    }
}
 */
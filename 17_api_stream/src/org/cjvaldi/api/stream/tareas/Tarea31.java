package org.cjvaldi.api.stream.tareas;

import java.util.Arrays;

/*
Tarea 31: Aplanar un arreglo bidimensional en un nivel y eliminar repetidos
El siguiente ejercicio es aplanar un arreglo bidimensional en un nivel y eliminar repetidos
usando el api stream.

Aplanar un arreglo significa quitar los elementos del arreglo anidado y dejarlos en el
arreglo de primer nivel.

Por ejemplo, para el arreglo:
String[][] lenguajes = {{"java", "groovy"}, {"php"}, {"c#", "python", "groovy"},
{"java", "javascript", "kotlin"}, {"javascript"}, {}};

debería quedar:
{"java", "groovy", "php", "c#", "python", "javascript", "kotlin"};
 */
public class Tarea31 {
    public static void main(String[] args) {

// 1. Definimos el arreglo bidimensional original (con elementos repetidos y un arreglo vacío)
        String[][] lenguajes = {
                {"java", "groovy"},
                {"php"},
                {"c#", "python", "groovy"},
                {"java", "javascript", "kotlin"},
                {"javascript"},
                {}
        };

        // 2. Procesamos el arreglo utilizando la API Stream
        String[] lenguajesAplanados = Arrays.stream(lenguajes)
                // Aplanar: transforma cada arreglo interno (String[]) en un flujo individual y los une en uno solo
                .flatMap(arregloInterno -> Arrays.stream(arregloInterno))
                // Eliminar duplicados: asegura que cada elemento aparezca una sola vez
                .distinct()
                // Operador terminal: convierte el flujo resultante de nuevo en un arreglo de Strings
                .toArray(String[]::new);

        // 3. Imprimimos el resultado formateado en consola
        System.out.println("--- Arreglo Bidimensional Aplanado y Sin Repetidos ---");
        System.out.println(Arrays.toString(lenguajesAplanados));
    }
}

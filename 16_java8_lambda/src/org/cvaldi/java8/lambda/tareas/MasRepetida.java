package org.cvaldi.java8.lambda.tareas;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MasRepetida {
    public static void main(String[] args) {
        // Implementación de la expresión Lambda
        PalabraMasRepetida buscador = frase -> {
            // 1. Limpieza básica: pasamos a minúsculas y eliminamos puntos/comas
            String fraseLimpia = frase.toLowerCase()
                    .replace(".", "")
                    .replace(",", "");

            // 2. Separamos la frase en un arreglo de palabras usando los espacios en blanco
            String[] palabras = fraseLimpia.split("\\s+");

            // 3. Mapa temporal para contar las frecuencias de cada palabra
            Map<String, Integer> frecuencias = new HashMap<>();
            for (String pal : palabras) {
                // getOrDefault le asigna 0 si es la primera vez que ve la palabra, y luego le suma 1
                frecuencias.put(pal, frecuencias.getOrDefault(pal, 0) + 1);
            }

            // 4. Buscamos cuál es la palabra con el conteo máximo
            String palabraMax = "";
            int maxContador = 0;

            for (Map.Entry<String, Integer> entry : frecuencias.entrySet()) {
                if (entry.getValue() > maxContador) {
                    maxContador = entry.getValue();
                    palabraMax = entry.getKey();
                }
            }

            // 5. Devolvemos el resultado usando el helper abreviado que solicita la tarea
            return Collections.singletonMap(palabraMax, maxContador);
        };

        // --- PRUEBA DE EJECUCIÓN ---

        String oracion = "Java es un lenguaje de programación, y Java es muy utilizado en el backend con Spring Boot.";

        // Invocamos la lambda
        Map<String, Integer> resultado = buscador.analizar(oracion);

        // Mostramos el resultado iterando el mapa como lo pide el enunciado
        System.out.println("--- Resultado del análisis de la frase ---");
        resultado.forEach((palabra, cantidad) ->
                System.out.println("La palabra más repetida es '" + palabra + "' con un total de " + cantidad + " repeticiones.")
        );
    }
}

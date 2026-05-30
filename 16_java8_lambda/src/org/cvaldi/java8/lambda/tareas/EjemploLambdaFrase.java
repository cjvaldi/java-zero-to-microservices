package org.cvaldi.java8.lambda.tareas;

import java.util.function.Function;

public class EjemploLambdaFrase {
    public static void main(String[] args) {

        // Expresión Lambda que limpia y transforma la frase
        Function<String, String> limpiarYMayusculas = frase ->
                frase.replace(" ", "")   // Elimina espacios
                        .replace(",", "")   // Elimina comas
                        .replace(".", "")   // Elimina puntos
                        .toUpperCase();     // Convierte todo a MAYÚSCULAS

        // Prueba de ejecución
        String fraseOriginal = "Hola, mundo. Aprendiendo Java con expresiones lambda.";
        String fraseResultado = limpiarYMayusculas.apply(fraseOriginal);

        System.out.println("Original: " + fraseOriginal);
        System.out.println("Resultado: " + fraseResultado);

    }
}

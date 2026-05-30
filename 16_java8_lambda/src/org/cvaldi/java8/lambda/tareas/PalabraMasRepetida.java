package org.cvaldi.java8.lambda.tareas;

import java.util.Map;

@FunctionalInterface
public interface PalabraMasRepetida {
    Map<String,Integer> analizar(String frase);
}

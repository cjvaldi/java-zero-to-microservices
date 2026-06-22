package org.cjvaldi.java.mockitoapp.ejemplo.services;

import org.cjvaldi.java.mockitoapp.ejemplo.models.Examen;

import java.util.Arrays;
import java.util.List;

public class Datos {
    public final static List<Examen> EXAMENES = Arrays.asList(new Examen(5L, "Matemáticas")
            , new Examen(6L, "Lenguaje")
            , new Examen(7L, "Historia"));

    public final static List<String> PREGUNTAS = Arrays.asList("aritméticas","integrales",
            "derivadas","trigonometría","geometría");

    public final static Examen EXAMEN = new Examen(null,"Física");

}

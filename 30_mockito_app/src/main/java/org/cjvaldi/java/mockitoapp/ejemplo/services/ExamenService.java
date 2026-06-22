package org.cjvaldi.java.mockitoapp.ejemplo.services;

import org.cjvaldi.java.mockitoapp.ejemplo.models.Examen;

import java.util.Optional;

public interface ExamenService {
    Optional<Examen> findExamenPorNombre(String nombre);

    Examen findExamenPorNombreConPreguntas(String nombre);

    Examen guardar(Examen examen);



}

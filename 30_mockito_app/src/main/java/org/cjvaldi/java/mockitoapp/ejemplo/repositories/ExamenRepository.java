package org.cjvaldi.java.mockitoapp.ejemplo.repositories;

import org.cjvaldi.java.mockitoapp.ejemplo.models.Examen;

import java.util.List;

public interface ExamenRepository {
    Examen guardar(Examen examen);
    List<Examen> findAll();

}

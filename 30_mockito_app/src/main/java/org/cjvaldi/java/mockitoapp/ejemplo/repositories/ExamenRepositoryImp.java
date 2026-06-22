package org.cjvaldi.java.mockitoapp.ejemplo.repositories;

import org.cjvaldi.java.mockitoapp.ejemplo.models.Examen;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ExamenRepositoryImp implements ExamenRepository{


    @Override
    public Examen guardar(Examen examen) {
        return null;
    }

    // con mockito esta implementacion no se usa ya que se crea los datos en el test
    @Override
    public List<Examen> findAll() {
        return Collections.emptyList();
        //en mockito no hace falta, se simula directamente
        // cuando enviamos los datos de prueba -> junit
//        return Arrays.asList(new Examen(5L,"Matemáticas"),new Examen(6L,"Lenguaje")
//        ,new Examen(7L,"Historia"));
    }
}

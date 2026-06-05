package org.cjvaldi.optional.ejemplo.repositorio;

import org.cjvaldi.optional.ejemplo.model.Computador;

import java.util.Optional;

public interface Repositorio<C> {

    Optional<Computador> filtrar(String nombre);

}

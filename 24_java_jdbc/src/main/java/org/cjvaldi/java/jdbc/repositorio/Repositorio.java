package org.cjvaldi.java.jdbc.repositorio;

import org.cjvaldi.java.jdbc.modelo.Producto;

import java.util.List;

public interface Repositorio<T> {
    List<T> listar();

    T porId(Long id);

    void guardar(T t);

    void eliminar(Long id);
}

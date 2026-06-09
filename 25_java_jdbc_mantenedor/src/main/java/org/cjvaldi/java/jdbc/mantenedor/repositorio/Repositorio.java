package org.cjvaldi.java.jdbc.mantenedor.repositorio;

import java.util.List;

public interface Repositorio <T>{
    List<T> listar();
    T porId(Long id);
    void guardar(T t);// Sirve tanto para crear como para actualizar
    void eliminar(Long id);
}

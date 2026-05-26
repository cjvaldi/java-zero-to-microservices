package org.cjvaldi.poointerfases.repositorio;

import org.cjvaldi.poointerfases.excepciones.AccesoDatoException;

import java.util.List;

public interface CrudRepositorio<T> {

    List<T> listar();
    T porId(Integer id) throws AccesoDatoException;
    void crear(T t) throws AccesoDatoException;
    void editar(T t) throws AccesoDatoException;
    void eliminar(Integer id) throws AccesoDatoException ;

}

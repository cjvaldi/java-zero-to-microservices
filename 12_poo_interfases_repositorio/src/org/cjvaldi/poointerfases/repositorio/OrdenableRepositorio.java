package org.cjvaldi.poointerfases.repositorio;

import org.cjvaldi.poointerfases.modelo.Cliente;

import java.util.List;

public interface OrdenableRepositorio<T> {
    List<T> listar(String campo,  Direccion dir);


}

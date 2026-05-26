package org.cjvaldi.poointerfases.repositorio;

import org.cjvaldi.poointerfases.modelo.Cliente;

import java.util.List;

public interface PaginableRepositorio<T> {
    List<T> listar(int desde, int hasta);
}

package org.cjvaldi.optional.ejemplo;

import org.cjvaldi.optional.ejemplo.model.Computador;
import org.cjvaldi.optional.ejemplo.model.ComputadorRepositorio;
import org.cjvaldi.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorioMetodosOrElseThrow {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        Computador pc = repositorio.filtrar("asus").orElseThrow(IllegalArgumentException::new);
        System.out.println(pc);

        String archivo = "documento.pdf";
        String extension = Optional.ofNullable(archivo)
                .filter(a->a.contains("."))
                .map(a->a.substring(archivo.lastIndexOf(".")+1))
                .orElseThrow();
        System.out.println(extension);

    }


}

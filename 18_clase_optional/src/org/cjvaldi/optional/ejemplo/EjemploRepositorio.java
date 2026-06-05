package org.cjvaldi.optional.ejemplo;

import org.cjvaldi.optional.ejemplo.model.Computador;
import org.cjvaldi.optional.ejemplo.model.ComputadorRepositorio;
import org.cjvaldi.optional.ejemplo.repositorio.Repositorio;

import java.util.Optional;

public class EjemploRepositorio {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();
        // Implementación sencilla Optional, eviatndo el nullPointException
        repositorio.filtrar("ASUS").ifPresentOrElse(System.out::println,
                () -> System.out.println("No se encontró"));
        /*   Modo normal
        Optional<Computador> pc = repositorio.filtrar("asus rgb");

        if (pc.isPresent()) {
            System.out.println(pc.get());
        } else {
            System.out.println("no se encontró");
        }*/
    }
}

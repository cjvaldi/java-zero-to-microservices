package org.cjvaldi.api.stream.ejemplos;

import org.cjvaldi.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {

        Stream<Usuario> nombres = Stream
                .of("Pato Guzman", "Paco Gonzalez", "Pepa Gutierrez", "Pepe Mena", "Pepe Garcia")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .filter(u -> u.getNombre().equals("Pepe"))
                .peek(System.out::println); // peek inspecciona, imprime sin llamar al forEach


        List<Usuario> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);

    }
}

package org.cjvaldi.optional.ejemplo;

import org.cjvaldi.optional.ejemplo.model.Computador;
import org.cjvaldi.optional.ejemplo.model.ComputadorRepositorio;
import org.cjvaldi.optional.ejemplo.model.Fabricante;
import org.cjvaldi.optional.ejemplo.model.Procesador;
import org.cjvaldi.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMapFilter {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        String f = repositorio.filtrar("asus")
                .flatMap(Computador::getProcesador)
                .flatMap(Procesador::getFabricante)
                .filter(fab->"intel".equalsIgnoreCase(fab.getNombre()))
                .map(Fabricante::getNombre)
                .orElse("Desconocido");

        System.out.println(f);


    }
}

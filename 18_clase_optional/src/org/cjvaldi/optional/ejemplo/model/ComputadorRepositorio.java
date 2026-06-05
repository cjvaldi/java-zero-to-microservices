package org.cjvaldi.optional.ejemplo.model;

import org.cjvaldi.optional.ejemplo.repositorio.Repositorio;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ComputadorRepositorio implements Repositorio<Computador> {

    private List<Computador> dataSource;

    public ComputadorRepositorio() {
        dataSource = new ArrayList<>();
        Procesador proc = new Procesador("I9-9880H", new Fabricante("Intel"));
        Computador asus = new Computador("Asus RGB", "modelo One");
        asus.setProcesador(proc);
        dataSource.add(asus);

        dataSource.add(new Computador("MacBook Pro", "Modelo MVVK"));
    }

    @Override
    public Optional<Computador> filtrar(String nombre) {
        return dataSource.stream()
                .filter(c -> c.getNombre().toLowerCase().contains(nombre.toLowerCase()))
                .findFirst();
        /*
        for (Computador c :dataSource){
            if(c.getNombre().equalsIgnoreCase(nombre)){
                return Optional.of(c);
            }
        }
        return Optional.empty();
        */
    }

}

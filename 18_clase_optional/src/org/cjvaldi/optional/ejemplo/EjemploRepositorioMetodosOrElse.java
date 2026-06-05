package org.cjvaldi.optional.ejemplo;

import org.cjvaldi.optional.ejemplo.model.Computador;
import org.cjvaldi.optional.ejemplo.model.ComputadorRepositorio;
import org.cjvaldi.optional.ejemplo.repositorio.Repositorio;

public class EjemploRepositorioMetodosOrElse {
    public static void main(String[] args) {

        Repositorio<Computador> repositorio = new ComputadorRepositorio();

        //Generamos por método para ver el uso y respuesta de orELse y orElseGet
        //Computador defecto =  new Computador("HP Portátil","LA001");

        Computador pc = repositorio.filtrar("ASUS").orElse(valorDefecto());
        System.out.println(pc);

        // se recomienda usar el prElseGet
        pc = repositorio.filtrar("macbook").orElseGet(EjemploRepositorioMetodosOrElse::valorDefecto);
        System.out.println(pc);

    }

    public static Computador valorDefecto(){
        System.out.println("Obteniendo valor por defecto");
        return new Computador("HP Portátil","LA001");
    }
}

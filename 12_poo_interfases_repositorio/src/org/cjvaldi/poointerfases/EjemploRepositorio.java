package org.cjvaldi.poointerfases;

import org.cjvaldi.poointerfases.modelo.Cliente;
import org.cjvaldi.poointerfases.repositorio.*;
import org.cjvaldi.poointerfases.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Jano", "Perez"));
        repo.crear(new Cliente("Bea", "González"));
        repo.crear(new Cliente("Luci", "Martinez"));
        repo.crear(new Cliente("Cristian", "Jacson"));

        List<Cliente> cliente = repo.listar();
        cliente.forEach(System.out::println);
        System.out.println("------Paginable--------");
        List<Cliente> paginable = repo.listar(0, 4);
        paginable.forEach(System.out::println);

        System.out.println("------ordenar--------");
        List<Cliente> clienteOrdenAsc = repo.listar("nombre", Direccion.DESC);
//        ordenable.forEach(System.out::println); // hacerlo de la manera general
        for (Cliente c : clienteOrdenAsc) {
            System.out.println(c);
        }

        System.out.println("------actualizar--------");
        Cliente beaActualizar = new Cliente("Bea", "Mena");
        beaActualizar.setId(2);
        repo.editar(beaActualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);

        System.out.println("------ordenar con el método simplificado--------");
        repo.listar("apellido", Direccion.ASC).forEach(System.out::println);

        System.out.println("------eliminar--------");
        repo.eliminar(2);
        repo.listar().forEach(System.out::println);

        System.out.println("------total--------");
        System.out.println("Total registros : "+repo.total());

    }
}

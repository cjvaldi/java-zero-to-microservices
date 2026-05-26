package org.cjvaldi.poointerfases;

import org.cjvaldi.poointerfases.excepciones.AccesoDatoException;
import org.cjvaldi.poointerfases.excepciones.EscrituraAccesoDatoException;
import org.cjvaldi.poointerfases.excepciones.LecturaAccesoDatoException;
import org.cjvaldi.poointerfases.excepciones.RegistroDuplicadoAccesoDatoException;
import org.cjvaldi.poointerfases.modelo.Cliente;
import org.cjvaldi.poointerfases.repositorio.*;
import org.cjvaldi.poointerfases.repositorio.lista.ClienteListRepositorio;

import java.util.List;

public class EjemploRepositorio {
    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Cliente> repo = new ClienteListRepositorio();
            repo.crear(new Cliente("Jano", "Perez"));
            repo.crear(new Cliente("Bea", "González"));
            repo.crear(new Cliente("Luci", "Martinez"));
            //repo.crear(new Cliente("Cristian", "Jacson"));

            Cliente cristian = new Cliente("Cristian", "Jacson");
            repo.crear(cristian);
            repo.crear(cristian);

            //repo.crear(null);

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
            repo.eliminar(50);
            repo.listar().forEach(System.out::println);

            System.out.println("------total--------");
            System.out.println("Total registros : " + repo.total());
        } catch (RegistroDuplicadoAccesoDatoException e) {
            System.out.println("Registro duplicado : " + e.getMessage());
            e.printStackTrace();
        } catch (LecturaAccesoDatoException e) {
            System.out.println("Lectura: " + e.getMessage());
            e.printStackTrace();
        } catch (EscrituraAccesoDatoException e) {
            System.out.println("Escritura : " + e.getMessage());
            e.printStackTrace();
        } catch (AccesoDatoException e) {
            System.out.println("Generica : " + e.getMessage());
            e.printStackTrace();
        }

    }
}

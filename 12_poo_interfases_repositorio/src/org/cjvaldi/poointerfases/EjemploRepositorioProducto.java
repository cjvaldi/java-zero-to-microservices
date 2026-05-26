package org.cjvaldi.poointerfases;

import org.cjvaldi.poointerfases.excepciones.AccesoDatoException;
import org.cjvaldi.poointerfases.excepciones.EscrituraAccesoDatoException;
import org.cjvaldi.poointerfases.excepciones.LecturaAccesoDatoException;
import org.cjvaldi.poointerfases.modelo.Cliente;
import org.cjvaldi.poointerfases.modelo.Producto;
import org.cjvaldi.poointerfases.repositorio.Direccion;
import org.cjvaldi.poointerfases.repositorio.OrdenablePaginableCrudRepositorio;
import org.cjvaldi.poointerfases.repositorio.lista.ProductoListRepositorio;

import java.util.List;

public class EjemploRepositorioProducto {
    public static void main(String[] args) {

        try {
            OrdenablePaginableCrudRepositorio<Producto> repo = new ProductoListRepositorio();
            repo.crear(new Producto("mesa", 50.52));
            repo.crear(new Producto("silla", 18.));
            repo.crear(new Producto("lampara", 15.5));
            repo.crear(new Producto("portatil", 400.59));

            List<Producto> producto = repo.listar();
            producto.forEach(System.out::println);
            System.out.println("------Paginable--------");
            List<Producto> paginable = repo.listar(0, 4);
            paginable.forEach(System.out::println);

            System.out.println("------ordenar--------");
            List<Producto> productosOrdenAsc = repo.listar("descripcion", Direccion.DESC);
//        ordenable.forEach(System.out::println); // hacerlo de la manera general
            for (Producto c : productosOrdenAsc) {
                System.out.println(c);
            }

            System.out.println("------actualizar--------");
            Producto lamparaActualizar = new Producto("lampara escritorio", 23.);
            lamparaActualizar.setId(3);
            repo.editar(lamparaActualizar);
            Producto lampara = repo.porId(3);
            System.out.println(lampara);

            System.out.println("------ordenar con el método simplificado--------");
            repo.listar("precio", Direccion.ASC).forEach(System.out::println);

            System.out.println("------eliminar--------");
            repo.eliminar(3);
            repo.listar().forEach(System.out::println);

            System.out.println("------total--------");
            System.out.println("Total registros : " + repo.total());
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

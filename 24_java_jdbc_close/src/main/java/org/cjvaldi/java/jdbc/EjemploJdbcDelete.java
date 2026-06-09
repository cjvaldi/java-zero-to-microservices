package org.cjvaldi.java.jdbc;

import org.cjvaldi.java.jdbc.modelo.Producto;
import org.cjvaldi.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.cjvaldi.java.jdbc.repositorio.Repositorio;
import org.cjvaldi.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;

public class EjemploJdbcDelete {
    public static void main(String[] args) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("==============Listar ==============");
            repositorio.listar().forEach(System.out::println);

            System.out.println("==============obtener por el id ==============D");
            System.out.println(repositorio.porId(1L));

            System.out.println("==============eliminar producto=============D");
            repositorio.eliminar(3L);
            System.out.println("Producto eliminado con éxito");
            repositorio.listar().forEach(System.out::println);

    }
}

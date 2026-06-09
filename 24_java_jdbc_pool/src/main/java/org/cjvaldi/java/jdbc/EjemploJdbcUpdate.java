package org.cjvaldi.java.jdbc;

import org.cjvaldi.java.jdbc.modelo.Categoria;
import org.cjvaldi.java.jdbc.modelo.Producto;
import org.cjvaldi.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.cjvaldi.java.jdbc.repositorio.Repositorio;
import org.cjvaldi.java.jdbc.util.ConexionBaseDatos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

public class EjemploJdbcUpdate {
    public static void main(String[] args) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("==============Listar ==============");
            repositorio.listar().forEach(System.out::println);

            System.out.println("==============obtener por el id ==============D");
            System.out.println(repositorio.porId(1L));

            System.out.println("==============editar producto=============D");
            Producto producto = new Producto();
            producto.setId(5L);  // para la actualización
            producto.setNombre("Teclado usb mécanico");
            producto.setPrecio(200);
            Categoria categoria = new Categoria();
            categoria.setId(3L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto actualizado con exito");
            repositorio.listar().forEach(System.out::println);

    }
}

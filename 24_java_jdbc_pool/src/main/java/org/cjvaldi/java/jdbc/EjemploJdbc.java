package org.cjvaldi.java.jdbc;

import org.cjvaldi.java.jdbc.modelo.Categoria;
import org.cjvaldi.java.jdbc.modelo.Producto;
import org.cjvaldi.java.jdbc.repositorio.ProductoRepositorioImpl;
import org.cjvaldi.java.jdbc.repositorio.Repositorio;
import org.cjvaldi.java.jdbc.util.ConexionBaseDatos;

import java.sql.*;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) {

            Repositorio<Producto> repositorio = new ProductoRepositorioImpl();
            System.out.println("==============Listar ==============");
            repositorio.listar().forEach(System.out::println);

            System.out.println("==============obtener por el id ==============D");
            System.out.println(repositorio.porId(1L));

            System.out.println("==============insertar nuevo producto=============D");
            Producto producto = new Producto();
            producto.setNombre("Pantalla usb HP");
            producto.setPrecio(550);
            producto.setFechaRegistro(new Date());
            Categoria categoria = new Categoria();
            categoria.setId(3L);
            producto.setCategoria(categoria);
            repositorio.guardar(producto);
            System.out.println("Producto guardado con exito");
            repositorio.listar().forEach(System.out::println);


    }
}

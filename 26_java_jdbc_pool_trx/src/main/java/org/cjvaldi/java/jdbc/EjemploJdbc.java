package org.cjvaldi.java.jdbc;

import org.cjvaldi.java.jdbc.modelo.Categoria;
import org.cjvaldi.java.jdbc.modelo.Producto;
import org.cjvaldi.java.jdbc.servicio.CatalagoServicio;
import org.cjvaldi.java.jdbc.servicio.Servicio;

import java.sql.*;
import java.util.Date;

public class EjemploJdbc {
    public static void main(String[] args) throws SQLException {

        Servicio servicio = new CatalagoServicio();
        System.out.println("==============Listar ==============");
        servicio.listar().forEach(System.out::println);

        Categoria categoria = new Categoria();
        categoria.setNombre("Iluminación");

        Producto producto = new Producto();
        producto.setNombre("Lampara Led escritorio");
        producto.setPrecio(950);
        producto.setFechaRegistro(new Date());
        producto.setSku("abcdefgh12");
        servicio.guardarProductoCategoria(producto, categoria);

        System.out.println("Producto guardado con éxito : " + producto.getId());
        servicio.listar().forEach(System.out::println);


    }
}

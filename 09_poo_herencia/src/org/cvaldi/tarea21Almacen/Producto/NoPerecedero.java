package org.cvaldi.tarea21Almacen.Producto;

import java.util.Date;

public class NoPerecedero extends ProductoAlimenticio{
    private int contenido;

    public NoPerecedero(String nombre, String codigo, double precio, Date fechaVencimiento, int calorias, int contenido) {
        super(nombre, codigo, precio, fechaVencimiento, calorias);
        this.contenido = contenido;
    }

    public int getContenido() {
        return contenido;
    }
}

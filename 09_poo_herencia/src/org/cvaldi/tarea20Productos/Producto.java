package org.cvaldi.tarea20Productos;

public class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String mostrarDetalle(){
        return "Nombre : "+ nombre +"\n"+
                "Precio : "+ precio;
    }
}

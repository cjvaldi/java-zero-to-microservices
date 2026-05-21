package org.cvaldi.tarea21Almacen.Producto;

public class Limpieza extends Producto{
    private String componente;
    private double litros;

    public Limpieza(String nombre, String codigo, double precio, String componente, double litros) {
        super(nombre, codigo, precio);
        this.componente = componente;
        this.litros = litros;
    }

    public String getComponente() {
        return componente;
    }

    public double getLitros() {
        return litros;
    }
}

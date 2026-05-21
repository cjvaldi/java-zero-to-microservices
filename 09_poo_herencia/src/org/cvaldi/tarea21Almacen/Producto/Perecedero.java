package org.cvaldi.tarea21Almacen.Producto;

import java.util.Date;

public class Perecedero extends ProductoAlimenticio{
    private int diasParaVencer;

    public Perecedero(String nombre, String codigo, double precio, Date fechaVencimiento, int calorias, int diasParaVencer) {
        super(nombre, codigo, precio, fechaVencimiento, calorias);
        this.diasParaVencer = diasParaVencer;
    }

    public int getDiasParaVencer() {
        return diasParaVencer;
    }
}

package org.cvaldi.tarea21Almacen.Persona;

public class Vendedor extends Persona {
    private int codigoVendedor;
    private double Sueldo;

    public Vendedor(String nombre, String nie, int codigoVendedor, double sueldo) {
        super(nombre, nie);
        this.codigoVendedor = codigoVendedor;
        Sueldo = sueldo;
    }

    public int getCodigoVendedor() {
        return codigoVendedor;
    }

    public double getSueldo() {
        return Sueldo;
    }
}

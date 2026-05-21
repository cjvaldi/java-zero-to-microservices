package org.cvaldi.tarea21Almacen.Producto;

import java.util.Date;

public class ProductoAlimenticio extends Producto{
    private Date fechaVencimiento;
    private int calorias;

    public ProductoAlimenticio(String nombre, String codigo, double precio, Date fechaVencimiento, int calorias) {
        super(nombre, codigo, precio);
        this.fechaVencimiento = fechaVencimiento;
        this.calorias = calorias;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public int getCalorias() {
        return calorias;
    }
}

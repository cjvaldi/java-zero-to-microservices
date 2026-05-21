package org.cvaldi.tarea20Productos;

public class NoPerecible extends Producto {
    private int contenido;
    private int calorias;

    public NoPerecible(String nombre, double precio, int contenido, int calorias) {
        super(nombre, precio);
        this.contenido = contenido;
        this.calorias = calorias;
    }

    public int getContenido() {
        return contenido;
    }

    public int getCalorias() {
        return calorias;
    }
    @Override
    public String mostrarDetalle(){
        return super.mostrarDetalle()+
                "\nContenido : "+ contenido +
                "\nCalorías : "+ calorias;
    }
}

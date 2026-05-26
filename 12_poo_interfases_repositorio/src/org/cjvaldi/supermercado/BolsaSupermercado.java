package org.cjvaldi.supermercado;

import org.cjvaldi.supermercado.modelo.Producto;

import java.util.ArrayList;
import java.util.List;

public class BolsaSupermercado<T extends Producto> {

    private List<T> productos;
    private final int MAX_ELEMENTOS=5;

    public BolsaSupermercado() {
        this.productos = new ArrayList<>();
    }
    public void addProducto(T producto){
        if(this.productos.size() < MAX_ELEMENTOS){
            this.productos.add(producto);
        } else {
            System.out.println("La bolsa esta llena.No se puede agregar : "+producto.getNombre());
        }
    }

    public List<T> getProductos(){
        return this.productos;
    }
}

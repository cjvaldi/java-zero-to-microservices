package org.cjvaldi.patrones.factory.producto;

import org.cjvaldi.patrones.factory.PizzaProducto;

public class PizzaCaliforniaQueso extends PizzaProducto {

    public PizzaCaliforniaQueso() {
        super();
        nombre = "Pizza California Queso";
        masa = " Masa integral gruesa";
        salsa = "Salsa de tomate rojo";
        ingredientes.add("Extra de Queso de vaca");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Berengenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 45 min. a 120ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas.");
    }
}

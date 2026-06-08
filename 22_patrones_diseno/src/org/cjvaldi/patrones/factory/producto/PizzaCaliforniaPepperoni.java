package org.cjvaldi.patrones.factory.producto;

import org.cjvaldi.patrones.factory.PizzaProducto;

public class PizzaCaliforniaPepperoni extends PizzaProducto {

    public PizzaCaliforniaPepperoni() {
        super();
        nombre = "Pizza California Pepperoni";
        masa = " Masa integral delgada a lpiedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Cebolla");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min. a 120ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas grandes.");
    }
}

package org.cjvaldi.patrones.factory.producto;

import org.cjvaldi.patrones.factory.PizzaProducto;

public class PizzaCaliforniaVegetariana extends PizzaProducto {

    public PizzaCaliforniaVegetariana() {
        super();
        nombre = "Pizza California Vegetaria";
        masa = " Masa integral delgada";
        salsa = "Salsa de tomate ligth";
        ingredientes.add("Queso Mozzarella");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Cebolla");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 35 min. a 150ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas.");
    }
}

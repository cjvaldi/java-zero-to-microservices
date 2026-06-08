package org.cjvaldi.patrones.factory.producto;

import org.cjvaldi.patrones.factory.PizzaProducto;

public class PizzaNewYorkPeperoni extends PizzaProducto {
    public PizzaNewYorkPeperoni() {
        super();
        nombre = "Pizza Peperoni New York";
        masa = "Masa delgada a la piedra";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso mozzarella");
        ingredientes.add("Extra pepperoni");
        ingredientes.add("Aceitunas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 40 min. a 90º C");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en triángulos");
    }
}

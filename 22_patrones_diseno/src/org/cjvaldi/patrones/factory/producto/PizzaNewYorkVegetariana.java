package org.cjvaldi.patrones.factory.producto;

import org.cjvaldi.patrones.factory.PizzaProducto;

public class PizzaNewYorkVegetariana extends PizzaProducto {

    public PizzaNewYorkVegetariana() {
        super();
        nombre = "Pizza vegetaria New York";
        masa = " Masa integral vegana";
        salsa = "Salsa de tomate";
        ingredientes.add("Queso de vaca");
        ingredientes.add("Tomate");
        ingredientes.add("Aceitunas");
        ingredientes.add("Espinacas");
        ingredientes.add("Berengenas");
    }

    @Override
    public void cocinar() {
        System.out.println("Cocinando por 25 min. a 150ºC");
    }

    @Override
    public void cortar() {
        System.out.println("Cortando la pizza en rebanadas cuadradas.");
    }
}

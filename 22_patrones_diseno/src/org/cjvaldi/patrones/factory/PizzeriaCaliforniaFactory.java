package org.cjvaldi.patrones.factory;

import org.cjvaldi.patrones.factory.producto.PizzaCaliforniaPepperoni;
import org.cjvaldi.patrones.factory.producto.PizzaCaliforniaQueso;
import org.cjvaldi.patrones.factory.producto.PizzaCaliforniaVegetariana;

public class PizzeriaCaliforniaFactory extends PizzeriaZonaAbstractFactory {
    @Override
    PizzaProducto crearPizza(String tipo) {
        return switch (tipo) {
            case "queso" -> new PizzaCaliforniaQueso();
            case "pepperoni" -> new PizzaCaliforniaPepperoni();
            case "vegetariana" -> new PizzaCaliforniaVegetariana();
            default -> null;
        };
    }
}

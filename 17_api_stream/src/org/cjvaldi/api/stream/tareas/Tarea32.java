package org.cjvaldi.api.stream.tareas;

import java.util.ArrayList;
import java.util.List;

/*
Tarea 32: Calcular importe de cada producto de una lista y sumarlo
El siguiente requerimiento es para una lista de productos List<Producto> , de 3 a 5 elementos,
 se pide calcular el importe (precio por cantidad) y sumarlos.

La clase Producto debe tener el atributo precio del tipo double y cantidad int,
entonces utilizando stream convertir la lista de productos en el gran total del tipo double.

 */
public class Tarea32 {
    public static void main(String[] args) {

        // 1. Creamos la lista de productos (4 elementos)
        List<Producto> carrito = new ArrayList<>();
        carrito.add(new Producto("Teclado Mecánico", 45.50, 2));  // Importe: 91.0
        carrito.add(new Producto("Mouse Gamer", 25.00, 3));      // Importe: 75.0
        carrito.add(new Producto("Monitor 24'", 120.00, 1));     // Importe: 120.0
        carrito.add(new Producto("Cable HDMI", 5.25, 4));        // Importe: 21.0

        // 2. Utilizando la API Stream calculamos el Gran Total
        double granTotal = carrito.stream()
                // Transformamos cada objeto Producto a un valor double (precio * cantidad)
                .mapToDouble(producto -> producto.getPrecio() * producto.getCantidad())
                // Sumamos todos los importes calculados en el paso anterior
                .sum();

        // 3. Mostramos el resultado en la consola
        System.out.println("--- Cálculo de Importes con API Stream ---");
        System.out.println("Total de la compra es: " + granTotal);

    }
}

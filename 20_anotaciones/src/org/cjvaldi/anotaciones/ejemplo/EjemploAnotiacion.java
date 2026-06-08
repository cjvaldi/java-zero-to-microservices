package org.cjvaldi.anotaciones.ejemplo;

import org.cjvaldi.anotaciones.ejemplo.models.Producto;
import org.cjvaldi.anotaciones.ejemplo.procesador.JsonSerializador;

import java.time.LocalDate;

public class EjemploAnotiacion {
    public static void main(String[] args) {

        Producto p = new Producto();
        p.setFecha(LocalDate.now());
        p.setNombre("mesa centro roble");
        p.setPrecio(1000L);

        System.out.println("json = " + JsonSerializador.convertirJson(p));

    }
}

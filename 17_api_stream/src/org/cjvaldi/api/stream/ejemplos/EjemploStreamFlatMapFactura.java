package org.cjvaldi.api.stream.ejemplos;

import org.cjvaldi.api.stream.ejemplos.models.Factura;
import org.cjvaldi.api.stream.ejemplos.models.Usuario;

import java.util.Arrays;
import java.util.List;

public class EjemploStreamFlatMapFactura {
    public static void main(String[] args) {

        Usuario u1 = new Usuario("Jhon", "Doe");
        Usuario u2 = new Usuario("Pepe", "Perez");

        u1.addFactura(new Factura("compras tecnológicas"));
        u1.addFactura(new Factura("compras muebles"));

        u2.addFactura(new Factura("bicicleta"));
        u2.addFactura(new Factura("notebook gamer"));

        List<Usuario> usuarios = Arrays.asList(u1, u2);
        /* usuarios.stream()
                .flatMap(u->u.getFacturas().stream())
                .forEach(f->System.out.println(f.getDescripcion()
                        .concat(" : Cliente ")
                        .concat(f.getUsuario().toString())));

         */
        // otra opción
        usuarios.stream()
                .map(Usuario::getFacturas)
                .flatMap(List::stream)
                .forEach(f -> System.out.println(f.getDescripcion()
                        .concat(" : Cliente ")
                        .concat(f.getUsuario().toString())));

        /*for(Usuario u:usuarios){
            for(Factura f: u.getFacturas()){
                System.out.println(f.getDescripcion());
            }
        }*/
    }
}

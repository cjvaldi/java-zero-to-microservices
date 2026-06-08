package org.cjvaldi.patrones.decorator;

import org.cjvaldi.patrones.decorator.decorador.MayusculaDecorador;
import org.cjvaldi.patrones.decorator.decorador.ReemplazarEspaciosDecorador;
import org.cjvaldi.patrones.decorator.decorador.ReversaDecorador;
import org.cjvaldi.patrones.decorator.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola que tal Cristian!");

        MayusculaDecorador mayuscula = new MayusculaDecorador(texto);
        ReversaDecorador reversa = new ReversaDecorador(mayuscula);
        SubrayadoDecorador subrayar = new SubrayadoDecorador(reversa);
        ReemplazarEspaciosDecorador remplazar = new ReemplazarEspaciosDecorador(subrayar);

        // aplicamos las combinaciones
        System.out.println(remplazar.darFormato());
    }
}

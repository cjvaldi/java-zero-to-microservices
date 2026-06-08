package org.cjvaldi.patrones.decorator.decorador;

import org.cjvaldi.patrones.decorator.Formateable;

public class ReemplazarEspaciosDecorador extends TextoDecorador{
    public ReemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ","_");
    }
}

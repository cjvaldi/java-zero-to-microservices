package com.cjvaldi.app.hogar;

import com.cjvaldi.app.jardin.Perro;
import static com.cjvaldi.app.hogar.Persona.saludar;

public class EjemploHogar {
    public static void main(String[] args) {
        Persona p = new Persona();
        Perro perro =  new Perro();
        String saludo = saludar();
    }
}

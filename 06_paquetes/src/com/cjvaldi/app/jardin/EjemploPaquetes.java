package com.cjvaldi.app.jardin;

import com.cjvaldi.app.hogar.*;
//import com.cjvaldi.app.hogar.Gato;  // usamos el *
//import com.cjvaldi.app.hogar.Persona;

import static com.cjvaldi.app.hogar.ColorPelo.*; // para ColorPelo.*

//import static com.cjvaldi.app.hogar.Persona.saludar;
//import static com.cjvaldi.app.hogar.Persona.GENERO_MASCULINO;
//import static com.cjvaldi.app.hogar.Persona.GENERO_FEMENINO; // usamos el *
import static com.cjvaldi.app.hogar.Persona.*; //(saludar,GENERO_FEMENIMO Y MASCULINO


public class EjemploPaquetes {
    public static void main(String[] args) {

        //com.cjvaldi.app.hogar.Persona p = new com.cjvaldi.app.hogar.Persona(); mejor se importa
        Persona p = new Persona();
        p.setNombre("Cristian");
        p.setApellido("Valdivieso");
        p.setColorPelo(CAFE);
        System.out.println(p.getNombre());

        Perro perro = new Perro();
        perro.nombre = "Toby";
        perro.raza = "Pitbull";

        String jugando = perro.jugar(p);
        System.out.println("jugando = " + jugando);
        String saludo = saludar();
        System.out.println("saludo = " + saludo);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;



    }
}

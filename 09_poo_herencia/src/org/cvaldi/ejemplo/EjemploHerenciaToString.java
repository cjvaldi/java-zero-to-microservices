package org.cvaldi.ejemplo;

import org.cvaldi.pooherencia.Alumno;
import org.cvaldi.pooherencia.AlumnoInternacional;
import org.cvaldi.pooherencia.Persona;
import org.cvaldi.pooherencia.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {

        System.out.println("-------Creando instancia de Alumno---------------");
        Alumno alumno = new Alumno("Cristian", "Valdivieso", 52, "Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(7.1);
        alumno.setNotaMatematica(6.0);
        alumno.setEmail("prueba@gmail.com");

        System.out.println("-------Creando instancia de AlumnoInternacional---------------");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling", "Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(7.5);
        alumnoInt.setNotaMatematica(5.8);
        alumnoInt.setEmail("email@email.com");


        System.out.println("-------Creando instancia de Profesor---------------");
        Profesor profesor = new Profesor("Juan", "Sevilla", "Matematicas");
        profesor.setEdad(37);
        profesor.setEmail("proge@emaol.com");

        System.out.println("------------------------------------");
        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);

    }

    public static void imprimir(Persona persona) {
        System.out.println();
        System.out.println("------------------------------------");
        System.out.println(persona);
    }
}

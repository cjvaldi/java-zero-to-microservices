package org.cvaldi.ejemplo;

//import org.cvaldi.pooherencia.Alumno;
//import org.cvaldi.pooherencia.Profesor;

import org.cvaldi.pooherencia.*;

public class EjemploHerencia {
    public static void main(String[] args) {

        System.out.println("-------Creando instancia de Alumno---------------");
        Alumno alumno = new Alumno();
        alumno.setNombre("Cristian");
        alumno.setApellido("Valdivieso");
        alumno.setInstitucion("Augusto Salazar Bondy");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(7.1);
        alumno.setNotaMatematica(6.0);

        System.out.println("-------Creando instancia de AlumnoInternacional---------------");
        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setInstitucion("instituto Nacional");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(7.5);
        alumnoInt.setNotaMatematica(5.8);

        System.out.println("-------Creando instancia de Profesor---------------");
        Profesor profesor = new Profesor();
        profesor.setNombre("Juan");
        profesor.setApellido("Sevilla");
        profesor.setAsignatura("Matematicas");

        System.out.println(alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getInstitucion());

        System.out.println(alumnoInt.getNombre()
                + " " + alumnoInt.getApellido()
                + " " + alumnoInt.getPais()
                + " " + alumnoInt.getInstitucion()
                + " " + alumnoInt.getNotaIdiomas());

        System.out.println("Profesor " + profesor.getAsignatura() + " : " +
                profesor.getNombre() + " " + profesor.getApellido());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null) {
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}

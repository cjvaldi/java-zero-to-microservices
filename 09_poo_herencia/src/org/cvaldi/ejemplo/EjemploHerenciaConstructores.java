package org.cvaldi.ejemplo;

import org.cvaldi.pooherencia.*;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo datos en común del tipo Persona");
        System.out.println("Nombre : " + persona.getNombre()
                + " , apellido :" + persona.getApellido()
                + " , edad : " + persona.getEdad()
                + " , email : " + persona.getEmail());

        if (persona instanceof Alumno) {
            System.out.println("imprimiendo datos del tipo Alumno");
            System.out.println("Institución: " + ((Alumno) persona).getInstitucion()); // se realiza un cast de alumno a persona
            System.out.println("Nota matematicas :" + ((Alumno) persona).getNotaMatematica());
            System.out.println("Nota Historia :" + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Castellano :" + ((Alumno) persona).getNotaCastellano());

            if (persona instanceof AlumnoInternacional) {
                System.out.println("Imprimiendo datos del tipo Alumno Internacional");
                System.out.println("Nota idiomas :" + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais : " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("**************SOBRE  ESCRITURA promedio ****************");
            System.out.println("Promedio : "+((Alumno) persona).calcularPromedio());
            System.out.println("*************************************");

        }
        if (persona instanceof Profesor) {
            System.out.println("Imprimiendo datos del tipo Profesor");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println("**************SOBRE  ESCRITURA SALUDAR ****************");
        System.out.println(persona.saludar());
        System.out.println("*************************************");
    }
}

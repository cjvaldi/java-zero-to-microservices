package org.cjvaldi.archivos.ejemplos;

import org.cjvaldi.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploLeerArchivo {
    public static void main(String[] args) {

        String nombreArchivo = "D:\\temporal\\java.txt";
        ArchivoServicio servicio = new ArchivoServicio();

        //System.out.println(servicio.leerArchivo(nombreArchivo));
        System.out.println(servicio.leerArchivo2(nombreArchivo));

    }
}

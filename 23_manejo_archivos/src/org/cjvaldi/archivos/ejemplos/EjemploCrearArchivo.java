package org.cjvaldi.archivos.ejemplos;

import org.cjvaldi.archivos.ejemplos.servicio.ArchivoServicio;

public class EjemploCrearArchivo {
    public static void main(String[] args) {
        String nombreArchivo = "D:\\temporal\\java.txt";

        ArchivoServicio service = new ArchivoServicio();
//        service.crearArchivo(nombreArchivo);
//        service.crearArchivo1(nombreArchivo);
//        service.crearArchivo2(nombreArchivo);
        service.crearArchivo3(nombreArchivo);

    }
}

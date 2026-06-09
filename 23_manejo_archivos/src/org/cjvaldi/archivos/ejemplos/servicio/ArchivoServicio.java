package org.cjvaldi.archivos.ejemplos.servicio;

import java.io.*;
import java.util.Scanner;

public class ArchivoServicio {

    public void crearArchivo(String nombre) {
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo, true); //escritor.append(
            escritor.append("Hola que tal amigos!\n")
                    .append("Todo bien? yo aca escribiendo un archivo.-..\n")
                    .append("Hasta Luego Lucas\n");
            escritor.close();
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo1(String nombre) {
        File archivo = new File(nombre);
        try {
            FileWriter escritor = new FileWriter(archivo, true); //escritor.append(
            BufferedWriter buffer = new BufferedWriter(escritor);
            buffer.append("Hola que tal amigos!\n")
                    .append("Todo bien? yo aca escribiendo un archivo.-..\n")
                    .append("Hasta Luego Lucas\n");
            buffer.close();  // cerrar siempre
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo2(String nombre) {
        File archivo = new File(nombre);
        try (BufferedWriter buffer = new BufferedWriter(new FileWriter(archivo, true))) {
            buffer.append("Hola que tal amigos!\n")
                    .append("Todo bien? yo aca escribiendo un archivo.-..\n")
                    .append("Hasta Luego Lucas\n");
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void crearArchivo3(String nombre) {
        File archivo = new File(nombre);
        try (PrintWriter buffer = new PrintWriter(new FileWriter(archivo, true))) {
            buffer.println("Hola que tal amigos!");
            buffer.println("Todo bien? yo aca escribiendo un archivo.-..");
            buffer.printf("Hasta Luego %s", "Lucas.");
            System.out.println("El archivo se ha creado con éxito!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String leerArchivo(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            BufferedReader reader = new BufferedReader(new FileReader(archivo));
            String linea;
            while ((linea = reader.readLine())!=null){
                sb.append(linea).append("\n");
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

    public String leerArchivo2(String nombre){
        StringBuilder sb = new StringBuilder();
        File archivo = new File(nombre);
        try {
            Scanner s = new Scanner(archivo);
            s.useDelimiter("\n");
            while (s.hasNext()){
                sb.append(s.next()).append("\n");
            }
            s.close(); // se puede obviar usando el try
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }

}
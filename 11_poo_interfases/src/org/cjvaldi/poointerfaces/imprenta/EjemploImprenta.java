package org.cjvaldi.poointerfaces.imprenta;

import org.cjvaldi.poointerfaces.imprenta.modelo.*;

import static org.cjvaldi.poointerfaces.imprenta.modelo.Genero.*;  //  para los Generos
import static org.cjvaldi.poointerfaces.imprenta.modelo.Imprimible.*;

public class EjemploImprenta {
    public static void main(String[] args) {

        Curriculo cv = new Curriculo(new Persona("Jhon"," Doe"), "Ing. de Sistemas", "Resumen Laboral....");
        cv.addExperiencias("Java")
                .addExperiencias("Oracle DBA")
                .addExperiencias("Spring Framework")
                .addExperiencias("Desarrollador fullstack")
                .addExperiencias("Angular");

        Libro libro = new Libro(new Persona("Erich"," Gamma"), "Patrones de Diseño: Elem. Rehusables POO"
                , PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Patrón Composite"))
                .addPagina(new Pagina("Patrón Facade"));

        Informe informe = new Informe(new Persona("Martin","Fowler"),
                new Persona("James","Gosling"), "Estudio sobre más microservicios.");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);

        /*-------------------------*/
        // clase anónima // imprime el texto por defecto de la interfase
        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de la clase anónima";
            }
        });

        Imprimible objImp = new Imprimible() {
            @Override
            public String imprimir() {
                return "Hola que tal, imprimiendo un objeto genérico de la clase anónima en una variable";
            }
        };
        imprimir(objImp);

        System.out.println(TEXTO_DEFECTO);
    }

}

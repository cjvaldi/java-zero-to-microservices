package org.cjvaldi.hilos.tareahiloalfanumerico;

public class EjemploHilos {
    public static void main() {

        // 1. Creamos las dos tareas con tipos diferentes
        AlfanumericoTarea tareaNumero = new AlfanumericoTarea(AlfanumericoTarea.Tipo.NUMERO);
        AlfanumericoTarea tareaLetra = new AlfanumericoTarea(AlfanumericoTarea.Tipo.LETRA);

        // 2. Creamos los hilos correspondientes asignándoles un nombre representativo
        Thread hiloNumeros = new Thread(tareaNumero,"Hilo-Números");
        Thread hiloLetras = new Thread(tareaLetra,"Hilo-Letras");

        // 3. Arrancamos la ejecución de los hilos en segundo plano
        hiloNumeros.start();
        hiloLetras.start();

        System.out.println("El hilo principal (main) ha iniciado ambos hilos de forma asíncrona");

    }
}

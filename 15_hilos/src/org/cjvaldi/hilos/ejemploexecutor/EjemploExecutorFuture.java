package org.cjvaldi.hilos.ejemploexecutor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.*;

public class EjemploExecutorFuture {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executor = Executors.newSingleThreadExecutor();   //ejecución por tareas

//        Runnable tarea = () -> {
        Callable<String> tarea = () -> {   // devuelve un resultado de tipo <>
            System.out.println("Inicio de la tarea...");
            try {
                System.out.println("Nombre del thread " + Thread.currentThread().getName());
                TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                e.printStackTrace();
            }
            System.out.println("Finaliza la tarea");
            return "Algun resultado importante de la tarea.";  // Callable
        };
//        Future<?> resultado = executor.submit(tarea);  // Runnable
        Future<String> resultado = executor.submit(tarea);
        executor.shutdown();
        System.out.println("Continuando con la ejecución del método main");  // resultado de Callable

//        System.out.println(resultado.isDone());
        while (!resultado.isDone()) {
            System.out.println("Ejecutando Tarea.....");
            TimeUnit.MILLISECONDS.sleep(1500);
        }
        System.out.println("Obtenemos resultados de la tarea: "+resultado.get());
        System.out.println("Finaliza la tarea: "+resultado.isDone());

    }
}

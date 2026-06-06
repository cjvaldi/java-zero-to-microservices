package org.cjvaldi.datetime.ejemplos;

import java.time.LocalDate;
import java.time.Period;

public class TareaCalcularFecha {
    public static void main(String[] args) {
        LocalDate  fecNac = LocalDate.parse("1974-11-28");
        LocalDate fechaActual = LocalDate.now();

        Period edad = Period.between(fecNac,fechaActual);

        System.out.printf("Edad : %d años , %d meses y %d días "
                ,edad.getYears(),edad.getMonths(),edad.getDays());

    }
}

/* Profesor

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class ProgramaCalculoEdadJava82 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un fecha de nacimiento con formato yyyy-MM-dd:");
        String fechaStr = scanner.next();

        LocalDate fechaNacimiento = LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        LocalDate actual = LocalDate.now();

        long anios = ChronoUnit.YEARS.between(fechaNacimiento, actual);
        System.out.printf("Tu edad es: %s años", anios);
    }
}

 */

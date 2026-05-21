import java.util.Scanner;

public class C110_EjemploArregloNotasAlumnos {
    public static void main(String[] args) {

        double[] claseMatematicas, claseHistoria, claseLenguaje;
        double sumaNotasMatematicas = 0, sumaNotasHistoria = 0, sumaNotasLenguaje = 0;
        claseMatematicas = new double[7];
        claseHistoria = new double[7];
        claseLenguaje = new double[7];

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese 7 notas de estudiantes para matemáticas");
        for (int i = 0; i < claseMatematicas.length; i++) {
            claseMatematicas[i] = s.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para historia");
        for (int i = 0; i < claseHistoria.length; i++) {
            claseHistoria[i] = s.nextDouble();
        }

        System.out.println("Ingrese 7 notas de estudiantes para Lenguaje");
        for (int i = 0; i < claseLenguaje.length; i++) {
            claseLenguaje[i] = s.nextDouble();
        }

        for (int i = 0; i < 7; i++) {
            sumaNotasMatematicas += claseMatematicas[i];
            sumaNotasHistoria += claseHistoria[i];
            sumaNotasLenguaje += claseLenguaje[i];
        }

        double promedioMatematicas = (sumaNotasMatematicas / claseMatematicas.length);
        double promedioHistoria = (sumaNotasHistoria / claseHistoria.length);
        double promedioLenguaje = (sumaNotasLenguaje / claseLenguaje.length);
        System.out.println("Promedio clase de matemáticas: " + promedioMatematicas);
        System.out.println("Promedio clase de historia: " + promedioHistoria);
        System.out.println("Promedio clase de lenguaje: " + promedioLenguaje);
        System.out.println("Promedio Total del curso = " +
                (promedioMatematicas + promedioHistoria + promedioLenguaje) / 3);
        System.out.println("Ingrese el identificador del alumno (de 0 - 6):");
        int id = s.nextInt();
        double promedioAlumno = (claseHistoria[id] + claseLenguaje[id] + claseMatematicas[id]) / 3;
        System.out.println("promedioAlumno = " +id +"= "+ promedioAlumno);
    }
}

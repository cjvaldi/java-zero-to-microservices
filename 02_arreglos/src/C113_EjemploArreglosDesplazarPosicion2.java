import java.util.Scanner;

public class C113_EjemploArreglosDesplazarPosicion2 {
    public static void main(String[] args) {

        int[] a = new int[10];
        int elemento, posicion;

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length - 1; i++) {
            System.out.print("Ingrese un número :");
            a[i] = s.nextInt();
        }

        System.out.println("Nuevo elemento: ");
        elemento = s.nextInt();

        System.out.println("Posición a donde agregar:");
        posicion =  s.nextInt();

        System.out.println();

        for (int i = a.length - 2; i >= posicion; i--) {
            a[i + 1] = a[i];
        }
        a[posicion] = elemento;

        System.out.println("El arreglo");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}

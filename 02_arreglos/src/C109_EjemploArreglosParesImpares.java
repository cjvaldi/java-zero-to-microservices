import java.util.Scanner;

public class C109_EjemploArreglosParesImpares {
    public static void main(String[] args) {
        int[] a, pares, impares;
        int totalPares = 0, totalImpares = 0;
        a = new int[10];
        Scanner s = new Scanner(System.in);

        System.out.println("ingrese los numeros hasta 10");
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextInt();
        }

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                totalPares++;
            } else {
                totalImpares++;
            }
        }
        pares = new int[totalPares];
        impares = new int[totalImpares];

        totalPares = 0;
        totalImpares = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                pares[totalPares++] = a[i];
            } else {
                impares[totalImpares++] = a[i];
            }
        }

        System.out.println("Pares = ");
        for (int i = 0; i < pares.length; i++) {
            System.out.print(pares[i] + " ");
        }

        System.out.println("\r\n Impares");
        for (int impare : impares) {
            System.out.print(impare + " ");
        }

    }
}

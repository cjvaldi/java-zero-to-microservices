import java.util.Scanner;

public class C116_Tarea13_EstadisticaDeArreglos {
    public static void main(String[] args) {
        int[] a = new int[7];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un numero entero = ");
            a[i] = s.nextInt();
        }

        double contarPositivos =0, sumaPositivos = 0, contarNegativos=0, sumaNegativos=0, contarCeros = 0;

        for (int j : a) {
            if (j > 0) {
                sumaPositivos += j;
                contarPositivos++;
            } else if (j < 0) {
                sumaNegativos += j;
                contarNegativos++;
            } else
                contarCeros++;
        }
        System.out.println(" Promedio Positivos = " + (contarPositivos>0?sumaPositivos/contarPositivos:0));
        System.out.println(" Promedio Negativos = " + (contarNegativos>0?sumaNegativos/contarNegativos:0));
        System.out.println(" Contar Ceros = " + contarCeros);

        s.close();
    }
}

import java.util.Scanner;

public class C116_Tarea12_NumeroMasAlto {
    public static void main(String[] args) {
        int[] a = new int[7];
        int contador = 0;
        Scanner s = new Scanner(System.in);

        while (contador < a.length ) {
            boolean sw = false;
            System.out.print("Ingrese un Número del 11 al 99 :");
            int numero = s.nextInt();
            if (numero > 10 && numero < 100) {
                if (contador == 0) {
                    a[contador] = numero;
                    contador++;
                } else {
                    for (int i = 0; i <= contador; i++) {
                        if (numero == a[i]) {
                            System.out.println("  Numero ya fue ingresado!!");
                            sw = true;
                            break;
                        }
                    }
                    if (!sw) {
                        a[contador] = numero;
                        contador++;
                    }
                }
            }else{
                System.out.println("....el número debe estar entre el 11 al 99 :");
            }
        }
        System.out.println();
        int mayor = 0;
        for (int i = 0; i < a.length; i++) {
            mayor = (a[mayor] >a[i])?mayor : i;
        }
        System.out.println("Numero más alto = " + a[mayor]);
    }
}

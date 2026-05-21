import java.util.Scanner;

public class C116_Tarea11_Ordenar {
    public static void main(String[] args) {
        int[] a = new int[10];

        Scanner s = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("Ingrese un Número :");
            a[i] = s.nextInt();
        }
        System.out.println();

        for (int i = 0; i <(a.length )/2; i++) {
            System.out.println("a["+(a.length-1 -i)+"] = " + a[a.length-1 -i]);
            System.out.println("a["+i+"] = " + a[i]);
        }
    }
}

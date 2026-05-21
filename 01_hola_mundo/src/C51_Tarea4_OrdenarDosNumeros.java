import java.util.Scanner;

public class C51_Tarea4_OrdenarDosNumeros {
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese 1er número");
        num1=s.nextInt();

        System.out.println("Ingrese 2do número");
        num2=s.nextInt();

        System.out.println("Números de mayor a menor = " + (num1>num2? num1+" "+num2:num2+" "+num1 ));
    }
}

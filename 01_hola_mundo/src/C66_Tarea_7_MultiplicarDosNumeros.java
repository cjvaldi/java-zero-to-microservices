import java.util.Scanner;

public class C66_Tarea_7_MultiplicarDosNumeros {
    public static void main(String[] args) {
        int num1=0 , num2 = 0, resultado = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el número multiplicando :");
        num1 = s.nextInt();
        System.out.println("Ingrese el número multiplicador :");
        num2 = s.nextInt();

        if (num1 !=0 || num2 !=0){
            for (int i=1; i <= num2 ; i++){
                resultado+=num1;
                System.out.println("resultado "+num1 +"x"+i+"= " + resultado);
            }
        }
    }
}

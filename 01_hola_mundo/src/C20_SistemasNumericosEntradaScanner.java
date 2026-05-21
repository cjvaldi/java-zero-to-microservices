import java.util.InputMismatchException;
import java.util.Scanner;

public class C20_SistemasNumericosEntradaScanner {
    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        //String numeroStr=scanner.nextLine();   // lee un string de prefencia numerica
        int numeroDecimal=0;
        try {
            //numeroDecimal = Integer.parseInt(numeroStr);   // aquí lee un texto
            numeroDecimal= scanner.nextInt();  // aquí lee un numero pero arroja otro tipo de excepción

        }catch(InputMismatchException e){   //    "Exception"  es la principal
        // catch(Exception e){   //    "Exception"  es la clase principal
            System.out.println("Error debe ingresar un numero entero");   // por consola
            main(args);  // de forma recursiva se llama al main si se ingresa un dato erroneo
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal+" = "+Integer.toBinaryString(numeroDecimal);

        String resultadoOctal="numero octal de " + numeroDecimal+" = "+Integer.toOctalString(numeroDecimal);

        String resultadoHexa="numero hexadecimal de " + numeroDecimal+" = "+Integer.toHexString(numeroDecimal);

        String mensaje =resultadoBinario;
        mensaje+= "\n"+ resultadoOctal;
        mensaje+="\n"+ resultadoHexa;

        System.out.println("mensaje = " + mensaje);




    }
}

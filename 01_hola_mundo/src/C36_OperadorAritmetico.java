import javax.swing.*;

public class C36_OperadorAritmetico {
    public static void main(String[] args) {

        int i = 5, j = 4, suma = i + j;  // variables en una sola linea si son del mismo tipo

        System.out.println("suma = " + suma);

        System.out.println("i + j = " + i + j);  // formato cadena

        System.out.println("i + j = " + (i + j)); // realiza la operacion

        int resta = i - j;

        System.out.println("resta = " + resta);
        System.out.println("i- j = " + (i - j));   // en los strig "-" no resta

        int multi = i * j;
        System.out.println("multi = " + multi);

        int div = i / j;
        float div2 = (float) i / (float) j;
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int resto = i % j;   //el resto =0 es par
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if (numero % 2 == 0) {
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }
    }
}

import javax.swing.*;

public class C19_SistemasNumericos {
    public static void main(String[] args) {

        //int numeroDecimal=500; esto es cuando ingresamos directamente los valores
        // vamos a pedir y mostrar sobre ventanas
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un número entero");
        int numeroDecimal=0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error debe ingresar un número entero");  // por ventana
            System.out.println("mensaje de e = " + e);   // por consola
            main(args);
            System.exit(0);
        }
        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal+" = "+Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario=0b111110100;   //0b para que lo reconozca como binario
        System.out.println("numeroBinario = " + numeroBinario);
        String resultadoOctal="numero octal de " + numeroDecimal+" = "+Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        
        int numeroOctal=0764;  // 0 para que lo reconozca como Octal
        System.out.println("numeroOctal = " + numeroOctal);
        String resultadoHexa="numero hexadecimal de " + numeroDecimal+" = "+Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHexa);

        int numeroHex =0x1f4;  //0x para que lo reconozca hexadecimal
        System.out.println("numeroHex = " + numeroHex);

        String mensaje =resultadoBinario;
        mensaje+= "\n"+ resultadoOctal;
        mensaje+="\n"+ resultadoHexa;

        JOptionPane.showMessageDialog(null,mensaje);




    }
}

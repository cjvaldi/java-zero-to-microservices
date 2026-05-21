public class C59_SentenciaFor {
    public static void main(String[] args) {
        // variable del for / la forma ideal
        // ++ incrementa
        for (int i = 0; i <= 5; i++) {
            System.out.println("numero  = " + i);
        }

        // -- decrementa
        for (int i = 5; i >= 0; i--) {
            System.out.println("numero  = " + i);
        }

        // la variable es del main / global
        int j = 0;
        for (; j < 5; j++) {
            System.out.println("*j = " + j);
        }
        System.out.println("*j = " + j);

        // for sin parámetros
        j = 0;
        for (; ; ) {
            if (j > 5) {
                break;
            }
            System.out.println("-j = " + j);
            j++;
        }
        System.out.println("-j = " + j);

        // con 2 variables
        for (int i = 1, z = 10; i < z; i++, z--) {
            System.out.println(i + " - " + z);
        }

        // numero impares
        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {  // para imp pares negamos la sentencia del if !
                continue;
                // salta la iteración, no la ejecuta hasta el final, no pasa al SOUTV
            }
            System.out.println("numero  = " + i);
        }
    }
}

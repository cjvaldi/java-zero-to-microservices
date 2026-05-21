public class C61_SentenciaWhileDoWhile {
    public static void main(String[] args) {

        int i = 0;
        // while (pre-condición)
        System.out.println("pre condición i<=5");
        while (i <= 5) {
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;
        System.out.println("pre condición mientras prueba sea True para lo cual i es menor de 7");
        while (prueba) {
            if (i == 7) {
                prueba = false;
            }
            System.out.println("i = " + i);
            i++;
        }

        prueba = false;
        while (prueba) {
            System.out.println("nunca se ejecuta");
        }

        // post condicion
        prueba = false;
        i = 0;
        do {
            System.out.println("se ejecuta al menos una vez");
            i++;
        } while (prueba);

        prueba = true;
        i = 0;
        do {
            if (i == 10) {
                prueba = false;
            }
            System.out.println("i " + i);
            i++;
        } while (prueba);
    }
}

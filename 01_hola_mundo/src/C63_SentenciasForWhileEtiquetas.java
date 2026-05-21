public class C63_SentenciasForWhileEtiquetas {
    public static void main(String[] args) {

        // la etiqueta es bucle1
        bucle1:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;  // sale al bucle anterior
                }
                System.out.print("i = " + i + ", j " + j);
            }
        }
        System.out.println("\n---------------");

        etiqueta:
        for (int i = 0; i < 5; i++) {
            System.out.println();
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break etiqueta; //sale de "etiqueta"
                }
                System.out.print("i = " + i + ", j " + j);
            }
        }
        // bucle:     nombre del bucle
        bucle:
        for (int i = 1; i <= 7; i++) {
            int j = 1;
            while (j <= 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Dia " + i + " : descanso fin de semana");
                    continue bucle;
                }
                System.out.println("Dia " + i + " trabajo hora : " + j);
                j++;
            }

        }

    }
}

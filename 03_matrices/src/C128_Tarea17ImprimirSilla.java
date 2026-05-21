import java.util.Scanner;

public class C128_Tarea17ImprimirSilla {
    public static void main(String[] args) {

        int variable;
        boolean sw = true;
        Scanner s = new Scanner(System.in);

        while (sw) {
            System.out.print("Ingrese el tamaño de la silla, pulse 0 para salir : ");
            variable = s.nextInt();
            if (variable == 0) {
                System.out.println("ERROR");
                sw = false;
            } else {
                String[][] matriz = new String[variable][variable];

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        if (j == 0 || i == matriz[i].length / 2 || (i > matriz[i].length / 2) && j == matriz[i].length - 1) {
                            matriz[i][j] = "1";
                        } else {
                            matriz[i][j] = "0";
                        }
                    }
                }

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        System.out.print(matriz[i][j]);
                    }
                    System.out.println();
                }
            }
            System.out.println();
        }
    }
}

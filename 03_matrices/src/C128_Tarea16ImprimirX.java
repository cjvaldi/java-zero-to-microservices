import java.util.Scanner;

public class C128_Tarea16ImprimirX {
    public static void main(String[] args) {

        int variable ;
        boolean sw = true;
        Scanner s = new Scanner(System.in);

        while (sw) {
            System.out.print("La base puede ser 5 o 6, pulse 0 para salir :");
            variable = s.nextInt();
            if (variable == 0){
                System.out.println("ERROR");
                sw = false;
            }else if (variable == 5 || variable == 6) {
                String[][] matriz = new String[variable][variable];

                for (int i = 0; i < matriz.length; i++) {
                    for (int j = 0; j < matriz[i].length; j++) {
                        if (i == j || i == matriz[i].length - 1 - j) {
                            matriz[i][j] = "X";
                        } else {
                            matriz[i][j] = "_";
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
        System.out.println("Se ha terminado la ejecución");
    }
}

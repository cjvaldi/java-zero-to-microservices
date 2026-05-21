public class C123_EjemploMatrizSimetrica {
    public static void main(String[] args) {
        boolean simetrica = true;

        int[][] matriz = {
                {1, 2, 3, 4},
                {2, 1, 0, 5},
                {3, 0, 1, 6},
                {4, 5, 6, 7}
        };
        int i,j;
        i=0;
        // tener en cuenta que se pueden usar etiquetas
        while(i < matriz.length && simetrica == true){
            j=0;
            while (j <i && simetrica == true){
                if (matriz[i][j] != matriz[j][i]){
                    simetrica = false;
                }
                j++;
            }
            i++;
        }

        // ejempl usando etiquetas ya no se inicializan las variables fuera
        salir:for (int x =0; x < matriz.length;x++){
            for (int y = 0; y < i; y++) {
                if (matriz[x][y] != matriz[y][x]){
                    simetrica = false;
                    break salir;
                }
            }
        }

        if (simetrica){
            System.out.println("La matriz es simetrica");
        } else {
            System.out.println("la matriz no es simetrica");
        }
    }
}

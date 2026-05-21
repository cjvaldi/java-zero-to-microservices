public class C121_EjemploMatrizBuscar {
    public static void main(String[] args) {
        int[][] matrizDeEnteros = {
                {35, 90, 3, 1978},
                {14, 2020, 10, 5},
                {677, 177, 34563, 1999}
        };

        int elementoBuscar = 177;
        boolean encontrado = false;
        int i;
        int j=0;
        buscar:for (i = 0; i < matrizDeEnteros.length; i++) {
            for (j = 0; j < matrizDeEnteros[i].length; j++) {
                if (matrizDeEnteros[i][j] == elementoBuscar) {
                    encontrado = true;
                    break buscar;
                }
            }
        }
        if (encontrado){
            System.out.println("Encontrado " + elementoBuscar + " en las coordenadas "+i+" , "+ j);
        }else{
            System.out.println(elementoBuscar + "No se encontró en la matriz");
        }

    }
}

public class C102_EjemploArreglosForOdenamientoBurbujaOptimizado {

    public static void arregloInverso(String[] arreglo) {
        int total2=arreglo.length;
        int total = arreglo.length;
        for (int i = 0; i < total2; i++) {
            String actual = arreglo[i];
            String inverso =arreglo[total-1-i];
            arreglo[i]=inverso;
            arreglo[total-1-i]= actual;
            total2--;
        }
    }
    public static void main(String[] args) {

        String[] productos = {"Kingston Memoria","Chasis Teclado","LG Pantalla","Ratón","Movil","Asus Portatil","Baseus Reloj"};

        int total = productos.length;

        int contador = 0; // para ver la iteracciones que se realizan

        /* Método Burbuja, ordenar */
        
        for (int i = 0; i < total - 1; i++) {

            for (int j = 0; j < total -1 -i; j++) {
                if(productos[j+1].compareTo(productos[j])<0){
                    String auxiliar = productos[j];
                    productos[j] =  productos[j+1];
                    productos[j+1] = auxiliar;
                }
                contador++;
            }
        }
        System.out.println("contador = " + contador);
        //Arrays.sort(productos);    // ordena el arreglo de forma natura,
        //arregloInverso(productos);   // generando una función o la siguiente forma nativa Coll....
        // Collections.reverse(Arrays.asList(productos));

        System.out.println("===== Usando for ======");
        for (int i = 0; i <total ; i++) {
            System.out.println("para indice " + i+ " : "+productos[i]);
        }


    }
}

import java.util.Arrays;
import java.util.Collections;

public class C100_EjemploArreglosForInversoMutable {

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

        String[] productos = {"Kingston Memoria","Teclado","Pantalla","Ratón","Movil","Asus Portatil","Baseus Reloj"};

        int total = productos.length;

        Arrays.sort(productos);    // ordena el arreglo de forma natura,

        arregloInverso(productos);   // generando una función o la siguiente forma nativa Coll....

        // Collections.reverse(Arrays.asList(productos));

        System.out.println("===== Usando for ======");
        for (int i = 0; i <total ; i++) {
            System.out.println("para indice " + i+ " : "+productos[i]);
        }


    }
}

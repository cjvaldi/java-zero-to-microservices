import java.util.Arrays;

public class C99_EjemploArreglosForInverso {
    public static void main(String[] args) {

/*        String[] productos = new String[7];
        int total = productos.length;

        productos[0]="Memoria";
        productos[1]="Teclado";
        productos[2]="Pantalla";
        productos[3]="Ratón";
        productos[4]="Movil";
        productos[5]="Portatil";
        productos[6]="Reloj";

        usando otra forma conociendo los elementos */

        String[] productos = {"Memoria","Teclado","Pantalla","Ratón","Movil","Portatil","Reloj"};

        int total = productos.length;

        Arrays.sort(productos);    // ordena el arreglo de forma natura,

        System.out.println("===== Usando for ======");
        for (int i = 0; i <total ; i++) {
            System.out.println("para indice " + i+ " : "+productos[i]);
        }

        System.out.println("===== Usando for inverso ======");
        for (int i = 0; i <total ; i++) {
            System.out.println("para indice " + (total-1-i)+ " : "+productos[total-1-i]);
        }

        System.out.println("===== Usando for inverso 2======");
        for (int i = total -1; i >= 0 ; i--) {
            System.out.println("para indice " + (total-1-i)+ " : "+productos[total-1-i]);
        }



    }
}

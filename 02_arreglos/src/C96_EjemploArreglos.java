import java.util.Arrays;

public class C96_EjemploArreglos {
    public static void main(String[] args) {

        int[] numeros = new int[4];

        numeros[0]= 1;
        numeros[1]= 2;  // "2" daria error por el tipo salvo  Integer.valueOf("2"); que lo fuerza
        numeros[2]= 3;
        numeros[3]= 4;
        //numeros[4]= 5;  // daria excepción porque es un elemento que supera la maxima

        int i = numeros[0];
        int j = numeros[1];
        int k = numeros[2];
        int l = numeros[3];

        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println("k = " + k);
        System.out.println("l = " + l);

        /*
        numeros.length me da el total de elementos
                para posicionarme en el ultimo elemento usaremos numeros.length -1
        */

        /*
        C96_Ejemplo de Arreglo ordenado

        Esta parte es para gestionar el ordenamiento de forma natural, por el contenido
        */

        String[] productos = new String[7];
        productos[0]="Memoria";
        productos[1]="Teclado";
        productos[2]="Pantalla";
        productos[3]="Ratón";
        productos[4]="Movil";
        productos[5]="Portatil";
        productos[6]="Reloj";

        Arrays.sort(productos);    // ordena el arreglo de forma natura,

        String prod1 = productos[0];
        String prod2 = productos[1];
        String prod3 = productos[2];
        String prod4 = productos[3];
        String prod5 = productos[4];
        String prod6 = productos[5];
        String prod7 = productos[6];

        System.out.println("productos[0] = " + productos[0]);
        System.out.println("productos[1] = " + productos[1]);
        System.out.println("productos[2] = " + productos[2]);
        System.out.println("productos[3] = " + productos[3]);
        System.out.println("productos[4] = " + productos[4]);
        System.out.println("productos[5] = " + productos[5]);
        System.out.println("productos[6] = " + productos[6]);

        System.out.println("prod1 = " + prod1);
        System.out.println("prod2 = " + prod2);
        System.out.println("prod3 = " + prod3);
        System.out.println("prod4 = " + prod4);
        System.out.println("prod5 = " + prod5);
        System.out.println("prod6 = " + prod6);
        System.out.println("prod7 = " + prod7);

    }
}

import java.util.Scanner;

public class C34_Tarea_ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner nombre = new Scanner(System.in);

        System.out.println("Ingrese el nombre de 3 familiares");

        System.out.println("n1 = ");
        String n1= nombre.nextLine();

        System.out.println("n2 = ");
        String n2= nombre.nextLine();

        System.out.println("n3 = ");
        String n3= nombre.nextLine();

        String aux1 = n1.toUpperCase().substring(1,2).concat(".").concat(n1.substring(n1.length()-2));
        String aux2 = n2.toUpperCase().substring(1,2).concat(".").concat(n2.substring(n2.length()-2));
        String aux3 = n3.toUpperCase().substring(1,2).concat(".").concat(n3.substring(n3.length()-2));

        String cadena=aux1.concat("_").concat(aux2).concat("_").concat(aux3);

        System.out.println("cadena = " + cadena);
    }
}

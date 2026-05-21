import java.util.Scanner;

public class C44_OperadoresLogicosLoginArreglos {
    public static void main(String[] args) {
        String[] usernames = new String[3];
        String[] passwords = new String[3];
        // formas de introducir datos

        usernames[0] = "cristian";
        passwords[0] = "12345";

        usernames[1] = "admin";
        passwords[1] = "12345";

        usernames[2] = "pepe";
        passwords[2] = "12345";

        /*
        otra manera de definir los arreglos

         String[] usernames = {"cristian","admin","pepe"};
         String[] passwords = {"12345","12345","12345"};
         */


        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username");
        String u = scanner.next();

        System.out.println("Ingrese el password");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i=0;i<usernames.length;i++){
            if ( (usernames[i].equals(u) && passwords[i].equals(p)) ) {
                esAutenticado = true;
                break; // pasa salir del for
            }
        }

        if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Username o contraseña incorrecto");
            System.out.println("Necesita autentificar");
        }

    }
}

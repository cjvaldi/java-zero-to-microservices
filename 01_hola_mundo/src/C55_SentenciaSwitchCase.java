public class C55_SentenciaSwitchCase {
    public static void main(String[] args) {
        // soporta primitivo int, byte, short, char ,string ,enum
        int num=2;
        switch (num) {
            case 0:
                System.out.println("El numero es cero");
                break;  // para salir del switch
            case 1:
                System.out.println("El numero es uno");
                break;
            case 2:
                System.out.println("El numero es dos");
                break;
            case 3:
                System.out.println("El numero es tres");
                break;
            case 4:
                System.out.println("El numero es cuatro");
                break;
            default:
                System.out.println("Número o carácter desconocido");
        }

        String nombre="Cristian";
        switch (nombre){
            case "admin":
                System.out.println("Hola Admin");
                break;
            case "Cristian":
                System.out.println("Hola Cristian");
                break;
            case "pepe":
                System.out.println("Hola Pepe");
                break;
            default:
                System.out.println("Usuario no identificado");
        }

    }
}

import java.util.Scanner;

public class C66_Tarea_9_CalcularNumeroMenor {
    public static void main(String[] args) {
        /** Crear una clase con el método main donde el desafío es buscar el número menor de mínimo 10 valores enteros,
         * usando la clase Scanner ingresar la cantidad de números a comparar,
         * luego utilizando una sentencia for iterar el número de veces (ingresado) para pedir el número entero,
         * entonces se requiere:
         * Calcular el menor número e imprimir el valor.
         * Si el menor número es menor que 10, imprimir "El número menor es menor que 10!".
         * si no, imprimir " el numero menor es igual o mayor que 10!".
         * */
        Scanner scanner = new Scanner(System.in);

        // Pedimos la cantidad de números (mínimo 10, como indica el enunciado)
        System.out.print("¿Cuántos números quieres comparar? (mínimo 10): ");
        int cantidad = scanner.nextInt();

        if (cantidad < 10) {
            System.out.println("Debes introducir al menos 10 números.");
            return;
        }

        // Pedimos el primer número para inicializar numeroMenor
        System.out.print("1.- Introduce un número: ");
        int numeroMenor = scanner.nextInt();

        // Iteramos desde el segundo número
        for (int i = 2; i <= cantidad; i++) {
            System.out.print(i + ".- Introduce un número: ");
            int num = scanner.nextInt();

            if (num < numeroMenor) {
                numeroMenor = num;
            }
        }

        System.out.println("El número menor es: " + numeroMenor);

        if (numeroMenor < 10) {
            System.out.println("El número menor es menor que 10!");
        } else {
            System.out.println("El número menor es igual o mayor que 10!");
        }

        scanner.close();
    }
}
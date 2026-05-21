public class C62_SentenciaForEach {
    public static void main(String[] args) {

        // forEach solo para arreglos o colecciones

        int[] numeros = {1, 3, 4, 7, 9, 11, 13, 14};
        for (int num : numeros) {
            System.out.println("num = " + num);
        }
        String[] nombres = {"Andres", "Pepe", "Maria", "Carmen", "Juan", "Carlos"};
        for (String nombre : nombres) {
            System.out.println("nombre = " + nombre);
        }
    }
}

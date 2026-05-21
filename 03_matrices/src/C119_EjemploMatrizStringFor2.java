public class C119_EjemploMatrizStringFor2 {
    public static void main(String[] args) {

        // simplificando la declaración de la matriz

        String[][] nombres = {{"Pepa","Pepe"},{"Josefa","Paco",}, {"Lucas","Pancha"}};
//        nombres[0][0] = "Pepe";  // simplicando la declaracion de la matriz
//        nombres[0][1] = "Pepa";
//
//        nombres[1][0] = "Josefa";
//        nombres[1][1] = "Paco";
//
//        nombres[2][0] = "Lucas";
//        nombres[2][1] = "Pancha";

        System.out.println("Iterando con foreach");
        for (String[] fila : nombres) {
            for (String nombre: fila) {
                System.out.println( nombre +"\t");
            }
        }
    }
}   

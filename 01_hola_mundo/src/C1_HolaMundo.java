public class C1_HolaMundo {
    public static void main(String[] args){
        // si se pone las iniciales "psvm"+TAB se auto completa public static void main
        //  otra opción es colocar solo "main" + intro
        String saludar="Hola Mundo desde Java";
        System.out.println(saludar);
        //soutv+tab completa + System.out.print + la variable
        System.out.println("saludar.toUpperCase = " + saludar.toUpperCase());
        int numero=10;
        System.out.println("numero = " + numero);
        boolean valor=true;
        if (valor){
            System.out.println("numero = " + numero);
            int numero2=10;   // si se coloca dentro de este bloque, solo existe aqui
        }
        // desde la version 10 de java se asigna el tipo automatic
        var numero3=15;  // dependiendo del dato se le asigna el tipo que puede ser int, cadena, double
        String nombre;
        nombre ="Cristian";
        System.out.println(nombre);
        System.out.println("nombre = " + nombre);
        // siempre hay que inicializar las variables para el uso
        // para los comentarios
        /* para bloques
        parte del bloque
        para identar CTRL+ALT+I
        02/03/2026 retomamos el curso
         */

    }
}


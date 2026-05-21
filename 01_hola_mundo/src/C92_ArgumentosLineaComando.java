public class C92_ArgumentosLineaComando {
    public static void main(String[] args) {

        if (args.length == 0){
            System.out.println("Debe ingresar argumentos");
            System.exit(-1);
        }
        for (int i = 0; i < args.length; i++) {
            System.out.println("Argumentos nº " + i + " : " + args[i]);
        }

        // para compilar desde la línea de comando usar "javac nombreArchivo.java" o
        // directo ejecutarlo click derecho para crear automáticamente
        // luego usar java nombreArchivo
        // cuando son argumentos compuestos se usan las comilla "Cristian Jacson"
        // para que reconozca los caracteres especiales agregar -encoding utf8
        // javac nombrearchivo.java -enconding utf8
    }
}
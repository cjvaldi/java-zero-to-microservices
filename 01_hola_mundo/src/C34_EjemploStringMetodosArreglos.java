public class C34_EjemploStringMetodosArreglos {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        // nos arroja la posicion "hash" @adsfe
        System.out.println("1 trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println("largo = " + largo);
        for (int i = 0; i < largo; i++) {
            System.out.println("arreglo = " + arreglo[i]);  // println salta la linea print imprime seguido
        }
        System.out.println("2 trabalenguas = " + trabalenguas.split("a")); //split crea otro arreglo
        String[] arreglo2 = trabalenguas.split("a");
        int xlen = arreglo2.length;
        for (int j = 0; j < xlen; j++) {
            System.out.println(arreglo2[j]);
        }
        String archivo = "alguna.imagen.jpeg";
        String[] archivoArr = archivo.split("\\."); //  " \\." los 2 \\ es para que reconozca el punto ya que es una exp regular
        xlen = archivoArr.length;        // "[.]"  para una exp regular  "\\." o "[.]"
        for (int j = 0; j < xlen; j++) {
            System.out.println(archivoArr[j]);
        }
        // ahora solo nos quedaremos con la expresion final que contiene la extesion
        System.out.println("archivoArr[archivoArr.length-1] = " + archivoArr[archivoArr.length - 1]);

    }
}

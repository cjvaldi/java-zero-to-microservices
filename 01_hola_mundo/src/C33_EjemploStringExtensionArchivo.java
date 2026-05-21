public class C33_EjemploStringExtensionArchivo {
    public static void main(String[] args) {
        String archivo="alguna.imagen.jpeg";

        // se calcula el tamaño de la cadena
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));
        // se requiere el ver la extensión desde el punto // pero si la longitud de la ext variará ??

        int i=archivo.indexOf("."); //retorna la posición donde se encuentra la primera ocurrencia
        System.out.println("i = " + i);
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));

        i=archivo.lastIndexOf(".");  //la última ocurrencia donde se encuentra el punto "imagen.grande.png"
        System.out.println("archivo.substring(i+1) = " + archivo.substring(i+1));


    }
}

public class C31_EjemploStringMetodos {
    public static void main(String[] args) {

        String nombre="Cristian";
        System.out.println("nombre = " + nombre);

        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Cristian\") = " + nombre.equals("Cristian"));
        System.out.println("nombre.equals(\"cristian\") = " + nombre.equals("cristian"));
        System.out.println("nombre.equalsIgnoreCase(\"Cristian\") = " + nombre.equalsIgnoreCase("Cristian"));
        System.out.println("nombre.compareTo(\"Cristian\") = " + nombre.compareTo("Cristian"));
        System.out.println("nombre.compareTo(\"Crstina\") = " + nombre.compareTo("Crstina"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(nombre.length()-1 = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(2) = " + nombre.substring(1));
        System.out.println("nombre.substring(1.4) = " + nombre.substring(1,4)); // ini, fin_no_inclusive
        System.out.println("nombre.substring(nombre.length()-1) = " + nombre.substring(nombre.length() - 1));

        // C32 _ Mas métodos String

        String trabalenguas="trabalenguas";
        System.out.println("trabalenguas = " + trabalenguas.replace("a","."));  //replace solo para el formato
        System.out.println("trabalenguas = " + trabalenguas);  // mantiene el texto original ya que no se le ha pedido que asigne
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));  //retorna la primera posición de la ocurrencia
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a')); //retorna la ultima posición
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z')); // 'a' "lengua" caracter o cadena // si es menor que 0 no lo encontro en la cadena
        System.out.println("trabalenguas.contains(\"t\") = " + trabalenguas.contains("t")); //retorna si o no boolean
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba")); //return T o F si inicia la frase en la cadena
        System.out.println("trabalenguas.endsWith(\"guas\") = " + trabalenguas.endsWith("guas"));  //return T o F si finaliza la frase en la cadena
        System.out.println("  trabalenguas  ");  //agregaos espacios en blanco
        System.out.println("trabalenguas ".trim());  // para quitar los espacios en blanco






    }
}

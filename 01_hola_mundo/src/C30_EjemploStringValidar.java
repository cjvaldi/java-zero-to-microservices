public class C30_EjemploStringValidar {
    public static void main(String[] args) {
        String curso=null;
        boolean esNulo=curso==null;
        System.out.println("esNulo = " + esNulo);
        // todo string si se concatene con un null dará una excepción NullPointerException
        if(esNulo) {
            curso = "Programación Java";
        }
        
        boolean esVacio=curso.length()==0;  //forma de ver si tiene contenido
        System.out.println("esVacio = " + esVacio);

        curso=" ";
        boolean esVacio2=curso.isEmpty();   // si esta vacio
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco=curso.isBlank() ;  // es tiene un espacio en blanco
        if (esVacio2){   // (curso.isEmpty==false)  // (esBlanck())
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));

        }

    }
}

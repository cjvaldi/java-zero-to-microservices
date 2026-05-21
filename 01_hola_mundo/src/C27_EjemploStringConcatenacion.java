public class C27_EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Cristian Valdivieso";

        String detalle = curso + " con el profesor " + profesor;
        System.out.println("detalle = " + detalle);

        int numeroA = 10;
        int numeroB = 5;

        System.out.println(detalle+ numeroA+numeroB);

        System.out.println(detalle+ (numeroA+numeroB));

        System.out.println(numeroA + numeroB + detalle) ;
        
        //String detalle2 =curso.concat(profesor);  // concat concatena se puede anidar
        String detalle2= curso.concat(" con ").concat(profesor); //se anida los concat

        System.out.println("detalle2 = " + detalle2);


    }
}

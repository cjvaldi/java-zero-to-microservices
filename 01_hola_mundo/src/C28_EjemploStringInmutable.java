public class C28_EjemploStringInmutable {
    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Cristian Valdivieso";

        curso.concat(profesor);  // lo concatena en curso
        String resultado = curso.concat(profesor); // crea un nuevo objeto
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);

        // expresiones LANDA
       /** String resultado2;
        resultado2 = curso.transform(c -> {
          return c + " con " + profesor;
        });
        System.out.println("curso = " + curso);
        */
        
//      resultado.replace("a","A" ); aqui no gestiona cambios
            String resultado3=resultado.replace("a","A" );  // gestiona cambios en la nueva var
            System.out.println("resultado = " + resultado);
            System.out.println("resultado3 = " + resultado3);


    }
}

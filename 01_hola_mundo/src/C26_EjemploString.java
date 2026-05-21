public class C26_EjemploString {
    public static void main(String[] args) {
        String curso="Programación Java";
        String curso2 = new String("Programación Java"); // también es válido
        boolean esIgual = curso==curso2; // compara por referencia
        System.out.println("esIgual ="+esIgual );  //false

        esIgual = curso.equals(curso2);   // equals o equalsIgnoreCase compara por valor
        System.out.println("esIgual = " + esIgual); //true

        String cursoA="programación Java";
        esIgual = curso.equalsIgnoreCase(cursoA);   // equalsIgnoreCase compara por valor
        System.out.println("esIgual = " + esIgual); //true
        
        String curso3="programaciónJava";
        esIgual=curso==curso3;
        System.out.println("curso == curso3  = " + esIgual); // false

    }
}

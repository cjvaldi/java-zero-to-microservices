import javax.swing.*;

public class C51_Tarea6_NombreMasLargo {
    public static void main(String[] args) {
        String persona1 = JOptionPane.showInputDialog(null,"Ingrese Persona 1 Nombre y apellidos");
        String persona2 = JOptionPane.showInputDialog(null,"Ingrese Persona 2 Nombre y apellidos");
        String persona3 = JOptionPane.showInputDialog(null,"Ingrese Persona 3 Nombre y apellidos");

        System.out.println("persona1 = " + persona1);
        System.out.println("persona2 = " + persona2);
        System.out.println("persona3 = " + persona3);

        String mensaje = (persona1.length()>persona2.length()?persona1:persona2 );
        mensaje = (mensaje.length()>persona3.length()?mensaje:persona3 );
        mensaje = mensaje+" tiene el nombre más largo.";

        JOptionPane.showMessageDialog(null,mensaje);
    }
}
/**
 * Obtener el nombre mas largo de tres personas, según los siguientes requerimientos
 *
 * Mediante el teclado pedir el nombre completo (nombre + apellido) de tres miembros de la familia o amigos
 * usando la clase JOptionPane y método showInputDialog().
 *
 * Calcular e Imprimir el nombre de la persona que tenga el nombre más largo (en cantidad de caracteres)
 * (Imprimir sólo uno de los tres, el de más caracteres en el nombre.)
 *
 * Podría usar .split(" "); del objeto String para separar nombre y apellido en un arreglo,
 * y con el indice cero accedemos al nombre de la persona.
 *
 * Restricción no usar loops en el desarrollo de la tarea.
 *
 * Ejemplo del resultado: "Guillermo Doe tiene el nombre más largo."
 *
 * Preguntas de esta tarea
 * Cuál es el código fuente de tu solución
 */
/**
 * Solución del profe
 *
 * import javax.swing.JOptionPane;
 *
 * public class ProgramaNombreMasLargo {
 *     public static void main(String[] args) {
 *         String persona1 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
 *         String persona2 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
 *         String persona3 = JOptionPane.showInputDialog("Ingresa el nombre y apellido de un familiar o amigo:");
 *
 *         String max = (persona1.split(" ")[0].length() < persona2.split(" ")[0].length()) ? persona2 : persona1;
 *         max = (persona3.split(" ")[0].length() < max.split(" ")[0].length()) ? max: persona3;
 *
 *         System.out.println("La persona con el nombre mas largo es " + max);
 *     }
 * }
 */
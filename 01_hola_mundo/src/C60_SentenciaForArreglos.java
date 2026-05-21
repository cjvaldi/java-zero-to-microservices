import javax.swing.*;
import java.util.Locale;

public class C60_SentenciaForArreglos {
    public static void main(String[] args) {
        // String[] nombre = new String[6]; una forma de declarar arrays
        String[] nombre = {"Andres", "Pepe", "Maria", "Carmen", "Juan", "Carlos"};
        int count = nombre.length;
        for (int i = 0; i < count; i++) {
            if (nombre[i].equalsIgnoreCase("andres") ||
                    nombre[i].equalsIgnoreCase("carlos")) {
                continue;
            }
            System.out.println(i + ".- " + nombre[i]);
        }
        for (int i = 0; i < count; i++) {
            if (nombre[i].toLowerCase().contains("ANDRES".toLowerCase()) ||
                    nombre[i].toLowerCase().contains("caRLos".toLowerCase())) {
                continue;
            }
            System.out.println(i + ".- " + nombre[i]); // imprimimos mientras realizamos la búsqueda.
        }
        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o \"Juan\"");
        System.out.println("buscar = " + buscar);
        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombre[i].toLowerCase().contains(buscar.toLowerCase())) {
                encontrado = true;
                // continue; para no llegar al fin del bloque
                break; // para salir del bucle
            }
            System.out.println(i + ".- " + nombre[i]);
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " ha sido encontrado");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no ha sido encontrado");
        }
    }
}

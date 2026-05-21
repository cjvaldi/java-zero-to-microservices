import java.util.Scanner;

public class C51_Tarea5_SistemaEstanqueGasolina {
    public static void main(String[] args) {
        int gas = 0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese los litros actuales de gas : " );
        gas=s.nextInt();

        String mensaje = "";
        if (gas>=0 && gas<20) {
            mensaje = "Insuficiente";
        }else if(gas>=20 && gas<35) {
            mensaje = "Suficiente";
        }else if(gas>=35 && gas<40) {
            mensaje = "Medio Estanque";
        }else if(gas>=40 && gas<60) {
            mensaje = "Estanque 3/4";
        }else if(gas>=60 && gas<70) {
            mensaje = "Estanque casi lleno";
        }else if(gas==70) {
            mensaje = "Estanque lleno";
        }
        System.out.println("Capacidad = " + mensaje);
    }
}
/**
 * Suponiendo un estanque de gasolina (gas) con capacidad 70 litros, se requiere un programa que pida la medida actual en litros y mostrar el resultado de la forma: Insuficiente, Suficiente, Medio...
 *
 * La medida o capacidad actual del estanque puede ser en tipo double, para una mejor precisión, pero tambien puede ser del tipo int.
 *
 * Si la capacidad actual es 70 litros: imprimir Estanque lleno
 *
 * Si está entre 60 y menor a 70: imprimir Estanque casi lleno
 *
 * Si está entre 40 y menor a 60: imprimir Estanque  3/4
 *
 * Si está entre 35 y menor a 40: imprimir Medio Estanque
 *
 * Si está entre 20 y menor a 35: imprimir Suficiente
 *
 * Si está entre 1 y menor a 20: imprimir Insuficiente
 *
 * Preguntas de esta tarea
 * Cuál es le código de la tarea, publica la clase main
 */
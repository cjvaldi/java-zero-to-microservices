import java.util.Scanner;

public class C45_OperadorTernario {
    public static void main(String[] args) {

        //   variable = condición ? true:false ;

        String variable = 7 == 7 ? "es verdad" : " es falso ";

        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la nota de matemática entre 2.0 - 7.0:");
        matematicas = s.nextDouble();

        System.out.println("Ingrese la nota de ciencias entre 2.0 - 7.0:");
        ciencias = s.nextDouble();

        System.out.println("Ingrese la nota de historia entre 2.0 - 7.0:");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        estado = promedio >= 5.49 ? "aprobado" : "rechazado";

        System.out.println("estado= " + estado);
        System.out.println("promedio = " + promedio);

        /*
        if (promedio>=5.49){
            estado="aprobado";
        }else {
            estado = "desaprobado";
        }
        */

    }

}

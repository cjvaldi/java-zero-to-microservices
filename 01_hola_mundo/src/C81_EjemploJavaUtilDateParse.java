import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class C81_EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s =  new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Ingrese una fecha con formato 'yyyy-MM-dd' ");
        try {
            // Date fecha =  format.parse("1974-11-28"); // lo tiene que ingresar el user
            Date fecha =  format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("format = " + format.format(fecha));

            // para comparar 2 fechas
            Date fecha2 = new Date();
            System.out.println("fecha2 o actual = " + fecha2);
            if(fecha.after(fecha2)){
                System.out.println("Fecha1 (del usuario) es después que la fecha2 (actual)");
            }else if (fecha.before(fecha2)){
                System.out.println("fecha es anterior que fecha2");
            }else if (fecha.equals(fecha2)){
                System.out.println("fecha es igual a fecha 2");
            }

            //  utilizando la interface compareTo
            if(fecha.compareTo(fecha2)>0){
                System.out.println("Fecha1 (del usuario) es después que la fecha2 (actual)");
            }else if (fecha.compareTo(fecha2)<0){
                System.out.println("fecha es anterior que fecha2");
            }else if (fecha.compareTo(fecha2) == 0){
                System.out.println("fecha es igual a fecha 2");
            }
        } catch (ParseException e){
            //e.printStackTrace();
            System.err.println("La fecha tiene un formato incorrecto : "+e.getMessage());
            System.err.println("El formato debe ser 'yyyy-MM-dd'");
            //System.exit(1); // sale del programa
            //invocar al main , vuelve a preguntar
            main(args);

        }
    }
}

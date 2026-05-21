import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class C80_EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance();
        //fecha de prueba 28/11/1974 - EJEMPLOS LOS SIGUIENTES
        //calendario.set(1974, 10, 28, 18, 20, 10);  // los meses empiezan en 0 al 11
        //calendario.set(1974, Calendar.NOVEMBER, 28, 18, 20, 10);  // con la constate DEL MES
        // definiendo las fechas
        calendario.set(Calendar.YEAR, 1974);
        calendario.set(Calendar.MONTH, Calendar.NOVEMBER);
        calendario.set(Calendar.DAY_OF_MONTH, 28);

        // calendario.set(Calendar.HOUR_OF_DAY, 18);  // formato 24 horas
        calendario.set(Calendar.HOUR, 7);  // formato 12 horas con AM o PM
        calendario.set(Calendar.AM_PM, Calendar.AM);
        calendario.set(Calendar.MINUTE, 20);
        calendario.set(Calendar.SECOND, 10);
        calendario.set(Calendar.MILLISECOND, 125);

        Date fecha = calendario.getTime();
        System.out.println("fecha sin formato = " + fecha);

        // SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a"); // HH es formato 24 horas
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss:SSS a"); // hh es formato 12 horas
        String fechaConFormato = formato.format(fecha);
        System.out.println("fecha Con Formato = " + fechaConFormato);

    }
}
/**
 * CTRL + d DUPLICAR
 * CTRL + X ELIMINAR
 * CTR + / COMENTAR
 * CTRL + ALT + / = COMENTAR BLOQUE
 */
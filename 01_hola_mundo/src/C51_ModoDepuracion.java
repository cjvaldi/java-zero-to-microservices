public class C51_ModoDepuracion {
    public static void main(String[] args) {

        // probamos la herramienta Debugger

        int i = 14;
        int j = 8;
        int k = 20;

        double promedio = (i + j + k) / 3d;
        System.out.println("promedio = " + promedio);

        promedio = (i + j + k) / 3d *10;
        System.out.println("promedio = " + promedio);

        promedio = (++i + j-- + k) / 3d;
        System.out.println("promedio = " + promedio);

        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }
}

/** tabla de Precedecia de Operadores
 ++ -- + - !
 ()
 * / %
 > >= < <= instanceof
 == !=
 &&
 ||
 ()?
 = += -= *= /= %=
 */
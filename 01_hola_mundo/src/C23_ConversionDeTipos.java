public class C23_ConversionDeTipos {
    public static void main(String[] args) {
        String numeroStr = "50";
        // var numeroStr="50";   var es asignación tipo flexible

        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        // el metodo parse..... depende del tipo

        String realStr = "98765.43";
        // var realStr = "98765.43";  // formato tipo flexsible
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        String logicoStr = "True";  // MAY o MIN
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        // conversión de tipo primitivo a cadenas Tipo.toString    cap 22

        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);

        String otroNumeroStr = Integer.toString(otroNumeroInt);

        otroNumeroStr = String.valueOf(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);


        //otroNumeroStr=String.valueOf(otroNumeroStr+10);  // + concatena 2 cadenas de str
        otroNumeroStr = String.valueOf(otroNumeroInt + 10);  // + ahora si los suma
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double otroRealDouble = 1.23456e2;   // =1.23456 y con notación e
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);

        otroRealStr = String.valueOf(1.23456e2f);
        System.out.println("otroRealStr = " + otroRealStr);

        //  se aplicarón  valueOf   o toString

        // ----------------------------------- cap 23 conversion entre tipos primitivos
        int i = 10000;
        //short s=i;   // aquí hay que forzar para no perder información
        short s = (short) i;
        long l = i;
        System.out.println("l = " + l);
        System.out.println(Short.MAX_VALUE);   // 32767
        System.out.println(Integer.MAX_VALUE);   // soporta mas

        char b = (char) i;  //un char esta asignado a aun valor unicode
        System.out.println("b = " + b);
        float f = (float) i;
        System.out.println("f = " + f);

    }
}

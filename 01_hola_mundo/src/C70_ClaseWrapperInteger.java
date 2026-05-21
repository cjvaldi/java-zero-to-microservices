public class C70_ClaseWrapperInteger {
    public static void main(String[] args) {
        // Integer intObjeto =  new Integer(32768); // ya no se utiliza se utiliza los Autounboxing
        Integer intObjeto = Integer.valueOf(32768);
        Integer intObjeto2 = 32768;
        System.out.println("intObjeto = " + intObjeto);

        // unboxing
        int intPrimitivo = 37268;
        Integer intObjeto3 = Integer.valueOf(intPrimitivo);
        Integer intObjeto4 = intPrimitivo;

        int num = intObjeto3;
        System.out.println("num = " + num);
        int num2 = intObjeto3.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor =  Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObjeto = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObjeto);
        // mientras el tipo soporte la capacidad lo refleja correctamente!!

        Byte byteObjeto =  intObjeto.byteValue(); //  si el valor es superior a su capacidad pierde información
        System.out.println("byteObjeto = " + byteObjeto);

        Long longObjeto = intObjeto.longValue();
        System.out.println("longObjeto = " + longObjeto);

    }
}

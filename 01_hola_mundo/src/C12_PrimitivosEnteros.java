public class C12_PrimitivosEnteros {
    public static void main(String[] args) {
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a "+Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a "+Byte.SIZE);
        System.out.println("Valor máximo de un byte "+Byte.MAX_VALUE);
        System.out.println("Valor máximo de un byte "+Byte.MIN_VALUE);

        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a "+Short.BYTES);
        System.out.println("Tipo short corresponde en bites a "+Short.SIZE);
        System.out.println("Valor máximo de un short "+Short.MAX_VALUE);
        System.out.println("Valor máximo de un short "+Short.MIN_VALUE);

        int numeroInt = 32768;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a "+Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a "+Integer.SIZE);
        System.out.println("Valor máximo de un int "+Integer.MAX_VALUE);
        System.out.println("Valor máximo de un int "+Integer.MIN_VALUE);

        long numeroLong = 9223372036854775807L;  // L convierte a entero
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a "+Long.BYTES);
        System.out.println("Tipo long corresponde en bites a "+Long.SIZE);
        System.out.println("Valor máximo de un long "+Long.MAX_VALUE);
        System.out.println("Valor máximo de un int "+Long.MIN_VALUE);

        var numeroVar = 127;    // var asigna el tipo de forma automática cuando supera el límite de cada tipo.


    }
}

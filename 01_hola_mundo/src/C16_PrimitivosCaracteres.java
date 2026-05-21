public class C16_PrimitivosCaracteres {
    public static void main(String[] args) {
        /* se utiliza la comilla simple '
         para los caracteres unicode
        '\'u_simbolo de la tabla de caracteres de windows
        @ = \u0040
        */

        //char caracter='A';
        char caracter='\u0040';
        char decimal=64;  // formato hexadecimal
        System.out.println("caracter = " + caracter);
        System.out.println("decimal = " + decimal);
        System.out.println("decimal = caracter " + (decimal == caracter));

        char simbolo='@';
        System.out.println("simbolo = " + simbolo);
        System.out.println("simbolo = caracter " + (simbolo==caracter));

        var caracterVar = '\u0040';  // var le asigna el tipo auto

        System.out.println("char corresponde en byte  = "+Character.BYTES);
        System.out.println("char corresponde en bites = "+Character.SIZE);
        System.out.println("Character.MIN_VALUE = " + Character.MIN_VALUE);   // es un espacio en blanco
        System.out.println("Character.MAX_VALEU = " + Character.MAX_VALUE);   // un caracter especial depende del SO

        char espacio='\u0020';  // o ' '
        char retroceso='\b';
        char tabulador= '\t';
        char nuevaLinea='\n';
        char retornoCarro='\r';

        System.out.println("char corresponde en byte="+ retornoCarro +Character.BYTES);
        System.out.println("char corresponde en byte="+ nuevaLinea +Character.BYTES);
        System.out.println("char corresponde en byte="+ tabulador +Character.BYTES);
        System.out.println("char corresponde en byte="+ retroceso +Character.BYTES);
        System.out.println("char corresponde en byte="+ espacio+Character.BYTES);




    }
}

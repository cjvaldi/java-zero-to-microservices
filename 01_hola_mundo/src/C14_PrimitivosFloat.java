public class C14_PrimitivosFloat {
    public static void main(String[] args) {
        float realFloat1=1.0f;    // si le ponemos . sin f no lo reconoce da error
        float realFloat2=2.12e3f; //  2120f exp3 float  f o F
        float realFloat3=1.5e4f;    // si le ponemos . sin f no lo reconoce da error
        float realFloat4=1.5e-10f;    // si le ponemos . sin f no lo reconoce da error
        float realFloat5=0.000000000015f;    // notación mantisa // notación scientific
        System.out.println("realFloat = " + realFloat1);
        System.out.println("realFloat = " + realFloat2);
        System.out.println("realFloat = " + realFloat3);
        System.out.println("realFloat = " + realFloat4);
        System.out.println("realFloat = " + realFloat5);

        ///************************

        float numeroFloat0 = 32767;
        System.out.println("numeroFloat = " + numeroFloat0);
        System.out.println("Tipo float corresponde en byte a "+Float.BYTES);
        System.out.println("Tipo float corresponde en bites a "+Float.SIZE);
        System.out.println("Valor máximo de un float "+Float.MAX_VALUE);
        System.out.println("Valor máximo de un float "+Float.MIN_VALUE);

        double realDouble=3.4028235E39;
        System.out.println("realDouble = " + realDouble);
        System.out.println("Tipo double corresponde en byte a "+Double.BYTES);
        System.out.println("Tipo double corresponde en bites a "+Double.SIZE);
        System.out.println("Valor máximo de un double "+Double.MAX_VALUE);
        System.out.println("Valor máximo de un double "+Double.MIN_VALUE);

        //var varFlotante=3.1416; // lo asigna automáticamente
        float varFlotante = 0.0F;   // siempre hay que inicializar si no dara error
        System.out.println("varFlotante = " + varFlotante);



    }
}

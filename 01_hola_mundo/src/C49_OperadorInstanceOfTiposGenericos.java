public class C49_OperadorInstanceOfTiposGenericos {
    public static void main(String[] args) {
        // la clase object es la clase padre de las variables
        Object texto = "Creando un objeto de la clase String ... que tal!";

        // Number también es clase padre
        Number num = 7;
        // Number num = Integer.valueOf(7); // esta es otra forma de declarar las variales genéricas

        Boolean b1 = texto instanceof String;
        System.out.println("texto es de tipo String  = " + b1);

        b1 = texto instanceof Object;
        System.out.println("texto es de tipo Object  = " + b1);

        b1 = texto instanceof Integer;
        System.out.println("texto es de tipo Integer = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es de tipo Number = " + b1);

        b1 = num instanceof Object;
        System.out.println("num es de tipo Object = " + b1);

        b1 = num instanceof Long;
        System.out.println("num es de tipo Long = " + b1);

        b1 = num instanceof Short;
        System.out.println("num es de tipo Sort = " + b1);

        b1 = num instanceof Number;
        System.out.println("num es del tipo Number = " + b1);


        Number decimal = 45.54f;
        b1 = decimal instanceof Double;
        System.out.println("decimal es del tipo Double = " + b1);

        b1 = decimal instanceof Float;
        System.out.println("decimal es del tipo Float = " + b1);

        b1 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number = " + b1);

        b1 = decimal instanceof Integer;
        System.out.println("decimal es del tipo Integer = " + b1);


        b1 = b1 instanceof Boolean;
        System.out.println("b1 es de tipo Boolean = " + b1);
    }
}

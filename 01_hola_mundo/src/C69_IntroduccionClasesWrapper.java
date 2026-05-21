public class C69_IntroduccionClasesWrapper {
    public static void main(String[] args) {
        /**
         * Tipos de datos de referencia
         * basados en tipos primitivos
         * •
         * Cada tipo primitivo tiene su equivalente en un tipo de referencia o clase
         * •
         * Dan mayor funcionalidad para operaciones de comprobaciones y conversiones
         * Tipo primitivo          Clase Equivalente
         *      byte                 Byte
         *      short                Short
         *      int                  Integer
         *      long                 Long
         *      float                Float
         *      double               Double
         *      char                 Character
         *      boolean              Boolean
         *
         *
         */
        /**
        La Clase Integer
        •Cada tipo numérico tiene su propia clase de objetos.
        •Así el tipo int tiene la clase Integer .
        •Se implementan varios métodos útiles dentro de la clase envoltorio Integer
        Integeri = Integer.valueOf 1234567
        Strings = i.toString
        intj = i.intValue
        long l = i.longValue
        float f = i.floatValue
        double d = i.doubleValue
        int k = Integer.parseInt (("

         La Clase Integer
         • Constantes de Integer
             • Integer.MIN_VALUE
             • Integer.MAX_VALUE

         • Métodos estáticos
             •  String Integer.toString ( int i, int base
             •         String Integer.toString ( int i
             •         int Integer.parseInt ( String s, int base
            •         int Integer.parseInt ( String s
            •         Integer Integer.valueOf ( String s, int base
            •         Integer Integer.valueOf ( String s

         •
         Métodos de la instancia
         •         int intValue
         •         long longValue
         •         float floatValue
         •         double doubleValue
         •         String toString
         •         int hashCode
         •         boolean equals( Object obj )
         •         byte byteValue
         •         short shortValue

         La Clase  Long
         • Cada tipo numérico tiene su propia clase de objetos, así el tipo long tiene la clase Long .
         •  De la misma forma que con la clase Integer , se implementan muchas funciones útiles dentro
         de los métodos de la clase Long .
         Long l = Long.valueOf 2147483648L
         String s = l.toString
         int  i = l.intValue
         long j = l.longValue
         float f = l.floatValue
         double d = l.doubleValue
         long k = Long.parseLong ("9223372036854775807");

     •Constantes de Long
     •         Long.MIN_VALUE
     •         Long.MAX_VALUE
     •         Métodos estáticos
     •         String Long.toString ( long l, int base
     •         String Long.toString ( long l
     •         long L.parseLong ( String s, int base
     •         long L.parseLong ( String s
     •         Long Long.valueOf ( String s, int base
     •         Long Long.valueOf ( String s

         La Clase Long , Double, Float, Character, Boolean funcionan casi igual que las anteriores

         •
         */
    }
}

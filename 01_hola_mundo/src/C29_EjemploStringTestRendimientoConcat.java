public class C29_EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            // c=c.concat(a).concat(b.concat("\n")); //500 =>1ms  1000 2ms  10000 96 100000 4994
            // c+=a+b+"\n";                          //500 = 19ms 1000 45ms 10000 151  100000 2765
            sb.append(a).append(b).append("\n");    // 500 = 0ms  1000 3ms  10000 3ms 100000 17
        }    // el StringBuilder es mas eficiente

        System.gc(); // acelera el recolector de java para reciclar

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());


        //Para salir
        System.exit(0);
    }
}

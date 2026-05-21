public class C116_Tarea15_Histograma {
    public static void main(String[] args) {

        //int[] a = {4, 3, 4, 6, 6, 4, 1, 4, 5, 2, 1, 1};
        //int[] a = {4, 3, 5, 6, 6, 4, 1, 4, 5, 4, 1, 1};
        int[] a = {4, 2, 4, 6, 2, 4, 1, 4, 2, 4, 1, 1};

        for (int i = 1; i <= 6; i++) {
            System.out.print(i + " : ");
            for (int j = 0; j < a.length; j++) {
                if (i == a[j]) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}

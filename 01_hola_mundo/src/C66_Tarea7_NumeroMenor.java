public class C66_Tarea7_NumeroMenor {
    public static void main(String[] args) {
        int[] numeros={200,8,110,400,30,340,7,305,42,60,1,2};
        int numMenor=numeros[0];
        for (int i:numeros) {
            //System.out.println("i = " + i);
            if (numMenor>i){
                numMenor=i;
                //System.out.println("número menor = " + i);
            }
        }
        System.out.println("El número menor es = " + numMenor);
    }
}

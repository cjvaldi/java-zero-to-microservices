import java.util.Random;

public class C90_EjemploClaseMathRandom {
    public static void main(String[] args) {

        String[] colores =  {"azul","amarillo","rojo","verde","blanco","negro"};

        // del 0 al 1
        double random = Math.random();
        System.out.println("random = " + random);
        random *= colores.length;

        System.out.println("random = " + random);

        random = Math.floor(random);
        System.out.println("random = " + random);

        System.out.println("colores = " + colores[(int) random]);

        // clase 91 Random de java util

        Random randomObj =  new Random();
        int randomInt = randomObj.nextInt();  //nextLong tipo long
        // int randomInt = randomObj.nextInt(7);//hasta el 7 no incluido
        // int randomInt = 15 + randomObj.nextInt(25-15);//desde el 15 hasta el 25 no incluido
        // int randomInt = 15 + randomObj.nextInt(25-15+1);//desde el 15 hasta el 25 incluido
        System.out.println("randomInt = " + randomInt);

        randomInt =  randomObj.nextInt(colores.length);
        System.out.println("randomInt = " + randomInt);
        System.out.println("colores = " + colores[randomInt]);

    }
}

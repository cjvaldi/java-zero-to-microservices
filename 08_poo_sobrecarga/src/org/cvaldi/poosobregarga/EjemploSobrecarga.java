package org.cvaldi.poosobregarga;
import static org.cvaldi.poosobregarga.Calculadora.*;  // asi no tenemos que colocar Calculadora.
public class EjemploSobrecarga {
    public static void main(String[] args) {

        //Calculadora cal = new Calculadora();  se crea un constructor private y ya no se coloca
        //System.out.println("sumar int : "+Calculadora.sumar(10,5)); // con import solo se coloca el método
        System.out.println("sumar int : "+sumar(10,5));
        System.out.println("sumar float : " + sumar(10.0f,5));
        System.out.println("sumar float - int" + sumar(10,5.0f));
        System.out.println("sumar int - float: "+sumar(10,5f));
        System.out.println("sumar String : "+sumar("9","3"));
        System.out.println("sumar 3 int : " +sumar(10,5,3));
        System.out.println("sumar 4 int : " +sumar(10,5,3,4));
        System.out.println("sumar 6 int : " +sumar(10,5,3,4,5,6));
        System.out.println("sumar float + n int : " +sumar(10F,10,5,3,4,5,6));
        System.out.println("suma de 4 doubles : "+sumar(10.0,5.0,45.8,12.7));

        System.out.println("sumar long: "+sumar(10L,5L));
        System.out.println("sumar int : "+ sumar(10, '@'));
        System.out.println("sumar float int : "+sumar(10F,'@'));

    }


}

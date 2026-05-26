package org.cjvaldi.pooexcepciones.ejemplo;

import javax.swing.*;

public class EjemploExcepciones {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String numerador = JOptionPane.showInputDialog("Ingrese un entero numerador: ");
        String denominador = JOptionPane.showInputDialog("Ingrese un entero denominador: ");
        int divisor;
        double division;

        try {
//            divisor = Integer.parseInt(valor);
//            division = cal.dividir(10, divisor);
//            System.out.println("division = " + division);

            double division2 = cal.dividir(numerador,denominador);
            System.out.println("division2 = " + division2);
        } catch (FormatoNumeroException e) {
            System.out.println("Se detecto una excepción: ingrese un número valido: " + e.getMessage());
            e.printStackTrace();
            main(args); // se vuelve a ejecutar
        } catch (NumberFormatException nfe) {
            System.out.println("Se detecto un excepción: ingrese un valor numérico: " + nfe.getMessage());
            main(args); // se vuelve a ejecutar
        } catch (DivisionPorZeroException ae) {  // excepción personalizada
            System.out.println("Capturamos la excepción en tiempo de ejecución:" + ae.getMessage());
            main(args);
        } finally {
            System.out.println("finally -> Es opcional, pero se ejecuta siempre con excepción o sin excepción!!");
        }
        System.out.println("Continuamos con la ejecución");
    }
}

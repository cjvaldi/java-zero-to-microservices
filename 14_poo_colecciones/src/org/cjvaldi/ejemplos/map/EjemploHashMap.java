package org.cjvaldi.ejemplos.map;

import java.util.*;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();
        System.out.println("Contiene elementos= "+!persona.isEmpty());
        persona.put(null, "1234");
        persona.put(null, "12345"); // no permite duplicidad en la clave
        persona.put("nombre", "Jhon");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Doe");
        persona.put("email", "jhon.doe@email.com");
        persona.put("edad", "30");

        System.out.println(persona);

        String nombre = persona.get("nombre");
        System.out.println("nombre = " + nombre);
        String apellido = persona.get("apellido");
        System.out.println("apellido = " + apellido);

        //Métodos más importantes
        //String valorApellido = persona.remove("apellidoPaterno");
        boolean b = persona.remove("apellidoPaterno", "Doe"); // tiene que coincidir clave valor
        System.out.println("eliminado = " + b);
        System.out.println("persona = " + persona);

        boolean b2 = persona.containsKey("apellidoPAterno");
        System.out.println("b2 = " + b2);

        b2 = persona.containsValue("jhon.doe@email.com");
        System.out.println("b2 = " + b2);

        Collection<String> valores = persona.values();
        for (String v : valores) {
            System.out.println("v = " + v);
        }

        Set<String> llaves = persona.keySet();
        for (String k : llaves) {
            System.out.println("k = " + k);
        }

        System.out.println("==========entrySet===========");
        for (Map.Entry<String, String> par : persona.entrySet()) {
            System.out.println(par.getKey() + " => " + par.getValue());
        }

        System.out.println("==========keySet===========");
        for (String llave : persona.keySet()) {
            String valor = persona.get(llave);
            System.out.println(llave + " => " + valor);
        }

        System.out.println("===========java 8==========");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });

        System.out.println("Total: "+persona.size());
        System.out.println("Contiene elementos= "+!persona.isEmpty());

        System.out.println("===========modificando==========");
        persona.replace("nombre","Cristian");
        System.out.println("persona = " + persona);
        boolean b3 = persona.replace("nombre","Cristian","Jhon");
        System.out.println("Cambio realizado = " + b3);
        System.out.println("persona = " + persona);


    }
}

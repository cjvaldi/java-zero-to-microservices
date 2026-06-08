package org.cjvaldi.patrones.singleton;

public class ConexionBDSingleton {

    private static ConexionBDSingleton instancia;

    private ConexionBDSingleton(){
        System.out.println("Conectandose a algun motor de base de datos");
    }

    public static ConexionBDSingleton getInstancia(){
        if(instancia==null){
            instancia = new ConexionBDSingleton();
        }
        return instancia;
    }
}

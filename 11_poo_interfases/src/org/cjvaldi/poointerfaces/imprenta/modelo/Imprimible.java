package org.cjvaldi.poointerfaces.imprenta.modelo;

public interface Imprimible {

    //final static String TEXTO_DEFECTO = "Imprimiendo un valor por defecto"; // por defecto es final static
    String TEXTO_DEFECTO = "Imprimiendo un valor por defecto";

    //String imprimir();  // public String imprimir();

    /* De esta manera las clases hijas no están obligadas a la implementación.
    pero si la implementan tiene que sobreescribirlo @Override
     */
    default String imprimir(){
        return TEXTO_DEFECTO;
    }


    static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());
    }
}

package org.cvaldi.pooclasesabstractas.form.validador;

import org.cvaldi.pooclasesabstractas.form.validador.mensaje.MensajeFormateable;

public class LargoValidador extends Validador implements MensajeFormateable {

    protected String mensaje = "el campo %s dene tener mínimo %d caracteres y máximo %d caracteres";
    private int min;
    private int max = Integer.MIN_VALUE;

    public LargoValidador() {
    }

    public LargoValidador(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setMax(int max) {
        this.max = max;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public boolean esValido(String valor) {
        //this.mensaje = String.format(this.mensaje, this.min, this.max);
        if(valor== null){
            return true;
        }
        int largo = valor.length();
        return (largo >= min && largo <=max);
    }


    // método de la implementación
    @Override
    public String getMensajeFormateado(String campo) {
        return String.format(this.mensaje, campo,this.min, this.max);    }

   /* public String getMensajeFormateado(String campo){  // se implementa de la interface
        return String.format(this.mensaje, campo,this.min, this.max);
    }*/
}

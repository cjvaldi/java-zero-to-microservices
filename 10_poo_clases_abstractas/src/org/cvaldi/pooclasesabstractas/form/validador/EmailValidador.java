package org.cvaldi.pooclasesabstractas.form.validador;

public class EmailValidador extends Validador {

    protected String mensaje = "el camo %s tiene un formato de correo invalido";

    private final static String EMAIL_REGEX = "^(.+)@(.+)$";   //   ALT+94 = ^

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
        return valor.matches(EMAIL_REGEX);
    }
}

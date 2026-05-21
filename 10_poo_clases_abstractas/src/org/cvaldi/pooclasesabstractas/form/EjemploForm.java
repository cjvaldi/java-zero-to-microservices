package org.cvaldi.pooclasesabstractas.form;

import org.cvaldi.pooclasesabstractas.form.elementos.*;
import org.cvaldi.pooclasesabstractas.form.elementos.select.Opcion;
import org.cvaldi.pooclasesabstractas.form.validador.*;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());

        InputForm password = new InputForm("clave", "password");
        password.addValidador((new RequeridoValidador()))
                .addValidador(new LargoValidador(6, 12));

        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());

        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador());

        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        lenguaje.addOpcion(new Opcion("1", "Java"))
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "JavaScript"))
                .addOpcion(new Opcion("4", "TypeScript").setSelected())
                .addOpcion(new Opcion("5", "PHP"));

        /* clases anónimas: son clases que solo se utilizan una vez */
        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disable name='" + this.nombre + "' value=\"" + this.valor + "\">";
            }
        };

        saludar.setValor("Hola que tal, este campo esta deshabilitado");
        username.setValor("jhon.doe");
        password.setValor("a1b2c3");
        email.setValor("jhon.do@correo.com");  //jhon.doe@correo.com
        edad.setValor("28");
        experiencia.setValor("....más de 10 años de experiencia...");
//        java.setSelected(true); hemos marcado una opción en la implementación java.SetSelected(true) o () sobrecarga

        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);

//        /*for (ElementoForm e : elementos) {
//            System.out.println(e.dibujarHtml());
//            System.out.println("<br>");
//        }*/
        /* expresiones landa / esta es otra forma de iterar */
        elementos.forEach(e -> {
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        elementos.forEach(e -> {
            if (!e.esValido()) {
                e.getErrores().forEach(System.out::println);
                //e.getErrores().forEach(err -> System.out.println(e.getNombre() + ": " + err));
            }
        });
    }
}

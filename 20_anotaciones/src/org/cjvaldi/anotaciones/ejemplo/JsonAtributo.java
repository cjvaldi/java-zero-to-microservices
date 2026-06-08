package org.cjvaldi.anotaciones.ejemplo;

import java.lang.annotation.*;

@Documented
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAtributo {
    String nombre() default "";
    boolean capitalziar() default false;
}

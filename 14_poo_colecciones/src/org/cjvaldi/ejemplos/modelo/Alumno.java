package org.cjvaldi.ejemplos.modelo;

import java.util.Objects;

public class Alumno implements Comparable<Alumno> {
    private String nombre;
//    private int nota;
    private Integer nota; //objeto

    public Alumno() {
    }

    public Alumno(String nombre, Integer nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNota() {
        return nota;
    }

    public void setNota(Integer nota) {
        this.nota = nota;
    }

    @Override
    public String toString() {
        return nombre + ", nota=" + nota;
    }

    // Función que indica que el tipo por defecto de la ordenación,
    // que puede ser por nombre o nota o personalizarla en la clase principal
    @Override
    public int compareTo(Alumno a) {
        // por defecto es nombre
        /*if (this.nombre == null) {
            return 0;
        }
        return this.nombre.compareTo(a.nombre);*/
        //Para comparar números
        /*if (this.nota == a.nota) {
            return 0;
        }
        if (this.nota > a.nota) {
            return 1;
        } else {
            return -1;
        }*/
        // Cuando es un objeto Integer
        if(this.nota ==null){
            return 0;
        }
        return  this.nota.compareTo(a.nota);
    }

    @Override
    // si solo quiero comparar por un solo campo quito el otro
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alumno alumno = (Alumno) o;
        return Objects.equals(nombre, alumno.nombre) && Objects.equals(nota, alumno.nota);
    }

    @Override
    // si solo quiero comparar por un solo campo quito el otro
    public int hashCode() {
        return Objects.hash(nombre, nota);
    }
}

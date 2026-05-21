package org.cvaldi.tarea21Almacen.Persona;

public class Cliente extends Persona {
    private String telefono;

    public Cliente(String nombre, String nie, String telefono) {
        super(nombre, nie);
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }
}

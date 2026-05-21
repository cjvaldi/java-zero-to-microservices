package org.cvaldi.Tarea19Personas;

public class Cliente extends Persona{
    private int clienteId;
    public static int indiceCliente;

    public Cliente() {
    }

    public Cliente(String nombre, String apellido, String numeroFiscal, String direccion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.clienteId = ++indiceCliente;
    }

    public int getClienteId() {
        return clienteId;
    }
    @Override
    public String tipoPersona(){
        return "\nCondición  : Cliente ";
    }
    @Override
    public String toString() {
        return super.toString()+
                tipoPersona() + " ,  Cliente Id : " + clienteId +
                "\n";
    }
}

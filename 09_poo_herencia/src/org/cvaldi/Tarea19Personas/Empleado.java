package org.cvaldi.Tarea19Personas;

public class Empleado extends Persona {
    private double remuneracion;
    private int empleadoId;
    public static int indiceEmpleado;

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion) {
        super(nombre, apellido, numeroFiscal, direccion);
        this.remuneracion = remuneracion;
        this.empleadoId = ++indiceEmpleado;
    }

    public double getRemuneracion() {
        return remuneracion;
    }

    public int getEmpleadoId() {
        return empleadoId;
    }

    public void aumentarRemuneracion(int porcentaje){
        this.remuneracion += (this.remuneracion/100)*(porcentaje);
    }

    @Override
    public String tipoPersona(){
        return "\nCondición  : Empleado ";
    }

    @Override
    public String toString() {
        return super.toString()+
               tipoPersona() + " ,  empleadoId : " + empleadoId +
                " ** Remuneración =" + remuneracion+
                "\n" ;
    }
}

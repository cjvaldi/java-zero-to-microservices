package org.cvaldi.Tarea19Personas;

public class Gerente extends Empleado {
    private double presupuesto;

    public Gerente() {
    }

    public Gerente(String nombre, String apellido, String numeroFiscal, String direccion, double remuneracion, double presupuesto) {
        super(nombre, apellido, numeroFiscal, direccion, remuneracion );
        this.presupuesto = presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public double getPresupuesto() {
        return presupuesto;
    }
    @Override
    public String tipoPersona(){
        return "\nCondición  : Gerente ";
    }

    @Override
    public String toString() {
        return super.toString()+
               " Presupuesto =" + presupuesto +
                "\n";
    }
}

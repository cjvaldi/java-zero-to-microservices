package org.cvaldi.Tarea19Personas;

public class EjemploGerente {
    public static void main(String[] args) {
        //System.out.println("Creando instancia de Empleado");
        Empleado empleado = new Empleado("Pedro", "Perez", "12345678",
                "Calle s/n Sevilla", 1500);

        //System.out.println("Creando instancia de Cliente");
        Cliente cliente = new Cliente("Juan", "Elias", "12345678",
                "Calle 3 Sevilla");

        //System.out.println("Creando instancia de Gerente");
        Gerente gerente = new Gerente("Miguel", "Grau", "12345678",
                "Calle 89 Sevilla", 1500, 2000);

        System.out.println("-------------Imprimiendo datos-----------------------");
        System.out.println(empleado);
        System.out.println(cliente);
        System.out.println(gerente);

        System.out.println();
        System.out.println("--------------modificando datos empleado----------------------");

        System.out.println("Aumento de remuneración al empleado : 10%, sueldo actual :"+empleado.getRemuneracion());
        empleado.aumentarRemuneracion(10);
        System.out.println("Remuneración actual : "+empleado.getRemuneracion());

        System.out.println("--------------modificando datos gerente----------------------");
        System.out.println("Presupuesto actual :"+gerente.getPresupuesto());
        gerente.setPresupuesto(5000);
        System.out.println("Presupuesto actualizado : "+gerente.getPresupuesto());

        System.out.println("-------------Imprimiendo datos-----------------------");
        System.out.println(empleado);
        System.out.println(cliente);
        System.out.println(gerente);

    }
}

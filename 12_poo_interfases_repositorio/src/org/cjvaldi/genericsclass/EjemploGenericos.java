package org.cjvaldi.genericsclass;

public class EjemploGenericos {

    public static <T> void imprimirCamion(Camion<T> camion) {
        for (T a : camion) {
            if (a instanceof Animal) { // para colocar la instancia correspondiente
                System.out.println("Caballo: " + ((Animal) a).getNombre() + " Tipo: " + ((Animal) a).getNombre());
            } else if (a instanceof Automovil) {
                System.out.println("Marca de auto : " + ((Automovil) a).getMarca());
            } else if (a instanceof Maquinaria) {
                System.out.println("Vehiculo : " + ((Maquinaria) a).getTipo());
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Camion<Animal> transporteCaballos = new Camion<>(5);
        transporteCaballos.add(new Animal("Peregrino", "Caballo"));
        transporteCaballos.add(new Animal("Brillo", "Caballo"));
        transporteCaballos.add(new Animal("Tunquen", "Caballo"));
        transporteCaballos.add(new Animal("Flecha veloz", "Caballo"));
        transporteCaballos.add(new Animal("Rayo", "Caballo"));

        imprimirCamion(transporteCaballos);

        Camion<Maquinaria> transMaquinas = new Camion<>(3);
        transMaquinas.add(new Maquinaria("Bulldozer"));
        transMaquinas.add(new Maquinaria("Grúa Horquilla"));
        transMaquinas.add(new Maquinaria("Perforadora"));

//        for(Maquinaria m: transMaquinas){
//            System.out.println("Tipo de maquina: "+m.getTipo());
//        }
        imprimirCamion(transMaquinas);

        Camion<Automovil> transporteAuto = new Camion<>(3);
        transporteAuto.add(new Automovil("Toyota"));
        transporteAuto.add(new Automovil("Mitsubishi"));
        transporteAuto.add(new Automovil("Chevrolet"));

//        for(Automovil a: transporteAuto){
//            System.out.println("Marca de auto : "+a.getMarca());
//        }
        imprimirCamion(transporteAuto);

    }
}

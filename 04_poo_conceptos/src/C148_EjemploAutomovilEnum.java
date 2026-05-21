public class C148_EjemploAutomovilEnum {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO,
                new Motor(2.0,TipoMotor.BENCINA), new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante : " + mazda.getFabricante());

        TipoAutomovil tipo = subaru.getTipo();
        System.out.println("tipo Subaru.getNombre() = " + tipo.getNombre());
        System.out.println("tipo Subaru.getDescripcion() = " + tipo.getDescripcion());

        tipo = mazda.getTipo();
        switch (tipo) {
            case CONVERTIBLE ->
                    System.out.println("E automovil es deportivo y descapotable de 2 puertas");
            case COUPE ->
                    System.out.println("Es un automovil pequeño de dos puertas y tipicamente deportivo");
            case FURGON ->
                    System.out.println("es un atomovil utilitario de transporte de empresas");
            case HATCHBACK ->
                    System.out.println("Es un automovil compacto");
            case PICKUP ->
                    System.out.println("Es un automovil de doble cabina o camioneta");
            case STATION_WAGON ->
                    System.out.println("Es un automovil de maleta grande ");
            case SEDAN ->
                    System.out.println("Es un automovil mediano");
        }

        TipoAutomovil[]  tipos = TipoAutomovil.values();
        for (TipoAutomovil ta : tipos) {
            System.out.print(ta + "=> "+ ta.name() + ","+
                    ta.getNombre() + ", "+
                    ta.getDescripcion()+ ", "+
                    ta.getNumeroPuerta());
            System.out.println();
        }
    }
}

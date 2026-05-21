public class C142_EjemploAutomovilRelacionesObjetos {
    public static void main(String[] args) {

        Persona conductorSubaru = new Persona("Luci", "Martinez");
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0, TipoMotor.BENCINA));
        subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);
        subaru.setConductor(conductorSubaru);
        //subaru.setRuedas(ruedasSub); // se crea método en vez de agregar manual en el for
        Rueda[] ruedasSub = new Rueda[5];
        for (int i = 0; i < ruedasSub.length; i++) {
            subaru.addRueda(new Rueda("Yokohama", 16, 7.5));
        }

        Persona conductorMazda = new Persona("Pato", "Jones");
        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO,
                new Motor(2.0, TipoMotor.DIESEL));
        mazda.setTipo(TipoAutomovil.PICKUP);
        mazda.setEstanque(new Estanque());
        mazda.setConductor(conductorMazda);
        /*
            mazda.setRuedas(ruedasMaz);
            Rueda[] ruedasMaz = {new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5),
                new Rueda("Michelin", 18, 10.5)
        };*/
        Rueda[] ruedasMaz = new Rueda[5];
        for (int i = 0; i < ruedasSub.length; i++) {
            mazda.addRueda(new Rueda("Michelin", 18, 10.5));
        }

//        Rueda[] ruedasNissan = new Rueda[5];
//        for (int i = 0; i < ruedasNissan.length; i++) {
//            ruedasNissan[i] = new Rueda("Michelin", 20, 10.5);
//        }
        Persona bea = new Persona("Bea", "Gonzalez");
        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(2.0, TipoMotor.BENCINA), new Estanque(45));
        nissan.setConductor(bea);
        nissan.setTipo(TipoAutomovil.PICKUP);
        // métodos encadenados
        nissan.addRueda(new Rueda("Michelin", 20, 10.5))
                .addRueda(new Rueda("Michelin", 20, 10.5))
                .addRueda(new Rueda("Michelin", 20, 10.5))
                .addRueda(new Rueda("Michelin", 20, 10.5))
                .addRueda(new Rueda("Michelin", 20, 10.5));

        Rueda[] ruedasNissan2 = new Rueda[5];
        for (int i = 0; i < ruedasNissan2.length; i++) {
            ruedasNissan2[i] =new Rueda("Pirelli", 20, 10.5);
        }
        Persona lalo = new Persona("Lalo", "Mendoza");
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(2.0, TipoMotor.BENCINA), new Estanque(50), lalo, ruedasNissan2);
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente(Color.AZUL);


        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());
        System.out.println(nissan2.verDetalle());


    }
}

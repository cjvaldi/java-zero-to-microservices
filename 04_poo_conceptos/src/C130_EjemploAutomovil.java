import java.util.Date;

public class C130_EjemploAutomovil {
    public static void main(String[] args) {

//        Motor motorSubaru = new Motor(2.0,TipoMotor.BENCINA);  // pasamos por variable
        Automovil subaru = new Automovil("Subaru","Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        //subaru.setEstanque(new Estanque());
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Motor motorMazda = new Motor(3.0,TipoMotor.DIESEL);

        Automovil mazda = new Automovil("Mazda", "BT-50",Color.ROJO,motorMazda);
        mazda.setEstanque(new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante : "+mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(4.5,TipoMotor.DIESEL),new Estanque(50));
        nissan.setTipo(TipoAutomovil.PICKUP);

        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(3.5, TipoMotor.BENCINA), new Estanque(50));
        nissan2.setColor(Color.AMARILLO);
        nissan2.setTipo(TipoAutomovil.PICKUP);
        Automovil.setColorPatente(Color.AZUL);

        Automovil auto = new Automovil();

        Date fecha = new Date();

        System.out.println("Son iguales ? "+(nissan == nissan2));
        System.out.println("Son iguales con equals ? "+(nissan.equals(nissan2)));
        System.out.println("Son iguales con equals auto null ? "+(auto.equals(nissan)));
        System.out.println("Son iguales con equals con fecha ? "+(auto.equals(fecha)));  // error no son mismo tipo , hay que condicionar la función

        System.out.println(nissan); // toString es explicito
        System.out.println(nissan.toString());  // ejemplo para sobreescribir toString

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());


        System.out.println(subaru.acelerar(3000));
        System.out.println(mazda.frenar());

        System.out.println(mazda.acelerarFrenar(4000));

        System.out.println("Kilómetros por litro : "+ subaru.calcularConsumo(300,0.60f));

        System.out.println("Kilómetros por litro : "+ subaru.calcularConsumo(300,60));
        System.out.println("Kilómetros por litro : "+ nissan.calcularConsumo(300,60));
    }
}

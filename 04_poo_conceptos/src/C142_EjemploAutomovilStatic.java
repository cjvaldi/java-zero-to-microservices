import jdk.swing.interop.SwingInterOpUtils;

import java.util.Date;

public class C142_EjemploAutomovilStatic {
    public static void main(String[] args) {

        Automovil.setCapacidadEstanqueEstatico(45);
        Automovil subaru = new Automovil("Subaru", "Impreza");
        subaru.setMotor(new Motor(2.0,TipoMotor.BENCINA));
        subaru.setColor(Color.BLANCO);
        subaru.setTipo(TipoAutomovil.HATCHBACK);

        Automovil mazda = new Automovil("Mazda", "BT-50", Color.ROJO,
                new Motor(2.0,TipoMotor.BENCINA), new Estanque(45));
        mazda.setTipo(TipoAutomovil.PICKUP);
        System.out.println("mazda.fabricante : " + mazda.getFabricante());

        Automovil nissan = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(2.0,TipoMotor.BENCINA), new Estanque(45));
        nissan.setTipo(TipoAutomovil.PICKUP);
        //Automovil nissan2 = new Automovil("Nissan", "Navara", Automovil.COLOR_GRIS, 3.5, 50);
        Automovil nissan2 = new Automovil("Nissan", "Navara", Color.GRIS,
                new Motor(2.0,TipoMotor.BENCINA), new Estanque(45));
        nissan2.setTipo(TipoAutomovil.PICKUP);

        nissan2.setColor(Color.AZUL);
        Automovil.setColorPatente(Color.AZUL);

        Automovil auto = new Automovil();

        System.out.println(subaru.verDetalle());
        System.out.println(mazda.verDetalle());
        System.out.println(nissan.verDetalle());

        System.out.println(nissan2.verDetalle());
        //System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente().getColor());
        // se ha sobrescrito toString de Color
        System.out.println("Automovil.getColorPatente() = " + Automovil.getColorPatente());
        System.out.println("Km por litros = " + Automovil.calcularConsumoEstatico(300,60));

        System.out.println("Velocidad máxima en carretera : " + Automovil.VELOCIDAD_MAX_CARRETERA);
        System.out.println("Velocidad máxima en ciudad : " + Automovil.VELOCIDAD_MAX_CIUDAD);

        TipoAutomovil tipoSubaru = subaru.getTipo();
        System.out.println("tipo Subaru.getNombre() = " + tipoSubaru.getNombre());
        System.out.println("tipo Subaru.getDescripcion() = " + tipoSubaru.getDescripcion());
    }
}

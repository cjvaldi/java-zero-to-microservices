package tarea22;

public class EjemploMamiferos {
    public static void main(String[] args) {
        // Creamos el arreglo apuntando a la clase más genérica (Mamífero)
        Mamifero[] mamiferos = new Mamifero[6];

        // Instanciamos los objetos con datos de prueba realistas
        mamiferos[0] = new Leon("Sabana Africana", 1.2, 2.1, 190.0, "Panthera leo", 8.5, 80, 12, 115.5);
        mamiferos[1] = new Tigre("Bosques de Siberia", 1.1, 2.8, 220.0, "Panthera tigris altaica", 9.0, 65, "Siberiano");
        mamiferos[2] = new Guepardo("Llanuras del Serengueti", 0.9, 1.4, 54.0, "Acinonyx jubatus", 4.5, 115);
        mamiferos[3] = new Lobo("Bosques Alpinos", 0.8, 1.5, 45.0, "Canis lupus", "Gris Cenizo", 3.8, 5, "Lobo Europeo");
        mamiferos[4] = new PerroSalvajeAfricano("Sabana Subsahariana", 0.75, 1.0, 28.0, "Lycaon pictus", "Tricolor Manchado", 2.5, 310);
        mamiferos[5] = new Leon("Parque Kruger", 1.15, 2.0, 180.0, "Panthera leo", 8.0, 75, 8, 110.0); // Segundo león de ejemplo

        // Recorremos el arreglo de manera polimórfica
        System.out.println("====== ADMINISTRACIÓN DE MAMÍFEROS DEL ZOOLÓGICO ======\n");

        for (Mamifero animal : mamiferos) {
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Clase Concreta : " + animal.getClass().getSimpleName());
            System.out.println("Nombre Científico: " + animal.getNombreCientifico());
            System.out.println("Hábitat          : " + animal.getHabitat());
            System.out.println("Dimensiones      : Alto: " + animal.getAltura() + "m | Largo: " + animal.getLargo() + "m | Peso: " + animal.getPeso() + "kg");

            // Evaluamos de qué tipo específico es para poder extraer sus atributos únicos mediante herencia
            if (animal instanceof Felino) {
                Felino f = (Felino) animal;
                System.out.println("Detalles Felino  : Tamaño Garras: " + f.getTamanoGarras() + "cm | Vel. Máxima: " + f.getVelocidad() + " km/h");
            } else if (animal instanceof Canino) {
                Canino c = (Canino) animal;
                System.out.println("Detalles Canino  : Color: " + c.getColor() + " | Tamaño Colmillos: " + c.getTamanoColmillo() + "cm");
            }

            System.out.println("\n--- Comportamiento Activo ---");
            System.out.println("Comer      : " + animal.comer());
            System.out.println("Dormir     : " + animal.dormir());
            System.out.println("Correr     : " + animal.correr());
            System.out.println("Comunicar  : " + animal.comunicarse());
            System.out.println();
        }
    }
}

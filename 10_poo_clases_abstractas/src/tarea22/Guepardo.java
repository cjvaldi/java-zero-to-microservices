package tarea22;

public class Guepardo extends Felino{

    public Guepardo(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
    }

    @Override
    public String comer() { return "El Guepardo devora rápidamente su presa para evitar que otros depredadores de " + habitat + " se la roben."; }
    @Override
    public String dormir() { return "El Guepardo descansa sobre una rama alta observando el horizonte."; }
    @Override
    public String correr() { return "¡El Guepardo explota en velocidad! Alcanza los " + velocidad + " km/h en segundos gracias a sus garras semi-retráctiles."; }
    @Override
    public String comunicarse() { return "El Guepardo emite un sonido similar a un gorjeo de ave para comunicarse."; }
}

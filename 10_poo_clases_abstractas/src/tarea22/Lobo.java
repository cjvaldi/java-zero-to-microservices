package tarea22;

public class Lobo extends Canino{

    private int numeroCamada;
    private String especieLobo;

    public Lobo(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanoColmillo, int numeroCamada, String especieLobo) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillo);
        this.numeroCamada = numeroCamada;
        this.especieLobo = especieLobo;
    }

    @Override
    public String comer() { return "El Lobo de la especie " + especieLobo + " comparte la comida con su camada de " + numeroCamada + " cachorros."; }
    @Override
    public String dormir() { return "El Lobo de color " + color + " duerme en las cavernas de " + habitat + "."; }
    @Override
    public String correr() { return "El Lobo corre incansablemente por el terreno de " + habitat + " persiguiendo rastros."; }
    @Override
    public String comunicarse() { return "El Lobo " + color + " aúlla de noche mostrando sus colmillos de " + tamanoColmillo + " cm."; }
}

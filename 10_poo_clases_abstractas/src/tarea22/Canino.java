package tarea22;

abstract public class Canino extends Mamifero{
    protected String color;
    protected double tamanoColmillo;

    public Canino(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanoColmillo) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillo = tamanoColmillo;
    }

    public String getColor() {
        return color;
    }

    public double getTamanoColmillo() {
        return tamanoColmillo;
    }

}

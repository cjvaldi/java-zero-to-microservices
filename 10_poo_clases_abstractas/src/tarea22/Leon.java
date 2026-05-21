package tarea22;

public class Leon extends Felino {
    private int numManada;
    private double potencialRugidoDecibel;

    public Leon(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad, int numManada, double potencialRugidoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potencialRugidoDecibel = potencialRugidoDecibel;
    }

    public int getNumManada() {
        return numManada;
    }

    public double getPotencialRugidoDecibel() {
        return potencialRugidoDecibel;
    }

    @Override
    public String comer() {
        return "El León (" + nombreCientifico + ") caza junto a su manada de " + numManada + " individuos en el hábitat de " + habitat + ".";
    }

    @Override
    public String dormir() {
        return "El León duerme plácidamente tras una jornada de caza protegiendo a su grupo.";
    }

    @Override
    public String correr() {
        return "El León corre a una velocidad de " + velocidad + " km/h usando sus garras de " + tamanoGarras + " cm.";
    }

    @Override
    public String comunicarse() {
        return "El León ruge con una potencia imponente de " + potencialRugidoDecibel + " decibeles.";
    }

}

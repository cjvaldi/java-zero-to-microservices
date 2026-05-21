package tarea22;

public class Tigre extends Felino{

    private String especie;

    public Tigre(String habitat, double altura, double largo, double peso, String nombreCientifico, double tamanoGarras, int velocidad, String especie) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    @Override
    public String comer() { return "El Tigre de Bengala (" + especie + ") acecha en solitario a su presa en " + habitat + "."; }
    @Override
    public String dormir() { return "El Tigre duerme camuflado entre la densa vegetación."; }
    @Override
    public String correr() { return "El Tigre " + especie + " corre sigilosamente alcanzando los " + velocidad + " km/h."; }
    @Override
    public String comunicarse() { return "El Tigre emite un siseo y gruñido para advertir su presencia en el territorio."; }
}

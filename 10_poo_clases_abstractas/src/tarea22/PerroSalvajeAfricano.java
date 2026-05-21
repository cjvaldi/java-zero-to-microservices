package tarea22;

public class PerroSalvajeAfricano extends Canino {

    private int fuerzaMordida;

    public PerroSalvajeAfricano(String habitat, double altura, double largo, double peso, String nombreCientifico, String color, double tamanoColmillo, int fuerzaMordida) {
        super(habitat, altura, largo, peso, nombreCientifico, color, tamanoColmillo);
        this.fuerzaMordida = fuerzaMordida;
    }

    public int getFuerzaMordida() {
        return fuerzaMordida;
    }

    @Override
    public String comer() {
        return "El Perro Salvaje Africano caza en equipo de manera ultra eficiente en " + habitat + ".";
    }

    @Override
    public String dormir() {
        return "El Perro Salvaje duerme agrupado junto a sus compañeros para mantener el calor.";
    }

    @Override
    public String correr() {
        return "El astuto canino de pelaje " + color + " corre a un ritmo constante para agotar a sus presas.";
    }

    @Override
    public String comunicarse() {
        return "El Licaón emite chillidos alegres e intensos, ejerciendo una presión de mordida de " + fuerzaMordida + " PSI si es necesario.";
    }
}

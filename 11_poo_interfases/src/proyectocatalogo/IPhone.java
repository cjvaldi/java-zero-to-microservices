package proyectocatalogo;

public class IPhone extends Electronico{
    private String modelo;
    private String color;

    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    @Override
    public double getPrecioVenta() {
        // Ejemplo: Al iPhone se le aplica un impuesto del 12%
        return this.precio * 1.12;
    }
}

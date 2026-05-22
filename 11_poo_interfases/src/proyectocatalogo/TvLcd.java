package proyectocatalogo;

public class TvLcd extends Electronico{
    private int pulgada;

    public TvLcd(int precio, String fabricante, int pulgada) {
        super(precio, fabricante);
        this.pulgada = pulgada;
    }

    public int getPulgada() {
        return pulgada;
    }

    @Override
    public double getPrecioVenta() {
        // Ejemplo: La TV tiene un precio de venta fijo o con descuento menor
        return this.precio * 1.05;
    }

}

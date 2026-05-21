import java.util.Date;

public class OrdenCompra {
    private int id;
    private String descripcion;
    private Date fecha;
    private Cliente cliente;
    private Producto[] productos;

    private int indiceProductos;
    private static int ultimoId;

    public OrdenCompra() {
        this.id = ++ultimoId;
        this.productos = new Producto[4];
        this.fecha = new Date();
    }

    public OrdenCompra(String descripcion) {
        this();
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Producto[] getProductos() {
        return productos;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    //public OrdenCompra addProducto(Producto producto) {
    public OrdenCompra addProducto(Producto producto) {
        if (indiceProductos < this.productos.length) {
            this.productos[indiceProductos++] = producto;
        }
        return this;
    }

    public int granTotal(Producto[] producto) {
        int totalProducto = 0;
        for (Producto p : productos) {
            totalProducto += p.getPrecio();
        }
        return totalProducto;
    }

    @Override
    public String toString() {
        String detalle = " Orden de Compra N = " + this.id +
                "\nDescripción = " + this.descripcion + '\'' +
                "\nFecha       = " + this.fecha +
//                "\nCliente     = " + this.cliente.getNombre() + " " + this.cliente.getApellido();
                "\nCliente     = " + this.cliente;  // aplicando el override de cliente
        if (this.productos != null) {
            detalle += "\nDetalle de productos = ";
            for (Producto p : this.getProductos()) {
                detalle += "\n   " + p.getFabricante() + "  " + p.getNombre() + "  " + p.getPrecio();
            }
            detalle += "\nGran Total      =    " + granTotal(this.productos)+"\n";
        }
        return detalle;
    }
}

package proyectocatalogo;

import java.util.Date;

public class Libro extends Producto implements ILibro {
    protected Date fechaPublicacion;  //   private Date fechaPublicacion = new DAte(); y //
    protected String autor;     //private todo los demas
    protected String titulo;
    protected String editorial;

    public Libro(int precio, Date fechaPublicacion, String autor, String titulo, String editorial) {
        super(precio);
        this.fechaPublicacion = fechaPublicacion;
        this.autor = autor;
        this.titulo = titulo;
        this.editorial = editorial;
    }

    @Override
    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    @Override
    public String getAutor() {
        return autor;
    }

    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getEditorial() {
        return editorial;
    }

    @Override
    public double getPrecioVenta() {
        // Ejemplo: Los libros tienen un 5% de descuento sobre el precio base
        return this.precio * 0.95;
    }
}

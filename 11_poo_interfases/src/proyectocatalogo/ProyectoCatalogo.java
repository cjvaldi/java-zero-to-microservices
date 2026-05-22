package proyectocatalogo;

import java.util.Date;

public class ProyectoCatalogo {
    public static void main(String[] args) {

        // Creamos el array del tipo más genérico posible (la interfaz raíz)
        IProducto[] productos = new IProducto[5];

        // Inicializamos las instancias con datos de ejemplo
        productos[0] = new IPhone(900000, "Apple", "Negro Espacial", "iPhone 15 Pro");
        productos[1] = new TvLcd(340000, "Sony", 40);
        productos[2] = new Libro(18000, new Date(), "Erich Gamma", "Elementos reusables POO", "Mit Press");
        productos[3] = new Libro(14000, new Date(), "Martin Fowler", "UML Gota a Gota", "Pearson");
        productos[4] = new Comics(8500, new Date(), "Stan Lee", "The Amazing Spider-Man", "Marvel", "Peter Parker");

        // Recorremos el catálogo usando Polimorfismo pura y dura
        for (IProducto prod : productos) {
            System.out.println("==================================================");
            System.out.println("Tipo de Producto: " + prod.getClass().getSimpleName());
            System.out.println("Precio Base: €" + prod.getPrecio());
            System.out.println("Precio Venta: €" + prod.getPrecioVenta());

            // Usamos 'instanceof' para extraer los datos específicos de cada jerarquía
            if (prod instanceof IElectronico) {
                System.out.println("Fabricante: " + ((IElectronico) prod).getFabricante());
                if (prod instanceof IPhone) {
                    System.out.println("Modelo: " + ((IPhone) prod).getModelo());
                    System.out.println("Color: " + ((IPhone) prod).getColor());
                } else if (prod instanceof TvLcd) {
                    System.out.println("Pulgadas: " + ((TvLcd) prod).getPulgada() + "\"");
                }
            } else if (prod instanceof ILibro) {
                System.out.println("Título: " + ((ILibro) prod).getTitulo());
                System.out.println("Autor: " + ((ILibro) prod).getAutor());
                System.out.println("Editorial: " + ((ILibro) prod).getEditorial());
                System.out.println("Fecha Pub: " + ((ILibro) prod).getFechaPublicacion());

                if (prod instanceof Comics) {
                    System.out.println("Personaje Principal: " + ((Comics) prod).getPersonaje());
                }
            }
        }
        System.out.println("==================================================");
    }
}
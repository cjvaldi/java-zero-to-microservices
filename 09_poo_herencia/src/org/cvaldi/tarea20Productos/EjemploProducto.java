package org.cvaldi.tarea20Productos;

public class EjemploProducto {
    public static void main(String[] args) {
        Producto[] productos = new Producto[8];
        productos[0]=new Fruta("Manzana",1.50,0.25,"rojo");
        productos[1]= new Fruta("Platano", 1.20,0.50,"Amarillo");

        productos[2]= new Limpieza("Detergente",3.75,"Jabon liquido",2.0);
        productos[3]= new Limpieza("Legia",2.50,"Legia neutra",4);

        productos[4]= new Lacteo("Leche",1.80,1,8);
        productos[5]= new Lacteo("Yogourt",2.5,6,5);

        productos[6]= new NoPerecible("Arroz",1.40,1000,360);
        productos[7]= new NoPerecible("Azucar",2,500,1000);

        for (Producto producto : productos ) {
            System.out.println("--------------");
            System.out.println(producto.mostrarDetalle());

        }

        /* solución de profesor */
        for (Producto prod : productos) {
            System.out.println("-------------------------------- " + prod.getClass().getSimpleName() + "---------------------------------");
            System.out.println("Nombre: " + prod.getNombre());
            System.out.println("Precio: " + prod.getPrecio());

            if (prod instanceof Fruta) {
                System.out.println("Peso (gr): " + ((Fruta) prod).getPeso());
                System.out.println("Color: " + ((Fruta) prod).getColor());
            } else if (prod instanceof Limpieza) {
                System.out.println("Componentes: " + ((Limpieza) prod).getComponentes());
                System.out.println("Litros: " + ((Limpieza) prod).getLitros());
            } else if (prod instanceof Lacteo) {
                System.out.println("Cantidad (gr/cc): " + ((Lacteo) prod).getCantidad());
                System.out.println("Proteinas (gr): " + ((Lacteo) prod).getProteinas());
            } else if (prod instanceof NoPerecible) {
                System.out.println("Calorias (kCal): " + ((NoPerecible) prod).getCalorias());
                System.out.println("Contenido neto (gr): " + ((NoPerecible) prod).getContenido());
            }
        }

    }
}

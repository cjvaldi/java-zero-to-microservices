import java.util.Scanner;
//Tarea 2 : Detalle de Factura.

public class C24_Tarea_DetalleDeFactura {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Factura:");
        System.out.println("Ingrese Nombre del Producto");
        String nomCliente= teclado.nextLine();

        System.out.println("ingrese precios del producto1");
        double precioProducto1=teclado.nextDouble();

        System.out.println("ingrese precios del producto2");
        double precioProducto2=teclado.nextDouble();

        double total =(precioProducto1+precioProducto2);
        double impuesto = 19; //%

        System.out.println("La factura tiene un total bruto de "+Double.valueOf(total)+
                " con un impuesto de "+Double.valueOf(total*impuesto /100)+" siendo el monto total : "
                + Double.valueOf(total+(total*impuesto / 100)));


    }
}

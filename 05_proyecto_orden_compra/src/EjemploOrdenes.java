import java.util.Date;

public class EjemploOrdenes {
    public static void main(String[] args) {

        OrdenCompra oc1 = new OrdenCompra("Orden de compra 1");
        oc1.setCliente(new Cliente("Juan", "Perez"));
        oc1.setFecha(new Date());
        oc1.addProducto(new Producto("EmpresaA", "prodA1", 10))
                .addProducto(new Producto("EmpresaA", "prodA2", 10))
                .addProducto(new Producto("EmpresaA", "prodA3", 10))
                .addProducto(new Producto("EmpresaA", "prodA4", 10));

        OrdenCompra oc2 = new OrdenCompra("Orden de compra 2");
        oc2.setCliente(new Cliente("Antonio", "Ramos"));
        oc2.setFecha(new Date());
        oc2.addProducto(new Producto("EmpresaB", "prodA1", 20))
                    .addProducto(new Producto("EmpresaB", "prodA2", 20))
                .addProducto(new Producto("EmpresaB", "prodA3", 20))
                .addProducto(new Producto("EmpresaB", "prodA4", 20));

        OrdenCompra oc3 = new OrdenCompra("Orden de compra 3");
        oc3.setCliente(new Cliente("Jorge", "Sotil"));
        oc3.setFecha(new Date());
        oc3.addProducto(new Producto("EmpresaC", "prodA1", 30))
                .addProducto(new Producto("EmpresaC", "prodA2", 30))
                .addProducto(new Producto("EmpresaC", "prodA3", 30))
                .addProducto(new Producto("EmpresaC", "prodA4", 30));

        System.out.println("Detalle = " + oc1);
        System.out.println("Detalle = " + oc2);
        System.out.println("Detalle = " + oc3);


        /*
        desarrollo del profesor //  yo lo gestione con le override

         OrdenCompra[] ordenes = {orden1, orden2, orden3};

        for (OrdenCompra orden : ordenes) {
            System.out.println("Folio: " + orden.getIdentificador());
            System.out.println("Cliente: " + orden.getCliente());
            System.out.println("Descripcion: " + orden.getDescripcion());
            System.out.println("Fecha: " + orden.getFecha());
            System.out.println("Total: " + orden.getGranTotal());

            int i = 1;
            for (Producto p : orden.getProductos()) {
                System.out.println("Producto " + i + ": " + p.getNombre() + " " + p.getFabricante() + " precio $" + p.getPrecio());
                i++;
            }
            System.out.println("---------------------------------- siguiente --------------------------------------");

         */

    }
}

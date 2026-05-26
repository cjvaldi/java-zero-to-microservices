package org.cjvaldi.supermercado;

import org.cjvaldi.supermercado.modelo.*;

public class MainSupermercado {
    public static void main(String[] args) {

        // 1. Bolsa de Lácteos
        BolsaSupermercado<Lacteo> bolsaLacteos = new BolsaSupermercado<>();
        bolsaLacteos.addProducto(new Lacteo("Leche Entera", 1.20, 1, 3));
        bolsaLacteos.addProducto(new Lacteo("Yogurt Griego", 2.50, 4, 10));
        bolsaLacteos.addProducto(new Lacteo("Queso Gouda", 4.80, 1, 25));
        bolsaLacteos.addProducto(new Lacteo("Mantequilla", 1.90, 1, 1));
        bolsaLacteos.addProducto(new Lacteo("Crema de Leche", 1.50, 2, 2));

        // 2. Bolsa de Frutas
        BolsaSupermercado<Fruta> bolsaFrutas = new BolsaSupermercado<>();
        bolsaFrutas.addProducto(new Fruta("Manzana Roja", 2.30, 1.5, "Rojo"));
        bolsaFrutas.addProducto(new Fruta("Plátano", 1.80, 1.2, "Amarillo"));
        bolsaFrutas.addProducto(new Fruta("Sandía", 4.50, 5.0, "Verde"));
        bolsaFrutas.addProducto(new Fruta("Uva Verde", 3.20, 0.8, "Verde"));
        bolsaFrutas.addProducto(new Fruta("Naranja", 2.00, 2.0, "Naranja"));

        // 3. Bolsa de Limpieza
        BolsaSupermercado<Limpieza> bolsaLimpieza = new BolsaSupermercado<>();
        bolsaLimpieza.addProducto(new Limpieza("Detergente Líquido", 8.50, "Tensioactivos, Enzimas", 3.0));
        bolsaLimpieza.addProducto(new Limpieza("Limpia Vidrios", 2.10, "Alcohol, Amoníaco", 0.75));
        bolsaLimpieza.addProducto(new Limpieza("Desinfectante", 3.40, "Cloro, Agua", 2.0));
        bolsaLimpieza.addProducto(new Limpieza("Lavavajillas", 1.95, "Jabón concentrado", 1.0));
        bolsaLimpieza.addProducto(new Limpieza("Suavizante", 4.20, "Fragancias", 1.5));

        // 4. Bolsa de No Perecibles
        BolsaSupermercado<NoPerecible> bolsaNoPerecibles = new BolsaSupermercado<>();
        bolsaNoPerecibles.addProducto(new NoPerecible("Arroz Integral", 1.50, 1000, 350));
        bolsaNoPerecibles.addProducto(new NoPerecible("Fideos Tallarín", 1.10, 500, 280));
        bolsaNoPerecibles.addProducto(new NoPerecible("Atún en Lata", 1.85, 160, 120));
        bolsaNoPerecibles.addProducto(new NoPerecible("Lentejas", 2.10, 1000, 310));
        bolsaNoPerecibles.addProducto(new NoPerecible("Harina de Trigo", 0.95, 1000, 340));

        // --- IMPRESIÓN DE DETALLES (Sin castings ni toString) ---

        System.out.println("================= DETALLE BOLSA LÁCTEOS =================");
        for (Lacteo l : bolsaLacteos.getProductos()) {
            System.out.println("Nombre: " + l.getNombre() + " | Precio: $" + l.getPrecio() +
                    " | Cantidad: " + l.getCantidad() + " u | Proteínas: " + l.getProteinas() + "g");
        }

        System.out.println("\n================= DETALLE BOLSA FRUTAS =================");
        for (Fruta f : bolsaFrutas.getProductos()) {
            System.out.println("Nombre: " + f.getNombre() + " | Precio: $" + f.getPrecio() +
                    " | Peso: " + f.getPeso() + "kg | Color: " + f.getColor());
        }

        System.out.println("\n================= DETALLE BOLSA LIMPIEZA =================");
        for (Limpieza lim : bolsaLimpieza.getProductos()) {
            System.out.println("Nombre: " + lim.getNombre() + " | Precio: $" + lim.getPrecio() +
                    " | Litros: " + lim.getLitros() + "L | Componentes: " + lim.getComponentes());
        }

        System.out.println("\n================= DETALLE BOLSA NO PERECIBLES =================");
        for (NoPerecible np : bolsaNoPerecibles.getProductos()) {
            System.out.println("Nombre: " + np.getNombre() + " | Precio: $" + np.getPrecio() +
                    " | Contenido: " + np.getContenido() + "g | Calorías: " + np.getCalorias() + "kcal");
        }
    }
}
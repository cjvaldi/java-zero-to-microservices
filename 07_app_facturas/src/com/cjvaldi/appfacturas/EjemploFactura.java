package com.cjvaldi.appfacturas;

import com.cjvaldi.appfacturas.modelo.*;  //   * para no tener que poner todas las clases
//import com.cjvaldi.appfacturas.modelo.Cliente;
//import com.cjvaldi.appfacturas.modelo.Factura;
//import com.cjvaldi.appfacturas.modelo.ItemFactura;
//import com.cjvaldi.appfacturas.modelo.Producto;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EjemploFactura {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNif("5555-55");
        cliente.setNombre("Cristian");

        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese una descripción de la factura = " );
        Factura factura = new Factura(s.nextLine(), cliente);

        Producto producto;
//        String nombre;
//        float precio;
//        int cantidad;   / optimizando

        System.out.println();

        for (int i = 0; i < 2; i++) {
            producto =  new Producto();
            System.out.print("Ingrese producto nª = " + producto.getCodigo() + ": ");
            //nombre =  s.nextLine();
//            producto.setNombre(nombre);
            producto.setNombre(s.nextLine());

            System.out.print("Ingrese el precio = ");
            //precio = s.nextFloat();
            producto.setPrecio(s.nextFloat());

            System.out.print("Ingrese la cantidad =");
//            cantidad = s.nextInt();
           // ItemFactura item =  new ItemFactura(cantidad,producto);
            //factura.addItemFactura(item);
            factura.addItemFactura(new ItemFactura(s.nextInt(),producto));

            System.out.println();
            s.nextLine();
        }
        System.out.println(factura.generarDetalle());
    }
}

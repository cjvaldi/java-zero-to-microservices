package org.cjvaldi.ejemplos.tarea25Encuentratuvuelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class EncuentraTuVuelo {
    public static void main(String[] args) {
        // 1. Cambiamos el formato de lectura para que use números y meses (evitando el texto "Lun" erróneo del Excel)
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy HH:mm", new Locale("es", "ES"));
        List<Vuelo> vuelos = new ArrayList<>();

        try {
            // Los 20 vuelos del Excel mapeados con sus datos reales y precisos
            vuelos.add(new Vuelo("AAL 933", "New York", "Santiago", sdf.parse("29 Agosto 2021 05:39"), 62));
            vuelos.add(new Vuelo("LAT 755", "Sao Paulo", "Santiago", sdf.parse("31 Agosto 2021 04:45"), 47));
            vuelos.add(new Vuelo("SKU 621", "Rio De Janeiro", "Santiago", sdf.parse("30 Agosto 2021 16:00"), 52));
            vuelos.add(new Vuelo("DAL 147", "Atlanta", "Santiago", sdf.parse("29 Agosto 2021 13:22"), 59));
            vuelos.add(new Vuelo("AVA 241", "Bogota", "Santiago", sdf.parse("31 Agosto 2021 14:05"), 25));
            vuelos.add(new Vuelo("AMX 10", "Mexico City", "Santiago", sdf.parse("31 Agosto 2021 05:20"), 29));
            vuelos.add(new Vuelo("IBE 6833", "Londres", "Santiago", sdf.parse("30 Agosto 2021 08:45"), 55));
            vuelos.add(new Vuelo("LAT 2479", "Frankfurt", "Santiago", sdf.parse("29 Agosto 2021 07:41"), 51));
            vuelos.add(new Vuelo("SKU 803", "Lima", "Santiago", sdf.parse("30 Agosto 2021 10:35"), 48));
            vuelos.add(new Vuelo("LAT 533", "Los Ángeles", "Santiago", sdf.parse("29 Agosto 2021 09:14"), 59));
            vuelos.add(new Vuelo("LAT 1447", "Guayaquil", "Santiago", sdf.parse("31 Agosto 2021 08:33"), 31));
            vuelos.add(new Vuelo("CMP 111", "Panama City", "Santiago", sdf.parse("31 Agosto 2021 15:15"), 29));
            vuelos.add(new Vuelo("LAT 705", "Madrid", "Santiago", sdf.parse("30 Agosto 2021 08:14"), 47));
            vuelos.add(new Vuelo("AAL 957", "Miami", "Santiago", sdf.parse("29 Agosto 2021 22:53"), 60));
            vuelos.add(new Vuelo("ARG 5091", "Buenos Aires", "Santiago", sdf.parse("31 Agosto 2021 09:57"), 32));
            vuelos.add(new Vuelo("LAT 1283", "Cancún", "Santiago", sdf.parse("31 Agosto 2021 04:00"), 35));
            vuelos.add(new Vuelo("LAT 579", "Barcelona", "Santiago", sdf.parse("29 Agosto 2021 07:45"), 61));
            vuelos.add(new Vuelo("AAL 945", "Dallas-Fort Worth", "Santiago", sdf.parse("30 Agosto 2021 07:12"), 58));
            vuelos.add(new Vuelo("LAT 501", "París", "Santiago", sdf.parse("29 Agosto 2021 18:29"), 49));
            vuelos.add(new Vuelo("LAT 405", "Montevideo", "Santiago", sdf.parse("30 Agosto 2021 15:45"), 39));            // 1. Ordenar por fecha de llegada de forma ascendente
            List<Vuelo> ordenadosPorLlegada = new ArrayList<>(vuelos);
            ordenadosPorLlegada.sort(Comparator.comparing(Vuelo::getFechaLlegada));

            System.out.println("--- Listado ordenado por fecha de llegada ascendente ---");
            ordenadosPorLlegada.forEach(System.out::println);
            System.out.println();

            // 2. Obtener el último vuelo en llegar (el último de la lista ordenada)
            Vuelo ultimoVuelo = ordenadosPorLlegada.get(ordenadosPorLlegada.size() - 1);
            System.out.println("El último vuelo en llegar es " + ultimoVuelo.getNombre() +
                    ": " + ultimoVuelo.getOrigen() + ", aterriza el " + ultimoVuelo.getFechaLlegada());

            // 3. Obtener el vuelo con menor número de pasajeros usando Streams
            Vuelo menorPasajeros = vuelos.stream()
                    .min(Comparator.comparingInt(Vuelo::getPasajeros))
                    .orElseThrow();

            System.out.println("El vuelo con menor número de pasajeros es " + menorPasajeros.getNombre() +
                    ": " + menorPasajeros.getOrigen() + ", con " + menorPasajeros.getPasajeros() + " pasajeros.");

        } catch (ParseException e) {
            System.err.println("Error al procesar el formato de fecha: " + e.getMessage());
        }
    }
}
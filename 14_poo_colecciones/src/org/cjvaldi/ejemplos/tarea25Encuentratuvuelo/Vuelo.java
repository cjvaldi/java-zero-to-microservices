package org.cjvaldi.ejemplos.tarea25Encuentratuvuelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Vuelo {
    private String nombre;
    private String origen;
    private String destino;
    private Date fechaLlegada;
    private int pasajeros;

    // Formateador interno para asegurar que al imprimir el vuelo, la fecha salga en español
    // "EEEE" es para el día completo (Lunes), "MMMM" para el mes completo (Agosto)
    private static final SimpleDateFormat escritorSdf =
            new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy HH:mm", new Locale("es", "ES"));

    public Vuelo(String nombre, String origen, String destino, Date fechaLlegada, int pasajeros) {
        this.nombre = nombre;
        this.origen = origen;
        this.destino = destino;
        this.fechaLlegada = fechaLlegada;
        this.pasajeros = pasajeros;
    }

    public String getNombre() { return nombre; }
    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
    public Date getFechaLlegada() { return fechaLlegada; }
    public int getPasajeros() { return pasajeros; }

    @Override
    public String toString() {
        // Usamos escritorSdf.format(fechaLlegada) para forzar el idioma español
        return String.format("%-8s | %-15s | %-12s | %s | %3d pasajeros",
                nombre, origen, destino, escritorSdf.format(fechaLlegada), pasajeros);
    }
}
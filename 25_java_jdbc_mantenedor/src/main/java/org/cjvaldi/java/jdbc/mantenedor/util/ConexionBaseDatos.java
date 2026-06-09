package org.cjvaldi.java.jdbc.mantenedor.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBaseDatos {
    private static final String URL = "jdbc:mysql://localhost:3306/java_curso?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PASSWORD ="";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

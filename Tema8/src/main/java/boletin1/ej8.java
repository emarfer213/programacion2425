package boletin1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ej8 {
    public static void main(String[] args) {
        String cadenaConexion = "jdbc:mysql://127.0.0.1:3306/classicmodels?serverTimezone=UTC";
        try (Connection c = DriverManager.getConnection(cadenaConexion, "root", "root")) {
            PreparedStatement consulta = c.prepareStatement("delete from productlines " +
                    "where productline like 'Random%'");

            for (int i = 0; i < 10000; i++) {
                consulta.executeUpdate();
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

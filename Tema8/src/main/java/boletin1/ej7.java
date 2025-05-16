package boletin1;

import java.io.IOException;
import java.sql.*;

public class ej7 {
    public static void main(String[] args) {
        //rowInsertStatement();
        //rowInsertPreparedStatement();
    }

    public static void rowInsertStatement(){
        String cadenaConexion = "jdbc:mysql://127.0.0.1:3306/classicmodels?serverTimezone=UTC";
        try (Connection c = DriverManager.getConnection(cadenaConexion, "root", "root")){
            Statement stmt = c.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
            long inicio = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                stmt.executeUpdate("insert into productLines (productLine) values ('Random " + i + "')");
            }
            long tiempoFinal = System.currentTimeMillis();
            System.out.println(tiempoFinal - inicio);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void rowInsertPreparedStatement(){
        String cadenaConexion = "jdbc:mysql://127.0.0.1:3306/classicmodels?serverTimezone=UTC";
        try (Connection c = DriverManager.getConnection(cadenaConexion, "root", "root")){
            PreparedStatement stmt = c.prepareStatement("insert into productLines (productLine) values (?)");
            long inicio = System.currentTimeMillis();
            for (int i = 0; i < 10000; i++) {
                stmt.setString(1, "Random" + i);
                stmt.executeUpdate();
            }
            long tiempoFinal = System.currentTimeMillis();
            System.out.println(tiempoFinal - inicio);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

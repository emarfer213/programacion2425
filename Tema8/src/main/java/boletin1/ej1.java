package boletin1;

import java.sql.*;

public class ej1 {
    public static void main(String[] args) {
        String cadenaConexion = "jdbc:mysql://127.0.0.1:3306/classicmodels?serverTimezone=UTC";

        try(Connection c = DriverManager.getConnection(cadenaConexion, "root", "root")){
            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("Select * from productlines");

            while (rs.next()){
                System.out.println(rs.getString("productLine"));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}

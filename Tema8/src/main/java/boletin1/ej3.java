package boletin1;

import java.sql.*;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        String cadenaConexion = "jdbc:mysql://127.0.0.1:3306/classicmodels?serverTimezone=UTC";

        try (Connection c = DriverManager.getConnection(cadenaConexion, "root", "root")) {
            Scanner sc = new Scanner(System.in);
            System.out.println("introduce el precio");
            Double precio = sc.nextDouble();
            System.out.println("introduce la letra");
            String letra = sc.next();

            PreparedStatement consulta = c.prepareStatement("Select productName, buyPrice from products where buyPrice < ? and productName like ? ");
            consulta.setDouble(1,precio);
            consulta.setString(2,letra + "%");
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()){
                System.out.println(resultado.getString("productName")+ ": " + resultado.getDouble("buyPrice")+"€");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

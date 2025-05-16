package boletin1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        String cadenaConexion = "jdbc:mysql://127.0.0.1:3306/classicmodels?serverTimezone=UTC";
        try (Connection c = DriverManager.getConnection(cadenaConexion, "root", "root");
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("introduce el nombre");
            String nombre = br.readLine();

            PreparedStatement consulta = c.prepareStatement("Select productName, productVendor from products where productName like ?");
            consulta.setString(1,nombre);
            ResultSet resultado = consulta.executeQuery();
            while (resultado.next()){
                System.out.println(resultado.getString("productName")+ ": " + resultado.getString("productVendor"));
                /*o podemos usar el numero en vez de usar un alias*/
            }

        } catch (SQLException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

package boletin1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class ej6 {
    public static void main(String[] args) {
        String cadenaConexion = "jdbc:mysql://127.0.0.1:3306/classicmodels?serverTimezone=UTC";
        try (Connection c = DriverManager.getConnection(cadenaConexion, "root", "root");
             BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            System.out.println("introduce el nombre");
            String nombre = br.readLine();

            PreparedStatement consulta = c.prepareStatement("Select customerName, sum(quantityOrdered * priceEach) as total" +
                    "from orderdetails\n" +
                    "inner join orders on orders.orderNumber = orderdetails.orderNumber\n" +
                    "inner join customers on order.customerNumber = customers.customerNumber" +
                    "inner join employees on customers.salesReEmployeeNumber = employees.employeeNumber group by customerName");

            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()){
                System.out.println(resultado.getString("customerName") + resultado.getString("total"));
            }
        } catch (SQLException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

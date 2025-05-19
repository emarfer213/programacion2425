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

            PreparedStatement consulta = c.prepareStatement("Select employees.firstName, customers.customerName, sum(orderdetails.quantityOrdered * orderdetails.priceEach) as Total " +
                    "from employees " +
                    "inner join customers on employeeNumber = customers.salesRepEmployeeNumber " +
                    "INNER JOIN orders ON customers.customerNumber = orders.customerNumber " +
                    "inner join orderdetails ON orders.orderNumber = orderdetails.orderNumber " +
                    "where employees.firstName LIKE ? group by customers.customerName; ");

            consulta.setString(1, nombre + "%");

            ResultSet resultado = consulta.executeQuery();

            while (resultado.next()){
                System.out.println(resultado.getString("customerName") + resultado.getString("total"));
            }
        } catch (SQLException | IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

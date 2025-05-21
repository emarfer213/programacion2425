package boletin1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.*;

public class ej9 {
    public static void main(String[] args) {
        String cadenaConexion = "jdbc:mysql://127.0.0.1:3306/classicmodels?serverTimezone=UTC";
        try (Connection c = DriverManager.getConnection(cadenaConexion, "root", "root");
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in))){

            System.out.println("introduce el nombre");
            String nombre = br.readLine();

            PreparedStatement consulta1 = c.prepareStatement("delete customers from customers " +
                    "where customerName like ?; ");

            consulta1.setString(1, nombre + "%");

            /*while (resultado1.next()){
                System.out.println(resultado1.getString("customerName"));
            }*/

            PreparedStatement consulta2 = c.prepareStatement("delete payments from payments join customers on payments.customerNumber = customers.customerNumber where customers.customerName like ? ;");
            consulta2.setString(1, nombre + "%");

            /*while (resultado2.next()){
                System.out.println(resultado2.getDate("paymentDate"));
            }*/

            PreparedStatement consulta3 = c.prepareStatement("delete orders from orders join customers on orders.customerNumber = customers.customerNumber where customers.customerName like ? ;");
            consulta3.setString(1, nombre + "%");

            /*while (resultado3.next()){
                System.out.println(resultado3.getString("comments"));
            }*/

            PreparedStatement consulta4 = c.prepareStatement("delete od from orderdetails od join orders o on od.orderNumber = o.orderNumber " +
                    "join customers c on o.customerNumber = c.customerNumber where c.customerName like ? ;");
            consulta4.setString(1, nombre + "%");

            /*while (resultado4.next()){
                System.out.println(resultado4.getDouble("priceEach"));
            }*/

            

            //consulta4.executeUpdate();
            consulta3.executeUpdate();
            consulta2.executeUpdate();
            consulta1.executeUpdate();

        } catch (IOException | SQLException e){
            System.out.println(e.getMessage());
        }
    }

}

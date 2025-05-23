package refuerzo;

import java.sql.*;
import java.time.LocalDate;
import java.util.Scanner;

public class Ej1 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String cadenaConexion = "jdbc:mysql://127.0.0.1:3306/classicmodels?serverTimezone=UTC";
        try(Connection connection = DriverManager.getConnection(cadenaConexion, "root", "root")){
            System.out.println("Menu: \n" +
                    "1. Realizar pedido \n" +
                    "2. Marcar multiples pedidos \n" +
                    "3. Ver resumen de pedidos \n" +
                    "4. Salir ");

            int opcion = sc.nextInt();

            switch (opcion){
                case 1 ->
                        realizarPedido(connection);
            }
        }catch (SQLException e){

        }
    }

    public static void realizarPedido(Connection connection){
        System.out.println("introduzca el codifo del pedido");
        int codigoPedido = sc.nextInt();
        try {
            PreparedStatement st = connection.prepareStatement("Select shippedDate from orders where orderNumber = ?");
            st.setInt(1,codigoPedido);
            ResultSet rs = st.executeQuery();
            rs.next();
            System.out.println("la fecha de su pedido es " + rs.getDate(1));
            PreparedStatement st2 = connection.prepareStatement("update orders shippedDate = curdate() where shippedDate = null");
            st2.executeUpdate();
            System.out.println("Pedido "+ codigoPedido +" marcado como enviado el " + LocalDate.now());
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

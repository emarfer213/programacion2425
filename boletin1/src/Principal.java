import java.util.Scanner;

public class Principal {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //ponemos para que nos lea el teclado
        Scanner sc = new Scanner(System.in);

        System.out.println("hola, como te llamas");
        //establecemos que nos guarde los datos de lo que escribimos como "nombre"
        String nombre = sc.nextLine();
        //hacemos que nos muestre lo que hemos escrito
        System.out.println("hola " + nombre);

        double x = 3.1;

        float y = (float) x;

        int s = (int) y;

        long w = s;
    }
}
import java.util.Random;
import java.util.Scanner;

public class ejercicio4 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        int numVidas = 5;
        int aleatorio = (int) (Math.random() * 100) + 1;

        do {
            System.out.println("introduce un numero");
            num = sc.nextInt();
            if (num < aleatorio && num > 1 && num < 100) {
                System.out.println("es un numero mayor");
            } else if (num > aleatorio && num > 1 && num < 100) {
                System.out.println("el numero es menor");

            } else if (num < 1 || num > 100) {
                System.out.println("tiene que estar entre 0 y 100");
            }
            numVidas--;
        } while (numVidas > 0 && num != aleatorio);
        sc.close();
        if (num == aleatorio) {
            System.out.println("enhorabuena has ganado");
        } else
            System.out.println("deshonra sobre ti, has fallado");



    }
}
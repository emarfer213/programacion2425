import java.util.Scanner;

public class ejercicio7 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n1;
        do {

            System.out.println("dame un numero");
            n1 = sc.nextInt();

        } while (n1 <= 0);

        int n2;

        do {
            System.out.println("dame otro numero");
            n2 = sc.nextInt();

        }while (n2 <= 0);

        int x = n1;
        int y = n2;
        int resto;

        do {
            resto = x % y;
            x = y;
            y = resto;

        }while (resto != 0);

        System.out.println("el minimo comun divisor de los numeros es " +x);

    }
}
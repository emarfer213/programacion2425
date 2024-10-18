import java.util.Scanner;

public class refuerzo10 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("dame un tamaño para el triangulo");
        int size = sc.nextInt();

        for (int i = 1; i <= size; i++) {
            for (int j = 1; j <= size-i; j++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= i; x++) {

                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
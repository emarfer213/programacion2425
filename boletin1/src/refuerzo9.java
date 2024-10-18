import java.util.Scanner;

public class refuerzo9 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("dame un tamaño para el triangulo");
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {

                System.out.print("*");

            }
            System.out.println();
        }
    }
}
import java.util.Scanner;

public class refuerzo7 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("dame un tamaño para el cuadrado");
        int size = sc.nextInt();
        int sumatorio;

        for (int j = 0; j < size; j++) {
            for (int i = 0; i < size; i++) {

                System.out.printf("*   ");

            }
            System.out.println();
        }
    }
}
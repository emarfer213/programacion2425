import java.util.Scanner;

public class refuerzo8 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("dame una altura para el cuadrado");
        int altura = sc.nextInt();
        System.out.println("y dame una anchura");
        int anchura = sc.nextInt();

        for (int j = 0; j < altura; j++) {
            for (int i = 0; i < anchura; i++) {

                System.out.print("*   ");

            }
            System.out.println();
        }
    }
}
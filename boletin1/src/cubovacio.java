import java.util.Scanner;

public class cubovacio {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("dame una altura para el cuadrado");
        int altura = sc.nextInt();
        System.out.println("y dame una anchura");
        int anchura = sc.nextInt();


        for (int j = 1; j < altura; j++) {
            for (int i = 1; i < anchura; i++) {
                if (i == 1 || i == anchura || j == 1 || j == altura) {

                System.out.print("*");

                }else{
                    System.out.print(" ");

            }

            }
            System.out.println();
        }
    }
}
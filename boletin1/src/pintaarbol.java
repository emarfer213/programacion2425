import java.util.Scanner;

public class pintaarbol {
    /**
     * @param args
     */

    public static void main(String[] args) {
        int altura = 5;
        pinta(altura);

    }
    public static void pinta (int juana) {

        System.out.println("dame un tamaño para el triangulo");

        for (int i = 1; i <= juana; i++) {
            for (int j = 1; j <= juana-i; j++) {
                System.out.print(" ");
            }
            for (int x = 1; x <= i; x++) {

                System.out.print("* ");

            }
            System.out.println();
        }
    }
}
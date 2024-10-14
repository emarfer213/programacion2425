import java.util.Scanner;

public class ejercicio2 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("dame una base");

        int n1 = sc.nextInt();

        while (n1 < 0){

            System.out.println("dame una base");

             n1 = sc.nextInt();

        }

        System.out.println("dame un exponente");

        int n2 = sc.nextInt();

        int x=1;

        while (n2 < 0){

            System.out.println("dame un exponente");

            n2 = sc.nextInt();


        }

        for (int i=0; i!=n2; i++){

            x= x*n1;
        }
        System.out.println("el resultado es " +x );
    }
}
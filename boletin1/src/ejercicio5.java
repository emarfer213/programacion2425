import java.util.Scanner;

public class ejercicio5 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("dime un numero");
        int n1 = sc.nextInt();
        boolean esPrimo = true;

        if (n1 %2 ==0){
            esPrimo = false;
        }
        for (int i = 3; i<n1/2 && esPrimo; i= i+2) {

            if (n1 % i == 0){
                esPrimo = false;

                }
            }
            if (esPrimo) {
                System.out.println("el numero " + n1 + " es primo");
            } else {
                System.out.println("el numero "+n1+" no es primo");
            }
        }
    }

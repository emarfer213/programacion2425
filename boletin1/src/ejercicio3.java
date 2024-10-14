import java.util.Scanner;

public class ejercicio3 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("dame un numero");

        int n1 = sc.nextInt();
        float x = n1;
        int i=0;
        do {

            x = x / 10;
            i++;

        }while(x > 1);


        System.out.println("tiene " + i + " numeros" );
    }
}
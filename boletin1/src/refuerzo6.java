import java.util.Scanner;

public class refuerzo6 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("dame un numero de dados celsius");
        int grados = sc.nextInt();

        float resultado = ((grados * 9)/5f + 32);

        System.out.println("son " +resultado+ " grados fahrenheit");

    }

}
import java.util.Scanner;

public class refuerzo5 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("dame un numero de dados fahrenheit");
        int grados = sc.nextInt();

        float celsius = ((grados - 32) * 5)/9f;

        System.out.println("son " +celsius+ " grados celsius");

    }
}
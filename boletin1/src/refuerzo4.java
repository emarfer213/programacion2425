import java.util.Scanner;

public class refuerzo4 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("cuantas caras tiene el dado?");
        int caras = sc.nextInt();

        int dado = (int) (Math.random() * (caras)) + 1 ;

        System.out.println("el numero que te ha tocado en el dado es " +dado);


    }
}
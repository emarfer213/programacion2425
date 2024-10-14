import java.util.Scanner;

public class ejercicio1 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("dame 1 numero");

        int n1 = sc.nextInt();

        System.out.println("dame otro numero");

        int n2 = sc.nextInt();

        System.out.println("dame otro numero mas");

        int n3 = sc.nextInt();

        if (n1 >= n2 && n1 >= n3) {
            //n1 es mayor
            if (n2 >= n3) {
            //el orden es n1>=n2>=n3
            }
            else {
            //el orden es n1>=n3>=n2
            }
        }
        else if (n2 >= n1 && n2 >= n3) {
            //n2 es el mayor

            if (n1 >= n3) {
                // el orden es n2>=n1>=n3
            } else {
                // el orden es n2>=n3>=n1
            }
        }
        else {

        }
                if (n1 >= n2) {
                    // orden es n3>=n1>=n2
                }
                else {
                // el orden es n3>=n2>=n1
                }
            }
        }
import java.util.Scanner;

public class ejercicio_horas {

    public static void main(String[] args) {

        int dias;
        Scanner sc = new Scanner(System.in);

        int hf = 0,mf = 0,sf = 0;

        System.out.println("dime la hora");

        int n1 = sc.nextInt();

        System.out.println("dame los minutos");

        int n2 = sc.nextInt();

        System.out.println("dame segundos");

        int n3 = sc.nextInt();

        System.out.println("cuantas horas quieres sumar");

        int n4 = sc.nextInt();

        System.out.println("cuantos minutos quieres sumar");

        int n5 = sc.nextInt();

        System.out.println("cuantos segundos quieres sumar");

        int n6 = sc.nextInt();

        sf = (n3 + n6) % 60;

        mf += (n3 + n6) / 60;

        hf += (n1 + n4) / 60;

        mf = (n2 + n5) % 60;

        dias = (n1 + n4) / 24;

        hf = (hf + n4) % 24;

        System.out.printf("la hora resultante es %02d:%02d:%02d" ,hf,mf,sf);
        System.out.println(" han pasado " +dias+ " dias");







    }
}
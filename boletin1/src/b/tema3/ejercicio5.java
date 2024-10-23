package b.tema3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ejercicio5 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("dime el tamaño");
        int size = sc.nextInt();

        int[] aleatorio = new int [size];
        posiciones(aleatorio);
    }
    private static void posiciones(int[] aleatorio) {

        int random1 = 0;
        for (int i = 0; i < aleatorio.length; i++) {
            Random random = new Random();
            random1 = random.nextInt(1001);
            aleatorio[i] = random1;
        }

        System.out.println("tus posiciones son");
        System.out.println(Arrays.toString(aleatorio));
    }
}
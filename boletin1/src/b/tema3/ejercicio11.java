package b.tema3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio11 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arrayOriginal = creaArray();
        System.out.println(Arrays.toString(arrayOriginal));

    }

    private static int[] creaArray() {
        System.out.println("cuantos numeros quieres meter para el primer array");
        int n1 = sc.nextInt();

        int[] array1 = new int[n1];

        for (int i = 0; i < array1.length; i++) {
            System.out.println("dime un numero");
            array1[i] = sc.nextInt();
        }


        System.out.println("mete la misma cantidad de numeros para el segundo array");


        int[] array2 = new int[n1];

        for (int i = 0; i < array2.length; i++) {
            System.out.println("dime un numero");
            array2[i] = sc.nextInt();
        }

        int[] arrayFinal = null;
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == array1[i]) ;
            arrayFinal = new int[]{array2[i]};
        }

        return arrayFinal;

    }
}

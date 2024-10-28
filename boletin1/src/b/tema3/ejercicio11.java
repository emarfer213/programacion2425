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

        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,7,8,9,6};

        int[] arrayFinal = new int[0];
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == array1[i]);
            assert false;
            arrayFinal[i] += array2[i];

        }

        return arrayFinal;

    }
}

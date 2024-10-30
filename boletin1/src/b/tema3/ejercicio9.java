package b.tema3;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio9 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int[] array1 = {1, 4, 3, 7, 2};
        int[] arrayOrdenado = elementosOrdenados(array1);
        System.out.println(Arrays.toString(arrayOrdenado));
    }

    private static int[] elementosOrdenados(int[] array1) {

        System.out.println("quieres que sea de mayor a menor? pon 1 si quieres que sea asi");
        int repuesta = sc.nextInt();
        boolean reverse = false;
        if (repuesta == 1) {
            reverse = true;
        }
        if (reverse) {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1.length - 1; j++) {
                    if (array1[j] < array1[j + 1]) {
                        int x = array1[j + 1];
                        array1[j + 1] = array1[j];
                        array1[j] = x;
                    }
                }
            }

        } else {
            for (int i = 0; i < array1.length; i++) {
                for (int j = 0; j < array1.length - 1; j++) {
                    if (array1[j] > array1[j + 1]) {
                        int x = array1[j + 1];
                        array1[j + 1] = array1[j];
                        array1[j] = x;
                    }
                }
            }
        }
        return array1;
    }

}
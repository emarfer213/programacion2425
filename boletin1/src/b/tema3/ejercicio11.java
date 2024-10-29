package b.tema3;

import java.util.Arrays;

public class ejercicio11 {

    public static void main(String[] args) {

        int[] array1 = {1,2,3,7,2};
        int[] array2 = {7,3,2,9,1};
        int[] arrayFinal = elementoscomunes(array1,array2);
        System.out.println(Arrays.toString(arrayFinal));
    }

    private static int[] elementoscomunes(int[] array1, int [] array2){
        int indicedupli=0;
        int[] nuevoArray = new int[array1.length];

        for (int i = 0; i < array1.length; i++) {
            if (buscarnumero(array2, array1[i]) && !buscarnumero(nuevoArray, array1[i])) {
                nuevoArray[indicedupli] = array1[i];
                indicedupli++;
            }
        }

        int[] arrayExacto = new int[indicedupli];

        for (int i = 0; i < indicedupli; i++) {
            arrayExacto[i] = nuevoArray[i];
        }

        return arrayExacto;
    }

    private static boolean buscarnumero(int[] array, int num) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return true;
            }
        }
        return false;

    }
}
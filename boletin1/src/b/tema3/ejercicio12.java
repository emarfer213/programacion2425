package b.tema3;

import java.util.Arrays;

public class ejercicio12 {

    public static void main(String[] args) {

        int[] array1 = {1, 4, 3, 7, 2};
        int[] arrayFinal = elementosOrdenados(array1);
        System.out.println(Arrays.toString(arrayFinal));
    }
    private static int [] elementosOrdenados(int[] array1){
        int x = 0;
        for (int i = 0; i < array1.length-1; i++) {
            for (int j = 0; j < array1.length-1-i; j++) {
                if (array1[j] > array1[j+1]) {
                    x = array1[j+1];
                    array1[j+1]=array1[j];
                    array1[j]=x;
                }
            }
        }
        return array1;
    }

}
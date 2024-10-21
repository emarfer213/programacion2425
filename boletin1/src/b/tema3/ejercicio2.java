package b.tema3;

import java.util.Arrays;

public class ejercicio2 {

    public static void main(String[] args) {
        int[] miArray = {1, 2, -3, 4, -5};

        System.out.println(Arrays.toString(miArray));

        int nega = negaArray(miArray);

        System.out.printf("hay %d numeros negativos", nega);
    }

    private static int negaArray(int[] miArray) {
        int nega = 0;

        for (int i = 0; i < miArray.length; i++) {
            if (miArray[i] < 0){
                nega++;
            }
        }

        return  nega;
    }
}

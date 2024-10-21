package b.tema3;

import java.util.Arrays;

public class ejercicio1 {

    public static void main(String[] args) {
        int[] miArray = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(miArray));

        int suma = sumaArray(miArray);

        System.out.printf("la suma del array es %d", suma);
    }

    private static int sumaArray(int[] miArray) {
        int suma = 0;


        for (int i = 0; i < miArray.length; i+=2) {
            suma += miArray[i];

        }

        return suma;

    }
}


package b.tema3;

import java.util.Arrays;
import java.util.Random;

public class ejercicio4 {

    static final int size=6000;
    static final int seed=21;
    public static void main(String[] args) {

        int[] aleatorio = new int[size];

        rellenaArray(aleatorio);
        int [] repeticiones = digitofinal(aleatorio);
        numeromax(repeticiones);

        System.out.println(mediaArray(aleatorio));

    }

    private static void rellenaArray(int[] aleatorio){

        for (int i = 0; i < aleatorio.length; i++) {
            Random random = new Random();
            int random1 = random.nextInt(101);
            aleatorio[i] = random1;
        }

    }

    private static double mediaArray(int[] aleatorio) {
        double media = 0;
        for (int i = 0; i < aleatorio.length; i++) {
            media += aleatorio[i];
        }
        return media/ aleatorio.length;
    }

    private static int[] digitofinal(int[] aleatorio) {
        int[] repeticiones = new int[10];

        for (int i = 0; i < aleatorio.length; i++) {
            int terminaciones = aleatorio[i] % 10;
            repeticiones[terminaciones]++;

        }


        float suma = 0;
        for (int i = 0; i < repeticiones.length; i++) {
            float porcentaje = (float) repeticiones[i] / size * 100;
            suma += porcentaje;

            System.out.printf("el porcentaje de numeros que termina en %d es %.2f %% \n", i, porcentaje);
            if (i == repeticiones.length - 1) {
                float media = suma / 10;
                System.out.printf("la suma de todos los porcentajes es %.2f %% la media, de los porcentajes es %.2f %% \n" , suma, media);
            }
        }

                System.out.println(Arrays.toString(repeticiones));
        return repeticiones;
    }
    private static void numeromax (int[] repeticiones) {
        int max = -1;
        for (int i = 0; i < repeticiones.length; i++) {
            if (repeticiones[i] > max) {
                max = repeticiones[i];
            }
        }
        System.out.println("las terminaciones que mas se han repetido son: ");
        for (int i = 0; i < repeticiones.length; i++) {
            if (repeticiones[i] == max){
                System.out.printf("%d: %d veces\n",i,max);
            }
        }
    }

}
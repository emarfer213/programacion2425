package b.tema3;

import java.util.Random;

public class ejercicio7 {


    public static void main(String[] args) {
        int[] array = new int[100];

        int num = 12;

        inicializaArryAleatorio(array);

       if (contieneelemento(array, 10)){
           System.out.println("el numero 10 esta dentro del array");
       }
       else {
           System.out.println("el numero no esta dentro del array");
       }

        inicializaArryAleatorio(array);

    }

    private static void inicializaArryAleatorio (int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

    }

    private static boolean contieneelemento (int[] array, int num){
        boolean encontrado = false;

        for (int i = 0; i < array.length && !encontrado; i++) {
            if (array[i] == num) {
                encontrado = true;
            }
        }
        return encontrado;
    }
}
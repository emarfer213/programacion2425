package b.tema3;

import java.util.Random;
import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("entre cuantos numeros quieres buscar");
        int n1 = sc.nextInt();

        int[] array = new int[n1];

        System.out.println("dime que numero quieres buscar");
        int n2 = sc.nextInt();

        aleatorio(array);
        System.out.println("el numero esta en la posicion " + posicion(array,n2));
    }

    private static void aleatorio (int[] array){
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(101);
        }

    }

    private static int posicion (int[] array, int n2){
        int encontrado = -1;

        for (int i = 0; i < array.length && encontrado == -1; i++) {
            if (array[i] == n2) {
                encontrado = i;
            }
        }
        return encontrado;
    }
}
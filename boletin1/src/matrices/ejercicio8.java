package matrices;

import java.util.Arrays;

public class ejercicio8 {
    public static void main(String[] args) {

        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matriz2 = {{1, 2, 3}, {4, 2, 6}, {7, 8, 9}};
        int[][] matrizResultado = sumaMatrices(matriz1, matriz2);
        boolean size = comprobarSize(matriz1, matriz1);
        if (size) {
            System.out.println("las dos son iguales");
        } else {
            System.out.println("no son iguales");
        }
        System.out.println(Arrays.deepToString(matrizResultado));
    }

    private static boolean comprobarSize(int[][] matriz1, int[][] matriz2) {
        if (matriz1.length != matriz2.length) {
            return false;
        }
        for (int i = 0; i < matriz1.length; i++) {
            if (matriz1[i].length != matriz2[i].length) {
                return false;
            }
        }
        return true;
    }

    public static int[][] sumaMatrices(int[][] matriz1, int[][] matriz2) {
        int[][] suma = new int[matriz1.length][matriz1[0].length];
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                suma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }
        return suma;
    }
}
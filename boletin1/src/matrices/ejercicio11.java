package matrices;

import java.util.Arrays;

public class ejercicio11 {
    public static void main(String[] args) {

        int[][] matriz1 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] matriz2 = {{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};

        if (comprobarSize(matriz1, matriz2)) {
            System.out.println("son del mismo tamaño");
        } else {
            System.out.println("no son del mismo tamaño");
        }

        if (comprobarSimetria(matriz1, matriz2)) {
            System.out.println("son simetricos");
        } else {
            System.out.println("no son simetricos");
        }
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

    private static boolean comprobarSimetria(int[][] matriz1, int[][] matriz2) {
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                if (matriz1[i][j] != matriz2[matriz2.length - 1 - i][matriz2.length - 1 - j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
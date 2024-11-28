package matrices;

import java.util.Arrays;

public class ejercicio13 {
    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        System.out.println(Arrays.deepToString(crearReflejo(matriz)));
        if (comprobarCuadrado(matriz)) {
            System.out.println("es cuarada");
        } else {
            System.out.println("no es cuadrada");
        }
    }

    private static boolean comprobarCuadrado(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i].length != matriz[j].length) {
                    return false;
                }
            }
        }
        return true;
    }

    private static int[][] crearReflejo(int[][] matriz) {
        int[][] matrizEspejo = new int[matriz.length][matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matrizEspejo[i][j] = matriz[matriz.length - 1 - j][matriz.length - 1 - i];
            }
        }
        return matrizEspejo;
    }
}
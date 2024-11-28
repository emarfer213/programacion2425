package matrices;

import java.util.Arrays;

public class ejercicio9 {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {4, 5, 6}, {1, 2, 3}};
        if (comprobarSimetriaX(matriz)) {
            System.out.println("son simetricas");
        } else {
            System.out.println("no son simetricas");
        }
    }

    private static boolean comprobarSimetriaX(int[][] matriz) {
        for (int i = 0; i < matriz.length / 2; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] != matriz[matriz.length - 1 - i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}
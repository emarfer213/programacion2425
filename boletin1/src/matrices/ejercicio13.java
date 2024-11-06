package matrices;

import java.util.Arrays;

public class ejercicio13 {
    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 1, 2}, {4, 5, 4, 5}, {6, 5, 6, 5},{3, 2, 3, 3}};
        System.out.println(Arrays.deepToString(crearReflejo(matriz)));
        if (comprobarCuadrado(matriz)){
            System.out.println("es cuarada");
        } else {
            System.out.println("no es cuadrada");
        }

    }

    private static boolean comprobarCuadrado(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i].length != matriz[j].length) {
                    return false;
                }
            }
        }

        return true;
    }

    private static int[][] crearReflejo(int[][] matriz){
        int[][] matrizEspejo = new int [4][4];
        for (int i = matriz.length-1; i >= 0; i--) {
            for (int j = matriz[i].length-1; j >= 0; j--) {
                matrizEspejo[j][i] = matriz[i][j];
            }
        }
        return matrizEspejo;
    }
}
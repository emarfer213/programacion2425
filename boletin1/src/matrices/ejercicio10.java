package matrices;

import java.util.Arrays;

public class ejercicio10 {
    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 1}, {4, 5, 4}, {6, 5, 6},{3, 2, 3}};

        if (comprobarSimetriaY(matriz)){
            System.out.println("son simetricas");
        } else {
            System.out.println("no son simetricas");
        }

    }

    private static boolean comprobarSimetriaY(int[][] matriz){
        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                if (matriz[i][j] != matriz[i][matriz[i].length-1-j]){
                    return false;
                }
            }
        }
        return true;
    }
}
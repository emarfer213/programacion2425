package matrices;

import java.util.Arrays;

public class ejercicio16 {
    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 1, 2}, {4, 5, 4, 5}, {6, 5, 6, 5},{3, 2, 3, 2}};
       int [][] matrizAdyacentes = crearMatrizParesAdyacentes(matriz);
        for (int i = 0; i < matrizAdyacentes.length; i++) {
            System.out.println(Arrays.toString(matrizAdyacentes[i]));
        }

    }

    private static int[][] crearMatrizParesAdyacentes(int[][] matriz){
        int[][] matrizAdyacentesPares= new int[matriz.length][matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matrizAdyacentesPares[i][j] = cuentaAdyacentesares(matriz, i, j);
            }
        }
        return matrizAdyacentesPares;

    }

    private static int cuentaAdyacentesares(int[][] matriz, int i, int j){
        int numerosPares=0;
        for (int k = i-1; k <= i+1; k++) {
            for (int l = j-1; l <= j+1; l++) {
                if (k >= 0 && k < matriz.length && l >= 0 && l < matriz[0].length && !(k == i && l ==j)){

                    if (matriz[k][l] % 2 == 0) {
                        numerosPares++;
                    }
                }
            }
        }
        return numerosPares;
    }
}
package matrices;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args){
        int[][] sizeMatriz = {{1,2,3},{4,5,6}};
        boolean negativos = hayNegativos(sizeMatriz);
        if (negativos){
            System.out.println("hay negativos");
        } else {
            System.out.println("no hay negativos");
        }
    }


    private static boolean hayNegativos(int[][] sizeMatriz){
        boolean negativo=false;

        for (int i = 0; i < sizeMatriz.length && !negativo; i++) {
            for (int j = 0; j < sizeMatriz[i].length; j++) {
                if (sizeMatriz[i][j]<0){
                    negativo=true;
                }
            }

        }
        return negativo;
    }
}

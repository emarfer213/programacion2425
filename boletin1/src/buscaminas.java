import java.util.Arrays;

import static java.lang.Math.random;

public class buscaminas {
    private static int [][] matrizMinas;
    private static boolean [][] matrizLevantadas;
    private static final int TAM_MATRIZ = 10;
    private static final int MINAS_A_PLANTAR = 10;
    private static final int MINA=-1;
    public static void main(String[] args) {
        generarMatrices(TAM_MATRIZ);
        plantarMinas(MINAS_A_PLANTAR);
        visualizaTablero();

    }

    public static void generarMatrices(int tam){
        matrizMinas = new int[tam][tam];
        matrizLevantadas = new boolean[tam][tam];
    }

    public static void plantarMinas(int numMinas){
        for (int i = 0; i < numMinas; i++) {
            int cordenadaX = (int) (Math.random()*TAM_MATRIZ);
            int cordenadaY = (int) (Math.random()*TAM_MATRIZ);
            if (matrizMinas[cordenadaX][cordenadaY]!=MINA){
                matrizMinas[cordenadaX][cordenadaY]=MINA;
            }
            else {
                i--;
            }

        }
    }

    public static void visualizaTablero(){
        for (int i = 0; i < TAM_MATRIZ; i++) {
            for (int j = 0; j < TAM_MATRIZ; j++) {
                if (matrizLevantadas[i][j]){
                    System.out.printf("%2d | ", matrizMinas[i][j]);

                } else {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }
    }

}

import java.util.Arrays;
import java.util.Scanner;

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
        tableroJugador();

    }

    public static void mostrarTablero(String[][] tableroJugador, int[][] matrizLevantadas){
        Scanner sc = new Scanner(System.in);
        System.out.println("escribe cordenadas");
        System.out.println("cordenada x");
        int i = Integer.parseInt(sc.nextLine())-1;
        System.out.println("cordenada y");
        int j = Integer.parseInt(sc.nextLine())-1;




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
                for (int j = cordenadaX-1; j <= cordenadaX+1; j++) {
                    for (int k = cordenadaY-1; k <= cordenadaY+1; k++) {
                        if (j >= 0 && j < matrizMinas.length && k >= 0 && k < matrizMinas.length) {
                            if (matrizMinas[j][k] > -1) {
                                matrizMinas[j][k]++;
                            }
                        }
                    }
                }
            }
            else {
                i--;
            }

        }
    }

    public static void tableroJugador(){
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

    /*public static void visualizaTablero(){
        for (int i = 0; i < TAM_MATRIZ; i++) {
            for (int j = 0; j < TAM_MATRIZ; j++) {
                if (matrizLevantadas[i][j]){
                    System.out.printf("%2d | ", matrizMinas[i][j]);

                } else {
                    System.out.printf("%2d | ",matrizMinas[i][j]);
                }
            }
            System.out.println();
        }
    }*/


}

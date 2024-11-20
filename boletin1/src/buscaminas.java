import java.util.Objects;
import java.util.Scanner;

public class buscaminas {
    private static int [][] matrizMinas;
    private static boolean [][] matrizLevantadas;
    private static final int TAM_MATRIZ = 10;
    private static final int MINAS_A_PLANTAR = 10;
    private static final int MINA=-1;
    public static boolean hasPerdido;
    public static final String[] letras= {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};

    public static void main(String[] args) {
        generarMatrices(TAM_MATRIZ);
        plantarMinas(MINAS_A_PLANTAR);
        do {
            tableroJugador();
            pedirCordenadas(matrizLevantadas, matrizMinas);
        } while (!hasPerdido);
    }

    public static void pedirCordenadas(boolean[][] matrizLevantadas, int[][] matrizMinas){

        Scanner sc = new Scanner(System.in);
        System.out.println("escribe cordenadas");
        System.out.println("cordenada x");
        String i1 = sc.nextLine();
        int x = 0;
        boolean letra = false;
        for (int i = 0; i < letras.length&&!letra; i++) {
            if (Objects.equals(letras[i], i1)){
                x=i;
                letra=true;
            }
        }
        System.out.println("cordenada y");
        int y = Integer.parseInt(sc.nextLine())-1;

        if (matrizMinas[x][y]==-1){
            System.out.println("perdiste");
            tableroCompleto();
            hasPerdido=true;
        }

        if (matrizMinas[x][y]!=-1){
            if (!matrizLevantadas[x][y]) {
                for (int j = x - 1; j <= x + 1; j++) {
                    for (int k = y - 1; k <= y + 1; k++) {
                        if (j >= 0 && j < matrizMinas.length && k >= 0 && k < matrizMinas.length) {
                            if (matrizMinas[j][k] > -1) {
                                matrizLevantadas[j][k] = true;
                            }
                        }
                    }
                }
            }
        }


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
        System.out.print("    ");
        for (int l = 1; l <= TAM_MATRIZ; l++) {
            if (l == 10){
                System.out.printf("%s ",l);
            } else {
                System.out.printf("%s  ",l);
            }
        }
        System.out.println();
        for (int i = 0; i < TAM_MATRIZ; i++) {
            System.out.printf("%s  ", letras[i]);
            for (int j = 0; j < TAM_MATRIZ; j++) {
                if (matrizLevantadas[i][j]) {
                    System.out.printf(" %d ", matrizMinas[i][j]);

                } else {
                    System.out.print(" | ");
                }
            }
            System.out.println();
        }

    }

    public static void tableroCompleto(){
        System.out.print("    ");
        for (int l = 1; l <= TAM_MATRIZ; l++) {
            if (l == 10){
                System.out.printf("%s ",l);
            } else {
                System.out.printf("%s  ",l);
            }
        }
        System.out.println();
        for (int i = 0; i < TAM_MATRIZ; i++) {
            System.out.printf("%s  ", letras[i]);
            for (int j = 0; j < TAM_MATRIZ; j++) {

                if (matrizLevantadas[i][j]){
                    System.out.printf("%2d ", matrizMinas[i][j]);

                } else {
                    System.out.printf("%2d ",matrizMinas[i][j]);
                }
            }
            System.out.println();
        }
    }


}
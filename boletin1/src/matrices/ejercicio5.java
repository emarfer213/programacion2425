package matrices;

public class ejercicio5 {
    public static void main(String[] args) {

        int[][] matriz = {{1,2,3}, {4,5,6}, {7,8,9}};
        elementosMatriz(matriz);

    }
    private static void elementosMatriz(int[][] matriz) {

        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz[j].length; i++) {
                System.out.print(matriz[i][j] + ", ");
            }
        }
    }
}
public class examen_arrays_2020_2 {
    public static void main(String[] args) {

        int[][] jardin = {
                {1, 0, 0, 0, 1, 0, 0, 0, 2, 1, 1, 0, 0, 5, 0},
                {0, 2, 0, 5, 0, 0, 3, 0, 1, 0, 0, 0, 1, 0, 0},
                {3, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 2, 4},
                {0, 0, 2, 0, 0, 0, 0, 0, 2, 1, 3, 0, 0, 0, 1},
                {0, 0, 1, 0, 0, 0, 3, 0, 1, 0, 0, 0, 0, 0, 3},
                {4, 3, 0, 0, 0, 2, 1, 0, 0, 0, 0, 5, 0, 0, 0},
                {1, 2, 0, 5, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 2},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1},
                {3, 0, 0, 0, 0, 0, 2, 1, 4, 0, 0, 0, 1, 0, 0},
                {2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 3, 0},
                {0, 0, 5, 1, 0, 0, 0, 5, 0, 3, 0, 0, 1, 0, 0},
                {1, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 5, 2, 4, 0},
                {0, 0, 1, 3, 0, 0, 1, 0, 0, 1, 0, 0, 1, 3, 0},
                {0, 1, 2, 1, 0, 0, 0, 0, 0, 2, 3, 1, 0, 0, 1},
                {1, 3, 4, 0, 0, 5, 0, 0, 1, 0, 0, 0, 0, 4, 2},
        };

        recorrerJardin(jardin);
    }

    private static void recorrerJardin (int [][] jardin){
        for (int i = 0; i < jardin.length; i++) {
            for (int j = 0; j < jardin.length; j++) {
                if (jardin[i][j]==1);
                if (hayAgua(jardin, i, j) && hayAbeja(jardin, i, j))   {
                    if (hayMalahierva(jardin, i, j) && hayGusano(jardin, i, j)){
                        System.out.println("la flor de la posicopn " +i+ +j+ " florecera");
                    } else if (hayMalahierva(jardin, i, j) && !hayGusano(jardin, i, j)) {

                    } else {
                        System.out.println("la flor de la posicopn " + jardin[i][j] + " florecera");
                    }
                } else {

                }
            }
        }
    }

    private static boolean hayAgua(int [][] jardin, int i, int j){
        boolean aguaAdyacente=false;
        for (int k = i-1; k <= i+1; k++) {
            for (int l = j-1; l <= j+1; l++) {
                if (k >= 0 && k < jardin.length && l >= 0 && l < jardin[0].length) {
                    if (jardin[k][l] == 2) {
                        aguaAdyacente = true;
                    }
                }
            }
        }
        return aguaAdyacente;
    }

    private static boolean hayAbeja(int [][] jardin, int i, int j){
        boolean abejaAdyacente =false;
        for (int k = i-3; k <= i+3; k++) {
            for (int l = j-3; l <= j+3; l++) {
                if (k >= 0 && k < jardin.length && l >= 0 && l < jardin[0].length) {
                    if (jardin[k][l] == 5) {
                        abejaAdyacente = true;
                    }
                }
            }
        }
        return abejaAdyacente;
    }

    private static boolean hayMalahierva(int [][] jardin, int i, int j){
        boolean malahiervaAdyacente =false;
        for (int k = i-1; k <= i+1; k++) {
            for (int l = j-1; l <= j+1; l++) {
                if (k >= 0 && k < jardin.length && l >= 0 && l < jardin[0].length) {
                    if (jardin[k][l] == 3) {
                        malahiervaAdyacente = true;
                    }
                }
            }
        }
        return malahiervaAdyacente;
    }

    private static boolean hayGusano(int [][] jardin, int i, int j){
        boolean gusanoAdyacente =false;
        for (int k = i-1; k <= i+1; k++) {
            for (int l = j-1; l <= j+1; l++) {
                if (k >= 0 && k < jardin.length && l >= 0 && l < jardin[0].length) {
                    if (jardin[k][l] == 4) {
                        gusanoAdyacente = true;
                    }
                }
            }
        }
        return gusanoAdyacente;
    }


}
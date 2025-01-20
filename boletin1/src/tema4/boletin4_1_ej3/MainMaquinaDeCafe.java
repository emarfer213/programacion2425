package tema4.boletin4_1_ej3;

import java.util.Scanner;

public class MainMaquinaDeCafe {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc = new Scanner(System.in);

        maquinaDeCafe c1;
        c1 = new maquinaDeCafe(50, 50, 50, 80);

        do {
            System.out.println("elije una opcion para realizar");
            System.out.println("1: servir cafe");
            System.out.println("2: servir leche");
            System.out.println("3: servir cafe con leche");
            System.out.println("4: comprobar estado de la maquina");
            System.out.println("5: salir");

            opcion= sc.nextInt();

            switch (opcion) {
                case 1:
                    c1.servirCafe();
                    break;

                case 2:
                    c1.servirLeche();
                    break;

                case 3:
                    c1.servirCafeConLeche();
                    break;

                case 4:
                    c1.estadoMaquina();
                    break;
            }

        } while (opcion != 5);
    }
}

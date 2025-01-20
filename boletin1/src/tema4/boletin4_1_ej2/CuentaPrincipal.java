package tema4.boletin4_1_ej2;

import java.util.Scanner;

public class CuentaPrincipal {
    public static void main(String[] args) {
        int dineroSacar;
        int dineroMeter;
        int opcion=0;
        Scanner sc = new Scanner(System.in);

        Cuenta c1;
        try {
            c1 = new Cuenta("1234", "emilio", 100);
        } catch (CuentaException e1){
            System.out.println(e1.getMessage());
            return;
        }

        do {
            try {
                System.out.println("elije una opcion para realizar con tu cuenta");
                System.out.println("1: ingresar dinero");
                System.out.println("2: sacar dinero");
                System.out.println("3: comprobar cuenta");
                System.out.println("4: salir");

                opcion=sc.nextInt();

                if (opcion==1){
                    System.out.println("cuanto dinero quieres meter");
                    dineroMeter=sc.nextInt();
                    c1.meterDinero(dineroMeter);
                }

                if (opcion==2){
                    System.out.println("cuanto dinero quieres sacar");
                    dineroSacar=sc.nextInt();
                    c1.retirarDinero(dineroSacar);
                }

                if (opcion==3){
                    c1.mostrarActividad();
                }

                if (opcion==4){
                    c1.finalizar();
                }
            } catch (CuentaException e2){
                System.out.println(e2.getMessage());
            }
        } while (opcion != 4);
    }
}

package tema4;
import java.util.Scanner;

public class principalCuenta {
    public static void main(String[] args) throws CuentaException {

        int dineroSacar;
        int dineroMeter;
        int opcion;
        Scanner entrada= new Scanner(System.in);

        Cuenta c1;
        try {
             c1 = new Cuenta("1234", "Emilio",100);
        } catch (CuentaException e1) {
            System.out.println(e1.getMessage());
            return;
        }

        try {
            do {
                System.out.println("introduce la opcion que deseas");
                System.out.println("1) meter dinero");
                System.out.println("2) sacar dinero");
                System.out.println("3) consultar saldo");
                System.out.println("4) salir");

                opcion = entrada.nextInt();

                if (opcion==1){
                    System.out.println("cuento dinero quieres meter");
                    dineroMeter = entrada.nextInt();
                    c1.meterDinero(dineroMeter);
                }

                if (opcion==2){
                    System.out.println("cuento dinero quieres retirar");
                    dineroSacar = entrada.nextInt();
                    c1.sacarDinero(dineroSacar);
                }

                if (opcion==3){

                }
            } while (opcion != 4);


        } catch (CuentaException e2) {
            System.out.println(e2.getMessage());
        }
    }


}

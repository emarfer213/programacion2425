package tema4;
import java.util.Scanner;

public class principalCuenta {
    public static void main(String[] args) throws CuentaException {

        int dineroSacar;
        int dineroMeter;
        int opcion=0;
        Scanner entrada= new Scanner(System.in);

        Cuenta c1;
        try {
             c1 = new Cuenta("1234", "Emilio",100);
        } catch (CuentaException e1) {
            System.out.println(e1.getMessage());
            return;
        }


            do {
                try {
                System.out.println("introduce la opcion que deseas");
                System.out.println("1) meter dinero");
                System.out.println("2) sacar dinero");
                System.out.println("3) consultar saldo");
                System.out.println("4) salir");

                opcion = entrada.nextInt();

                if (opcion==1){
                    System.out.println("cuanto dinero quieres meter");
                    dineroMeter = entrada.nextInt();
                    c1.meterDinero(dineroMeter);
                }

                if (opcion==2){
                    System.out.println("cuanto dinero quieres retirar");
                    dineroSacar = entrada.nextInt();
                    c1.sacarDinero(dineroSacar);
                }

                if (opcion==3){
                    imprimirSaldo(c1);
                }

                if (opcion==4){
                    c1.finalizar();
                }

                } catch (CuentaException e2) {
                    System.out.println(e2.getMessage());
                }

            } while (opcion != 4);
    }

    public static void imprimirSaldo(Cuenta cuenta){
        System.out.printf("el saldo de su cuenta es %.2f€ \n", cuenta.getSaldo());
        System.out.printf("el numero de retiradas es %d \n", cuenta.getContadorRetirada());
        System.out.printf("el numero de ingresos es %d \n", cuenta.getContadoringreso());
    }

}

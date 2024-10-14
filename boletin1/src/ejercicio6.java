import java.util.Scanner;

public class ejercicio6 {
    /**
     * @param args
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("dime el numero de alunmos");
        int n1 = Integer.parseInt(sc.nextLine());
        int aprob = 0;
        int susp = 0;
        float nota;
        int i = 0;

        System.out.println("dime la nota de cada alumno");
        do {
            i++;
            System.out.println("el alumno numero " + i);
            nota = Float.parseFloat(sc.nextLine());
            if (nota >= 5) {
                aprob++;

            } else {
                susp++;
            }
        } while (i < n1);
        System.out.println("han aprobado "+ aprob + " alumnos");
        System.out.println("han suspendido "+ susp + " alumnos");
        float porc = (float) aprob / n1 * 100;
        System.out.println("el porcentaje de apronados es del " +porc+ "%");

    }
}
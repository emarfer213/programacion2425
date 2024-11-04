package b.tema3;

import comun.MiEntradaSalida;

public class ejercicio14 {
    private static int[] cola;
    private static int numElementos;
    public static final int size=5;
    public static int iPE = 0;
    public static void main(String[] args){
       cola = new int[size];
        encolar(7);
        encolar(1);
        encolar(4);
        encolar(2);
        encolar(5);
        encolar(8);
        System.out.println(desencolar());
        System.out.println(desencolar());
        System.out.println(desencolar());
        System.out.println(desencolar());
        System.out.println(desencolar());
        System.out.println(desencolar());

    }
    public static void encolar(int n){
        if (numElementos >= size){
            System.out.println("la cola esta llena");
        } else {
            cola[(iPE+numElementos)%size]=n;
            numElementos = numElementos+1;
        }
    }
    public static int desencolar(){
        int devolverElemento=-1;
        if (numElementos == 0){
            System.out.println("esta vacia");
        }
        else {
            devolverElemento=cola[iPE];
            iPE=(iPE+1)%size;
            numElementos = numElementos-1;
        }
        return devolverElemento;
    }
    /*public static void encolar2(int n){
        if (numElementos < size){
            cola[numElementos++] = n;

        } else {
            System.out.println("la cola esta llena");
        }
    }*/

    /*public static int desencolar2(){
        int devolverElemento=0;
        if (numElementos == 0){
        System.out.println("esta vacia");
        } else {
            devolverElemento = cola[0];
            for (int i = 0; i < numElementos-1; i++) {
                cola[i]=cola[i+1];
             }
            numElementos--;
         }
        return devolverElemento;
    }*/
}

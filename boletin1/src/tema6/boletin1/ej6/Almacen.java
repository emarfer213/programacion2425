package tema6.boletin1.ej6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Almacen {

    private List<Caja> listaDeCajas;
    private final static int maxCajas = 20;

    public Almacen(int numCaja) {
        if (numCaja <= 0 || numCaja > maxCajas) {
            throw new CajaException("el almacen debe tener entre 0 y " + maxCajas + " cajas");
        }
        this.listaDeCajas = new ArrayList<>(numCaja);
        for (int i = 0; i < numCaja; i++) {
            listaDeCajas.add(new Caja(i + 1));
        }
    }

    public void abrirCaja(int numCaja) {
        Caja c = listaDeCajas.stream()
                .filter(cajant -> cajant.getNumCaja() == numCaja)
                .findFirst()
                .orElseThrow(() -> new CajaException("error"));
        c.abrirCaja();
    }

    public void cerrarCaja(int numCaja) {
        Caja c = listaDeCajas.stream()
                .filter(cajant -> cajant.getNumCaja() == numCaja)
                .findFirst()
                .orElseThrow(() -> new CajaException("error"));
        c.cerrarCaja();
    }

    public void nuevoCliente() {
        Cliente cliente = new Cliente();
        Caja caja = listaDeCajas.stream()
                .filter(Caja::isAbierto)
                .min(Comparator.comparingInt(Caja::cantidadClientes))
                .orElseThrow(() -> new CajaException("no hay cajas abiertas"));
        caja.nuevoCliente(cliente);
    }

    public void atenderCliente(int numCaja) throws CajaException {
        Caja caja = listaDeCajas.stream()
                .filter(c -> c.getNumCaja() == numCaja)
                .findFirst()
                .orElseThrow(() -> new CajaException("No se encuentra la caja nº "+numCaja));
        Cliente clienteAtendido = caja.atenderCliente();
        System.out.println("Se ha atendido al cliente nº "+clienteAtendido.getNumCliente());
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Almacen almacen = new Almacen(maxCajas);
        int opcion;

        boolean salir;
        do {
            System.out.println("=== MENU ===");
            System.out.println("1. Abrir caja");
            System.out.println("2. Cerrar caja");
            System.out.println("3. Nuevo cliente");
            System.out.println("4. Atender cliente");
            System.out.println("5. Salir");
            opcion = sc.nextInt();

            try{
                switch (opcion){
                    case 1:
                        System.out.println("Indique el número de caja que desea abrir.");
                        int numCajaAbrir = sc.nextInt();
                        almacen.abrirCaja(numCajaAbrir);
                        System.out.println("Se ha abierto la caja nº "+numCajaAbrir);
                        break;

                    case 2:
                        System.out.println("Indique el número de caja que desea cerrar.");
                        int numCajaCerrar = sc.nextInt();
                        almacen.cerrarCaja(numCajaCerrar);
                        System.out.println("Se ha cerrado la caja nº "+numCajaCerrar);
                        break;

                    case 3:
                        almacen.nuevoCliente();
                        break;

                    case 4:
                        System.out.println("Indique el número de caja en la que atender.");
                        int numCajaAtender = sc.nextInt();
                        almacen.atenderCliente(numCajaAtender);
                        break;

                    case 5:
                        System.out.println("Saliendo...");
                        System.out.println("¡Hasta pronto!");
                        break;
                }
            }catch (CajaException e){
                System.out.println("Error: "+e.getMessage());
            }
        } while (opcion != 5);



    }

}

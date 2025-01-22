package tema4.mantenimiento_avion_emilio;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.Scanner;

public class Avion {
    private String marca;
    private String modelo;
    private double consumo;
    public Revision[] revisiones = new Revision[10];
    private Deposito depositoActual;
    Scanner sc = new Scanner(System.in);


    public Avion(String marca, String modelo, double consumo, double capacidadMaxima, double capacidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.depositoActual = new Deposito(capacidadMaxima, capacidadActual);
    }

    public int fechaMasReciente() {
        LocalDate contadorFecha = LocalDate.of(0, 1, 1);
        int posicion = 0;
        for (int i = 0; i < revisiones.length; i++) {
            if (revisiones[i] != null) {
                if (revisiones[i].getFecha().isAfter(contadorFecha)) {
                    contadorFecha = revisiones[i].getFecha();
                    posicion = i;
                }
            }
        }
        return posicion;
    }

    public boolean comprobaciones() {
        double distancia = sc.nextInt();
        LocalDate fechaActual = LocalDate.now();
        int diasTrascurridos = Period.between(revisiones[fechaMasReciente()].getFecha(), fechaActual).getDays();
        double gastoDelViaje = distancia * consumo;

        System.out.println(LocalDate.now().isBefore(revisiones[fechaMasReciente()].getFecha().plus(revisiones[fechaMasReciente()].getPeriodoValido())));

        if (!revisiones[fechaMasReciente()].isEstado()) {
            return false;
        }

        if (LocalDate.now().isAfter(revisiones[fechaMasReciente()].getFecha().plus(revisiones[fechaMasReciente()].getPeriodoValido()))) {
            return false;
        }

        if (depositoActual.getCapacidadActual() < gastoDelViaje) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Avion{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", depositoDeCombustible actual=" + depositoActual.getCapacidadActual() +
                ", registroDeRevisiones=" + revisiones[fechaMasReciente()].getPeriodoValido() +
                '}';
    }

}

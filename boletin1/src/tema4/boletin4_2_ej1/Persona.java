package tema4.boletin4_2_ej1;

import java.time.LocalDate;

public class Persona {
    String nombre;
    LocalDate fecha;
    int DNI;
    Character sexo;
    float altura;
    float peso;

    public Persona(String nombre, LocalDate fecha, int DNI, Character sexo, float altura, float peso) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.DNI = DNI;
        this.sexo = sexo;
        this.altura = altura;
        this.peso = peso;
    }

}

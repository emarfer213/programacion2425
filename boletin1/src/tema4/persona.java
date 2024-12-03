package tema4;


import java.time.LocalDate;
import java.util.Objects;

public class persona {
    private String nombre;
    private LocalDate fechaNacimiento;
    private String DNI;
    private String sexo;
    private float altura;
    private float peso;

    public persona(int year, int month, int day) throws personaException {
        this.setFechaNacimiento(year, month, day);


    }

    public void setFechaNacimiento(int year, int month, int day) throws personaException {
        this.fechaNacimiento = LocalDate.of(year, month, day);

        if (this.fechaNacimiento.isAfter(LocalDate.now())) {
            throw new personaException("esa fecha aun no ha llegado");
        } else if (LocalDate.now().minusYears(100).isAfter(this.fechaNacimiento)) {
            throw new personaException("no puede ser mas de 100 años");
        }
    }

    public void setDNI(String dni){
        if (dni.length()!=8){
            throw new personaException("DNI no valido");
        }
    }

    public String getDNI(){
        return DNI;
    }

    public char letraDNI(){
        int ultimaLetra = 0;

        return (char) ultimaLetra;
    }

    public void setSexo(String sexo) throws personaException {
        if (!Objects.equals(sexo, "M") && !Objects.equals(sexo, "F")) {
            throw new personaException("elige masculino o femenino");
        }

        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setAltura(float altura) throws personaException {
        if (altura == 0) {
            throw new personaException("tienes que elegir una altura");
        }

        this.altura = altura;
    }

    public float getAltura() {
        return altura;
    }

    public void setPeso(float peso) throws personaException {
        if (peso == 0) {
            throw new personaException("tienes que poner un peso valido");
        }

        this.peso = peso;
    }

    public float getPeso() {
        return peso;
    }



}

package ejercicio_interfaces_videojuegos;

import java.util.Scanner;

public class JuegoAccion extends Juego implements Actualizable {
    private int nivel;
    private String[] personajes;

    public JuegoAccion(String titulo, String equipoDesarrollo, double costoBase, int nivel) {
        super(titulo, equipoDesarrollo, costoBase);
        this.nivel = nivel;
        this.personajes = personajes;
    }

    public void anhadirPersonaje() {
        Scanner sc = new Scanner(System.in);
        String nombrePersonaje = sc.nextLine();
        boolean hayHueco = false;
        for (int i = 0; i < personajes.length; i++) {
            if (personajes[i] == null){
                personajes[i] = nombrePersonaje;
                hayHueco = true;
            }
        }
        if (!hayHueco){
            throw new JuegoException("no queda hueco");
        }
    }

    public String[] getPersonajes() {
        return personajes;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public void actualizar() {
        System.out.println("ha sido actualizado");
    }
}

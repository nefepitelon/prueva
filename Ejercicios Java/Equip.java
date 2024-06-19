//72 Crear una clase Jugador con variables nombre y puntaje.
//73 Crear una clase Equipo con una lista de jugadores.
//74 Crear un método en Equipo que imprima el nombre de todos los jugadores.

import java.util.ArrayList;
import java.util.List;

// Crear una clase Jugador con variables nombre y puntaje.
class Jugador {
    protected String nombre;
    protected int puntaje;

    // Constructor
    public Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public int getPuntaje() {
        return puntaje;
    }
}

// Crear una clase Equipo con una lista de jugadores.
public class Equip {
    private List<Jugador> jugadores;

    // Constructor
    public Equip() {
        jugadores = new ArrayList<>();
    }

    // Método para agregar un jugador al equipo
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

    // Crear un método en Equipo que imprima el nombre de todos los jugadores.
    public void imprimirNombresJugadores() {
        for (Jugador jugador : jugadores) {
            System.out.println("Jugador: " + jugador.getNombre());
            System.out.println();
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Equip equipo = new Equip(); // Crea un objeto Equipo

        equipo.agregarJugador(new Jugador("Lionel Messi", 95));
        equipo.agregarJugador(new Jugador("Cristiano Ronaldo", 93));
        equipo.agregarJugador(new Jugador("Neymar Jr.", 90));

        // Imprimir los nombres de los jugadores
        equipo.imprimirNombresJugadores();
    }
}

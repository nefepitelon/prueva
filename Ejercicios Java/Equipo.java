//20Crear una clase Jugador con variables nombre y puntaje.
//21Crear una clase Equipo con una lista de jugadores.
//22Crear un método en Equipo que imprima el nombre de todos los jugadores.

import java.util.ArrayList;
import java.util.List;

// Definición de la clase coche
 class Jugador {
    protected String nombre; // Variable de instancia para la marca
    protected int puntaje; // Variable de instancia para el modelo

    // Constructor para inicializar las variables
    public Jugador(String nombre, int puntaje) {
        this.nombre = nombre;
        this.puntaje = puntaje;
    }

    // Método para encapsuslar el marca del empleado
    public String getNombre() {
        return nombre;
    }

    // Método para encapsuslar el modelo del empleado
    public int getPuntaje() {
        return puntaje;
    }

} 


// Definición de la clase garaje y hereda de coche
public class Equipo {
    private List<Jugador> jugadores;//lista de coches

// Constructor para inicializar la lista de coches
    public Equipo() {
        jugadores = new ArrayList<>(); // Inicializa la lista de coches
    }

    // Método para añadir un coche a garaje
    public void añadirJugador(Jugador jugador) {
        jugadores.add(jugador);
    }

     // Método para imprimir las marcas y los modelos de todos los coches
    public void imprimirNombreEdad() {
        for (Jugador jugador : jugadores) {
            System.out.println("Nombre: " + jugador.getNombre()); // Imprime el marca de la Marca
            System.out.println("Puntaje: " + jugador.getPuntaje());// Imprime el marca de la Modelo
        }
    }
// Método principal para probar las clases
public static void main(String[] args) {
    Equipo equipo = new Equipo(); //Crea un objeto Garaje

   // Añadir coches al garaje
   equipo.añadirJugador(new Jugador("Juan", 25));
   equipo.añadirJugador(new Jugador("Pedro", 22));
   equipo.añadirJugador(new Jugador("Maria", 27));

    // Imprimir las marcas y los modelos de todos los coches
    equipo.imprimirNombreEdad(); // Llama al método para imprimir marcas y modelos
}
}
//85 Crear una clase Videojuego con variables nombre y genero.
//86 Crear una clase Coleccion con una lista de videojuegos.
//87 Crear un método en Coleccion que imprima el nombre de todos los videojuegos.

import java.util.ArrayList;
import java.util.List;

// Crear una clase Videojuego con variables nombre y genero.
class Videojuego {
    protected String nombre;
    protected String genero;

    // Constructor
    public Videojuego(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }
}

// Crear una clase Coleccion con una lista de videojuegos.
public class Coleccio {
    private List<Videojuego> videojuegos;

    // Constructor
    public Coleccio() {
        videojuegos = new ArrayList<>();
    }

    // Método para agregar un videojuego a la colección
    public void agregarVideojuego(Videojuego videojuego) {
        videojuegos.add(videojuego);
    }

    // Crear un método en Coleccion que imprima el nombre de todos los videojuegos.
    public void imprimirNombresVideojuegos() {
        for (Videojuego videojuego : videojuegos) {
            System.out.println("Nombre: " + videojuego.getNombre());
            System.out.println();
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Coleccio coleccion = new Coleccio(); // Crea un objeto Coleccion

        coleccion.agregarVideojuego(new Videojuego("The Legend of Zelda", "Aventura"));
        coleccion.agregarVideojuego(new Videojuego("Super Mario Bros.", "Plataformas"));
        coleccion.agregarVideojuego(new Videojuego("Call of Duty", "Shooter"));

        // Imprimir los nombres de los videojuegos
        coleccion.imprimirNombresVideojuegos();
    }
}

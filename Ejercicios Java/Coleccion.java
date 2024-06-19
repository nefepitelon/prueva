//33Crear una clase Videojuego con variables nombre y genero.
//34Crear una clase Coleccion con una lista de videojuegos.
//35Crear un método en Coleccion que imprima el nombre de todos los videojuegos.

import java.util.ArrayList;
import java.util.List;

// Definición de la clase coche
 class Videojuego {
    protected String nombre; // Variable de instancia para la marca
    protected String genero; // Variable de instancia para el modelo

    // Constructor para inicializar las variables
    public Videojuego(String nombre, String genero) {
        this.nombre = nombre;
        this.genero = genero;
    }

    // Método para encapsuslar el marca del empleado
    public String getNombre() {
        return nombre;
    }

    // Método para encapsuslar el modelo del empleado
    public String getPuntaje() {
        return genero;
    }

} 


// Definición de la clase garaje y hereda de coche
public class Coleccion {
    private List<Videojuego> videojuegos;//lista de coches

// Constructor para inicializar la lista de coches
    public Coleccion() {
        videojuegos = new ArrayList<>(); // Inicializa la lista de coches
    }

    // Método para añadir un coche a garaje
    public void añadirVideojuego(Videojuego videojuego) {
        videojuegos.add(videojuego);
    }

     // Método para imprimir las marcas y los modelos de todos los coches
    public void imprimirNombreGenero() {
        for (Videojuego videojuego : videojuegos) {
            System.out.println("Nombre: " + videojuego.getNombre()); // Imprime el marca de la Marca
            System.out.println("genero: " + videojuego.getPuntaje());// Imprime el marca de la Modelo
        }
    }
// Método principal para probar las clases
public static void main(String[] args) {
    Coleccion coleccion = new Coleccion(); //Crea un objeto Garaje

   // Añadir coches al garaje
   coleccion.añadirVideojuego(new Videojuego("forza", "carreras"));
   coleccion.añadirVideojuego(new Videojuego("halo", "disparos"));
   coleccion.añadirVideojuego(new Videojuego("zelda", "mundo libre"));

    // Imprimir las marcas y los modelos de todos los coches
    coleccion.imprimirNombreGenero(); // Llama al método para imprimir marcas y modelos
}
}
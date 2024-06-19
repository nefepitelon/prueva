//40Crear una clase Pelicula con variables titulo, director y duracion.
//41Crear un método en Pelicula que imprima el título y el director.
//42Crear una clase Cine con una lista de películas.
//43Crear un método en Cine que imprima el título y el director de todas las películas.

import java.util.ArrayList;
import java.util.List;

// Definición de la clase Libro
class Pelicula {
    private String titulo; // Variable de instancia para el título
    private String director; // Variable de instancia para el autor
    private int duracion; // Variable de instancia para el número de páginas

    // Constructor para inicializar las variables
    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    // Método para obtener el título del libro
    public String getTitulo() {
        return titulo;
    }

    // Método para obtener el director del libro
    public String getDirector() {
        return director;
    }

    // Método para obtener el número de páginas del libro
    public int getduracion() {
        return duracion;
    }

    // Método para imprimir el título y el director del libro
    public void imprimirTituloYdirector() {
        System.out.println("Título: " + titulo + ", director: " + director);
    }
}

// Definición de la clase Biblioteca
public class Cine {
    private List<Pelicula> peliculas; // Lista de libros

    // Constructor para inicializar la lista de libros
    public Cine() {
        peliculas = new ArrayList<>(); // Inicializa la lista de libros
    }

    // Método para añadir un libro a la biblioteca
    public void añadirPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    // Método para imprimir el título y el director de todos los libros
    public void imprimirTodosLosLibros() {
        for (Pelicula pelicula : peliculas) {
            pelicula.imprimirTituloYdirector(); // Llama al método para imprimir título y director
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Cine cine = new Cine(); // Crea un objeto Biblioteca

        // Añadir libros a la biblioteca con títulos, directores y número de páginas específicas
        cine.añadirPelicula(new Pelicula("El Quijote", "Miguel de Cervantes", 1072));
        cine.añadirPelicula(new Pelicula("Cien años de soledad", "Gabriel García Márquez", 471));
        cine.añadirPelicula(new Pelicula("Donde los árboles cantan", "Laura Gallego", 477));

        // Imprimir los títulos y directores de todos los libros
        cine.imprimirTodosLosLibros(); // Llama al método para imprimir títulos y directores
    }
}

//Crear una clase Libro con variables titulo y autor.

//Crear una clase Biblioteca con una lista de libros.
//Crear un método en Biblioteca que imprima el título de todos los libros.

import java.util.ArrayList;
import java.util.List;

// Clase Libro
class Libro {
    protected String titulo;
    protected String autor;

    // Constructor
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

        // Getters
        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }
    }

// Clase    
public class Biblioteca {
    private List<Libro> libros;

    // Constructor
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    
    public void imprimirLibroAutor() {
        for (Libro libro : libros) {
            System.out.println("libro: " + libro.getTitulo()); // Imprime el marca de la Marca
            System.out.println("autor: " + libro.getAutor());// Imprime el marca de la Modelo
        }
    }


// Método principal para probar las clases
public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca(); //Crea un objeto Garaje

    biblioteca.agregarLibro(new Libro("El Quijote", "Miguel de Cervantes"));
    biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez"));
    biblioteca.agregarLibro(new Libro("Donde los árboles cantan", "Laura Gallego"));
      
        // Imprimir los títulos de los libros
        biblioteca.imprimirLibroAutor();
    }
}
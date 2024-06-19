//88 Crear una clase Libro con variables titulo, autor y num_paginas.
//89 Crear un método en Libro que imprima el título y el autor.
//90 Crear una clase Biblioteca con una lista de libros.
//91 Crear un método en Biblioteca que imprima el título y el autor de todos los libros.


import java.util.ArrayList;
import java.util.List;

//88 Crear una clase Libro con variables titulo, autor y num_paginas.
class Libro {
    protected String titulo;
    protected String autor;
    protected int num_paginas;

    // Constructor
    public Libro(String titulo, String autor, int num_paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.num_paginas = num_paginas;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return num_paginas;
    }

    //89 Crear un método en Libro que imprima el título y el autor.
    public void imprimirTituloAutor() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}

//90 Crear una clase Biblioteca con una lista de libros.
public class Bibliot {
    private List<Libro> libros;

    // Constructor
    public Bibliot() {
        libros = new ArrayList<>();
    }

    // Método para agregar un libro a la biblioteca
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    //91 Crear un método en Biblioteca que imprima el título y el autor de todos los libros.
    public void imprimirTitulosAutoresLibros() {
        for (Libro libro : libros) {
            libro.imprimirTituloAutor();
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Bibliot biblioteca = new Bibliot(); // Crea un objeto Biblioteca

        biblioteca.agregarLibro(new Libro("El Quijote", "Miguel de Cervantes", 863));
        biblioteca.agregarLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 417));
        biblioteca.agregarLibro(new Libro("Donde los árboles cantan", "Laura Gallego", 477));

        // Imprimir los títulos y los autores de los libros
        biblioteca.imprimirTitulosAutoresLibros();
    }
}

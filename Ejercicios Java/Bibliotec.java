//36Crear una clase Libro con variables titulo, autor y num_paginas.
//37Crear un método en Libro que imprima el título y el autor.
//38Crear una clase Biblioteca con una lista de libros.
//39Crear un método en Biblioteca que imprima el título y el autor de todos los libros.

import java.util.ArrayList;
import java.util.List;

// Definición de la clase Libro
class Libro {
    private String titulo; // Variable de instancia para el título
    private String autor; // Variable de instancia para el autor
    private int numPaginas; // Variable de instancia para el número de páginas

    // Constructor para inicializar las variables
    public Libro(String titulo, String autor, int numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    // Método para obtener el título del libro
    public String getTitulo() {
        return titulo;
    }

    // Método para obtener el autor del libro
    public String getAutor() {
        return autor;
    }

    // Método para obtener el número de páginas del libro
    public int getNumPaginas() {
        return numPaginas;
    }

    // Método para imprimir el título y el autor del libro
    public void imprimirTituloYAutor() {
        System.out.println("Título: " + titulo + ", Autor: " + autor);
    }
}

// Definición de la clase Biblioteca
public class Bibliotec {
    private List<Libro> libros; // Lista de libros

    // Constructor para inicializar la lista de libros
    public Bibliotec() {
        libros = new ArrayList<>(); // Inicializa la lista de libros
    }

    // Método para añadir un libro a la biblioteca
    public void añadirLibro(Libro libro) {
        libros.add(libro);
    }

    // Método para imprimir el título y el autor de todos los libros
    public void imprimirTodosLosLibros() {
        for (Libro libro : libros) {
            libro.imprimirTituloYAutor(); // Llama al método para imprimir título y autor
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Bibliotec biblioteca = new Bibliotec(); // Crea un objeto Biblioteca

        // Añadir libros a la biblioteca con títulos, autores y número de páginas específicas
        biblioteca.añadirLibro(new Libro("El Quijote", "Miguel de Cervantes", 1072));
        biblioteca.añadirLibro(new Libro("Cien años de soledad", "Gabriel García Márquez", 471));
        biblioteca.añadirLibro(new Libro("Donde los árboles cantan", "Laura Gallego", 477));

        // Imprimir los títulos y autores de todos los libros
        biblioteca.imprimirTodosLosLibros(); // Llama al método para imprimir títulos y autores
    }
}

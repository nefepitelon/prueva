//92 Crear una clase Pelicula con variables titulo, director y duracion.
//93 Crear un método en Pelicula que imprima el título y el director.
//94 Crear una clase Cine con una lista de películas.
//95 Crear un método en Cine que imprima el título y el director de todas las películas.


import java.util.ArrayList;
import java.util.List;

//92 Crear una clase Pelicula con variables titulo, director y duracion.
class Pelicula {
    protected String titulo;
    protected String director;
    protected int duracion; // duración en minutos

    // Constructor
    public Pelicula(String titulo, String director, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public int getDuracion() {
        return duracion;
    }

    //93 Crear un método en Pelicula que imprima el título y el director.
    public void imprimirTituloDirector() {
        System.out.println("Título: " + titulo);
        System.out.println("Director: " + director);
    }
}

//94 Crear una clase Cine con una lista de películas.
public class Cin {
    private List<Pelicula> peliculas;

    // Constructor
    public Cin() {
        peliculas = new ArrayList<>();
    }

    // Método para agregar una película al cine
    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    //95 Crear un método en Cine que imprima el título y el director de todas las películas.
    public void imprimirTitulosDirectoresPeliculas() {
        for (Pelicula pelicula : peliculas) {
            pelicula.imprimirTituloDirector();
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Cin cine = new Cin(); // Crea un objeto Cine

        cine.agregarPelicula(new Pelicula("Inception", "Christopher Nolan", 148));
        cine.agregarPelicula(new Pelicula("The Godfather", "Francis Ford Coppola", 175));
        cine.agregarPelicula(new Pelicula("Pulp Fiction", "Quentin Tarantino", 154));

        // Imprimir los títulos y los directores de las películas
        cine.imprimirTitulosDirectoresPeliculas();
    }
}

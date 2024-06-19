
//44 Crear una clase Cancion con variables titulo, artista y duracion.
//45 Crear un método en Cancion que imprima el título y el artista.
//46 Crear una clase Playlist con una lista de canciones.
//47 Crear un método en Playlist que imprima el título de todas las canciones.


import java.util.ArrayList;
import java.util.List;

// Definición de la clase Cancion
class Cancion {
    private String titulo; // Variable de instancia para el título
    private String artista; // Variable de instancia para el artista
    private int duracion; // Variable de instancia para la duración de la canción

    // Constructor para inicializar las variables
    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    // Método para obtener el título de la canción
    public String getTitulo() {
        return titulo;
    }

    // Método para obtener el artista de la canción
    public String getArtista() {
        return artista;
    }

    // Método para obtener la duración de la canción
    public int getDuracion() {
        return duracion;
    }

    // Método para imprimir el título y el artista de la canción
    public void imprimirTituloYArtista() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println();
    }
}

// Definición de la clase Playlist
public class Playlist {
    private List<Cancion> canciones; // Lista de canciones

    // Constructor para inicializar la lista de canciones
    public Playlist() {
        canciones = new ArrayList<>(); // Inicializa la lista de canciones
    }

    // Método para añadir una canción a la playlist
    public void añadirCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    // Método para imprimir el título y el artista de todas las canciones
    public void imprimirTodasLasCanciones() {
        for (Cancion cancion : canciones) {
            cancion.imprimirTituloYArtista(); // Llama al método para imprimir título y artista
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Playlist playlist = new Playlist(); // Crea un objeto Playlist

        // Añadir canciones a la playlist con títulos, artistas y duración específicas
        playlist.añadirCancion(new Cancion("Bohemian Rhapsody", "Queen", 354));
        playlist.añadirCancion(new Cancion("Imagine", "John Lennon", 183));
        playlist.añadirCancion(new Cancion("Stairway to Heaven", "Led Zeppelin", 482));

        // Imprimir los títulos y artistas de todas las canciones
        playlist.imprimirTodasLasCanciones(); // Llama al método para imprimir títulos y artistas
    }
}

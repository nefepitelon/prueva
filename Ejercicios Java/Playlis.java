//96 Crear una clase Cancion con variables titulo, artista y duracion.
//97 Crear un método en Cancion que imprima el título y el artista.
//98 Crear una clase Playlist con una lista de canciones.
//99 Crear un método en Playlist que imprima el título de todas las canciones.


import java.util.ArrayList;
import java.util.List;

//96 Crear una clase Cancion con variables titulo, artista y duracion.
class Cancion {
    protected String titulo;
    protected String artista;
    protected int duracion; // duración en segundos

    // Constructor
    public Cancion(String titulo, String artista, int duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getArtista() {
        return artista;
    }

    public int getDuracion() {
        return duracion;
    }

    //97 Crear un método en Cancion que imprima el título y el artista.
    public void imprimirTituloArtista() {
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
    }
}

//98 Crear una clase Playlist con una lista de canciones.
public class Playlis {
    private List<Cancion> canciones;

    // Constructor
    public Playlis() {
        canciones = new ArrayList<>();
    }

    // Método para agregar una canción a la playlist
    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    //99 Crear un método en Playlist que imprima el título de todas las canciones.
    public void imprimirTitulosCanciones() {
        for (Cancion cancion : canciones) {
            System.out.println("Título: " + cancion.getTitulo());
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Playlis playlist = new Playlis(); // Crea un objeto Playlist

        playlist.agregarCancion(new Cancion("Bohemian Rhapsody", "Queen", 354));
        playlist.agregarCancion(new Cancion("Stairway to Heaven", "Led Zeppelin", 482));
        playlist.agregarCancion(new Cancion("Hotel California", "Eagles", 390));

        // Imprimir los títulos de las canciones
        playlist.imprimirTitulosCanciones();
    }
}

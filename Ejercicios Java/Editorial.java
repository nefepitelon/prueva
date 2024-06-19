
//48 Crear una clase Autor con variables nombre y nacionalidad.
//49 Crear una clase Editorial con una lista de autores.
//50 Crear un método en Editorial que imprima el nombre de todos los autores.

import java.util.ArrayList;
import java.util.List;

// Definición de la clase Autor
class Autor {
    private String nombre; // Variable de instancia para el nombre
    private String nacionalidad; // Variable de instancia para la nacionalidad

    // Constructor para inicializar las variables
    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Método para obtener el nombre del autor
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la nacionalidad del autor
    public String getNacionalidad() {
        return nacionalidad;
    }
}

// Definición de la clase Editorial que es pública
public class Editorial {
    private List<Autor> autores; // Lista de autores

    // Constructor para inicializar la lista de autores
    public Editorial() {
        autores = new ArrayList<>(); // Inicializa la lista de autores
    }

    // Método para añadir un autor a la editorial
    public void añadirAutor(Autor autor) {
        autores.add(autor);
    }

    // Método para imprimir los nombres y nacionalidades de todos los autores
    public void imprimirNombresNacionalidades() {
        for (Autor autor : autores) {
            System.out.println("Nombre: " + autor.getNombre());
            System.out.println("Nacionalidad: " + autor.getNacionalidad()); // Imprime el nombre y la nacionalidad del autor
            System.out.println();
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Editorial editorial = new Editorial(); // Crea un objeto Editorial

        // Añadir autores a la editorial
        editorial.añadirAutor(new Autor("Juan", "Española"));
        editorial.añadirAutor(new Autor("Ana", "Argentina"));
        editorial.añadirAutor(new Autor("Luis", "Mexicana"));

        // Imprimir los nombres y nacionalidades de todos los autores
        editorial.imprimirNombresNacionalidades(); // Llama al método para imprimir nombres y nacionalidades
    }
}


//57 Crear una clase Persona con variables nombre y edad.
//58 Crear una clase Estudiante que herede de Persona y añadir la variable carrera.
//59 Crear un método en Estudiante que imprima los detalles del estudiante.

// Definición de la clase Persona
import java.util.ArrayList;
import java.util.List;

// Definición de la clase Persona
class Persona {
    protected String nombre; // Variable de instancia para el nombre
    protected int edad; // Variable de instancia para la edad

    // Constructor para inicializar las variables
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener el nombre de la persona
    public String getNombre() {
        return nombre;
    }

    // Método para obtener la edad de la persona
    public int getEdad() {
        return edad;
    }
}

// Definición de la clase Estudiante que hereda de Persona
class Estudiante extends Persona {
    private String carrera; // Variable de instancia adicional para la carrera

    // Constructor para inicializar las variables, incluyendo las de la clase base
    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad); // Inicializa nombre y edad en la clase base
        this.carrera = carrera;
    }

    // Método para obtener la carrera del estudiante
    public String getCarrera() {
        return carrera;
    }

    // Método para imprimir los detalles del estudiante
    public void imprimirDetalles() {
        System.out.println("Nombre: " + getNombre()); // Imprime el nombre
        System.out.println("Edad: " + getEdad()); // Imprime la edad
        System.out.println("Carrera: " + getCarrera()); // Imprime la carrera
        System.out.println();
    }
}

// Definición de la clase ListaEstudiantes para gestionar la lista de estudiantes
public class ListaEstudiantes {
    private List<Estudiante> estudiantes; // Lista de estudiantes

    // Constructor para inicializar la lista de estudiantes
    public ListaEstudiantes() {
        estudiantes = new ArrayList<>(); // Inicializa la lista de estudiantes
    }

    // Método para añadir un estudiante a la lista
    public void añadirEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    // Método para imprimir los detalles de todos los estudiantes
    public void imprimirDetallesEstudiantes() {
        for (Estudiante estudiante : estudiantes) {
            estudiante.imprimirDetalles();
            System.out.println(); // Espacio entre estudiantes
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        ListaEstudiantes listaEstudiantes = new ListaEstudiantes(); // Crea un objeto ListaEstudiantes

        // Añadir estudiantes a la lista
        listaEstudiantes.añadirEstudiante(new Estudiante("Ana", 20, "Ingeniería"));
        listaEstudiantes.añadirEstudiante(new Estudiante("Luis", 22, "Medicina"));

        // Imprimir los detalles de todos los estudiantes
        listaEstudiantes.imprimirDetallesEstudiantes(); // Llama al método para imprimir detalles de los estudiantes
    }
}


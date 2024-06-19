//29Crear una clase Alumno con variables nombre y calificaciones.
//30Crear un método en Alumno que calcule el promedio de las calificaciones.
//31Crear una clase Curso con una lista de alumnos.
//32Crear un método en Curso que imprima el nombre de todos los alumnos.

import java.util.ArrayList;
import java.util.List;

// Definición de la clase Alumno
class Alumno {
    protected String nombre; // Variable de instancia para el nombre
    protected List<Double> calificaciones; // Variable de instancia para las calificaciones

    // Constructor para inicializar las variables
    public Alumno(String nombre, List<Double> calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Método para obtener el nombre del alumno
    public String getNombre() {
        return nombre;
    }

    // Método para obtener las calificaciones del alumno
    public List<Double> getCalificaciones() {
        return calificaciones;
    }

    // Método para calcular el promedio de las calificaciones
    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.size();
    }
}

// Definición de la clase Curso
public class Curso {
    private List<Alumno> alumnos; // lista de alumnos

    // Constructor para inicializar la lista de alumnos
    public Curso() {
        alumnos = new ArrayList<>(); // Inicializa la lista de alumnos
    }

    // Método para añadir un alumno al curso
    public void añadirAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    // Método para imprimir los nombres y el promedio de las calificaciones de todos los alumnos
    public void imprimirNombrePromedio() {
        for (Alumno alumno : alumnos) {
            System.out.println("Nombre: " + alumno.getNombre()); // Imprime el nombre del alumno
            System.out.println("Promedio: " + alumno.calcularPromedio()); // Imprime el promedio de las calificaciones del alumno
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Curso curso = new Curso(); // Crea un objeto Curso

        // Añadir alumnos al curso con nombres y calificaciones específicas
        curso.añadirAlumno(new Alumno("Juan", List.of(85.0, 90.0, 78.0)));
        curso.añadirAlumno(new Alumno("Pedro", List.of(88.0, 92.0, 80.0)));
        curso.añadirAlumno(new Alumno("María", List.of(95.0, 85.0, 89.0)));

        // Imprimir los nombres y los promedios de todos los alumnos
        curso.imprimirNombrePromedio(); // Llama al método para imprimir nombres y promedios
    }
}

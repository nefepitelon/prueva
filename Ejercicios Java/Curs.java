//81 Crear una clase Alumno con variables nombre y calificaciones.
//82 Crear un método en Alumno que calcule el promedio de las calificaciones.
//83 Crear una clase Curso con una lista de alumnos.
//84 Crear un método en Curso que imprima el nombre de todos los alumnos.

import java.util.ArrayList;
import java.util.List;

// Crear una clase Alumno con variables nombre y calificaciones.
class Alumno {
    protected String nombre;
    protected List<Double> calificaciones;

    // Constructor
    public Alumno(String nombre, List<Double> calificaciones) {
        this.nombre = nombre;
        this.calificaciones = calificaciones;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public List<Double> getCalificaciones() {
        return calificaciones;
    }

    // Crear un método en Alumno que calcule el promedio de las calificaciones.
    public double calcularPromedio() {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.size();
    }
}

// Crear una clase Curso con una lista de alumnos.
public class Curs {
    private List<Alumno> alumnos;

    // Constructor
    public Curs() {
        alumnos = new ArrayList<>();
    }

    // Método para agregar un alumno al curso
    public void agregarAlumno(Alumno alumno) {
        alumnos.add(alumno);
    }

    // Crear un método en Curso que imprima el nombre de todos los alumnos.
    public void imprimirNombresAlumnos() {
        for (Alumno alumno : alumnos) {
            System.out.println("Alumno: " + alumno.getNombre());
            System.out.println("Promedio: " + alumno.calcularPromedio());
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Curs curso = new Curs(); // Crea un objeto Curso

        curso.agregarAlumno(new Alumno("Juan Pérez", List.of(85.0, 90.0, 78.0)));
        curso.agregarAlumno(new Alumno("María Gómez",List.of(88.0, 92.0, 80.0)));
        curso.agregarAlumno(new Alumno("Carlos Ruiz", List.of(95.0, 85.0, 89.0)));

        // Imprimir los nombres de los alumnos
        curso.imprimirNombresAlumnos();
    }
}

class Persona {
    protected String nombre; // Variable de instancia para el nombre
    protected int edad; // Variable de instancia para la edad

    // Constructor para inicializar las variables
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
}

// Definición de la clase Estudiante que hereda de Persona
public class Estudiante extends Persona {
    private String grado; // Variable de instancia adicional para el grado

    // Constructor para inicializar las variables, incluyendo las de la clase base
    public Estudiante(String nombre, int edad, String grado) {
        super(nombre, edad); // Inicializa nombre y edad en la clase base
        this.grado = grado;
    }

    // Método para imprimir los detalles del estudiante
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre); // Imprime el nombre
        System.out.println("Edad: " + edad); // Imprime la edad
        System.out.println("Grado: " + grado); // Imprime el grado
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Ana", 20, "Segundo año"); // Crea un objeto Estudiante
        estudiante.imprimirDetalles(); // Imprime los detalles del estudiante
    }
}
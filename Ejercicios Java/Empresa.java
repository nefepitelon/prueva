import java.util.ArrayList;
import java.util.List;

// Definición de la clase Empleado
class Empleado {
    private String nombre; // Variable de instancia para el nombre
    private double salario; // Variable de instancia para el salario

    // Constructor para inicializar las variables
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    // Método para encapsuslar el nombre del empleado
    public String getNombre() {
        return nombre;
    }

    // Método para encapsuslar el salario del empleado
    public double getSalario() {
        return salario;
    }
}

// Definición de la clase Empresa que es pública
public class Empresa {
    private List<Empleado> empleados; // Lista de empleados

    // Constructor para inicializar la lista de empleados
    public Empresa() {
        empleados = new ArrayList<>(); // Inicializa la lista de empleados
    }

    // Método para añadir un empleado a la empresa
    public void añadirEmpleado(Empleado empleado) {
        empleados.add(empleado);
    }

    // Método para imprimir los nombres de todos los empleados
    public void imprimirNombresEmpleados() {
        for (Empleado empleado : empleados) {
            System.out.println("Nombre: " + empleado.getNombre()); // Imprime el nombre del empleado
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Empresa empresa = new Empresa(); // Crea un objeto Empresa

        // Añadir empleados a la empresa
        empresa.añadirEmpleado(new Empleado("Juan", 50000));
        empresa.añadirEmpleado(new Empleado("Ana", 60000));
        empresa.añadirEmpleado(new Empleado("Luis", 55000));

        // Imprimir los nombres de todos los empleados
        empresa.imprimirNombresEmpleados(); // Llama al método para imprimir nombres
    }
}
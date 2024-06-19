//51 Crear una clase Cliente con variables nombre y email.
//52 Crear una clase Orden con una lista de clientes.
//53 Crear un método en Orden que imprima el nombre de todos los clientes.

import java.util.ArrayList;
import java.util.List;

// Definición de la clase Cliente
class Cliente {
    private String nombre; // Variable de instancia para el nombre
    private String email; // Variable de instancia para el email

    // Constructor para inicializar las variables
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Método para obtener el nombre del Cliente
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el email del Cliente
    public String getEmail() {
        return email;
    }
}

// Definición de la clase Orden que es pública
public class Orden {
    private List<Cliente> clientes; // Lista de clientes

    // Constructor para inicializar la lista de clientes
    public Orden() {
        clientes = new ArrayList<>(); // Inicializa la lista de clientes
    }

    // Método para añadir un cliente a la orden
    public void añadirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    // Método para imprimir los nombres y emails de todos los clientes
    public void imprimirNombresEmails() {
        for (Cliente cliente : clientes) {
            System.out.println("Nombre: " + cliente.getNombre());
            System.out.println();
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Orden orden = new Orden(); // Crea un objeto Orden

        // Añadir clientes a la orden
        orden.añadirCliente(new Cliente("Juan", "juan@example.com"));
        orden.añadirCliente(new Cliente("Ana", "ana@example.com"));
        orden.añadirCliente(new Cliente("Luis", "luis@example.com"));

        // Imprimir los nombres y emails de todos los clientes
        orden.imprimirNombresEmails(); // Llama al método para imprimir nombres y emails
    }
}



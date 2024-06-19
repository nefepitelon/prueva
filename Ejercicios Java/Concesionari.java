//78 Crear una clase Vehiculo con variables marca y modelo.
//79 Crear una clase Concesionario con una lista de vehículos.
//80 Crear un método en Concesionario que imprima la marca y el modelo de todos los vehículos.

import java.util.ArrayList;
import java.util.List;

// Crear una clase Vehiculo con variables marca y modelo.
class Vehiculo {
    protected String marca;
    protected String modelo;

    // Constructor
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }
}

// Crear una clase Concesionario con una lista de vehículos.
public class Concesionari {
    private List<Vehiculo> vehiculos;

    // Constructor
    public Concesionari() {
        vehiculos = new ArrayList<>();
    }

    // Método para agregar un vehículo al concesionario
    public void agregarVehiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

    // Crear un método en Concesionario que imprima la marca y el modelo de todos los vehículos.
    public void imprimirMarcasModelosVehiculos() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("Marca: " + vehiculo.getMarca());
            System.out.println("Modelo: " + vehiculo.getModelo());
            System.out.println();
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Concesionari concesionario = new Concesionari(); // Crea un objeto Concesionario

        concesionario.agregarVehiculo(new Vehiculo("Toyota", "Corolla"));
        concesionario.agregarVehiculo(new Vehiculo("Ford", "Mustang"));
        concesionario.agregarVehiculo(new Vehiculo("Chevrolet", "Camaro"));

        // Imprimir las marcas y los modelos de los vehículos
        concesionario.imprimirMarcasModelosVehiculos();
    }
}

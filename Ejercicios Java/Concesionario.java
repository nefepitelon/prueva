//26Crear una clase Vehiculo con variables marca y modelo.
//27Crear una clase Concesionario con una lista de vehículos.
//28Crear un método en Concesionario que imprima la marca y el modelo de todos los vehículos.

import java.util.ArrayList;
import java.util.List;

// Definición de la clase coche
 class Vehiculo {
    protected String marca; // Variable de instancia para la marca
    protected int modelo; // Variable de instancia para el modelo

    // Constructor para inicializar las variables
    public Vehiculo(String marca, int modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para encapsuslar el marca del empleado
    public String getMarca() {
        return marca;
    }

    // Método para encapsuslar el modelo del empleado
    public int getModelo() {
        return modelo;
    }

} 


// Definición de la clase garaje y hereda de coche
public class Concesionario {
    private List<Vehiculo> vehiculos;//lista de coches

// Constructor para inicializar la lista de coches
    public Concesionario() {
        vehiculos = new ArrayList<>(); // Inicializa la lista de coches
    }

    // Método para añadir un coche a garaje
    public void añadirVeiculo(Vehiculo vehiculo) {
        vehiculos.add(vehiculo);
    }

     // Método para imprimir las marcas y los modelos de todos los coches
    public void imprimirNombreEdad() {
        for (Vehiculo vehiculo : vehiculos) {
            System.out.println("marca: " + vehiculo.getMarca()); // Imprime el marca de la Marca
            System.out.println("modelo: " + vehiculo.getModelo());// Imprime el marca de la Modelo
        }
    }
// Método principal para probar las clases
public static void main(String[] args) {
    Concesionario concesionario = new Concesionario(); //Crea un objeto Garaje

   // Añadir coches al garaje
   concesionario.añadirVeiculo(new Vehiculo("Hyundai", 2020));
   concesionario.añadirVeiculo(new Vehiculo("Chevrolet", 2019));
   concesionario.añadirVeiculo(new Vehiculo("BMW", 2021));

    // Imprimir las marcas y los modelos de todos los coches
    concesionario.imprimirNombreEdad(); // Llama al método para imprimir marcas y modelos
}
}
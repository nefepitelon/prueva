//63 Crear una clase Coche con variables marca y modelo.
//64 Crear una clase Garaje con una lista de coches.
//65 Crear un método en Garaje que imprima la marca y el modelo de todos los coches.

import java.util.ArrayList;
import java.util.List;

// Definición de la clase coche
 class Coche {
    protected String marca; // Variable de instancia para la marca
    protected double modelo; // Variable de instancia para el modelo

    // Constructor para inicializar las variables
    public Coche(String marca, double modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método para encapsuslar el marca del empleado
    public String getMarca() {
        return marca;
    }

    // Método para encapsuslar el modelo del empleado
    public double getModelo() {
        return modelo;
    }

} 


// Definición de la clase garaje y hereda de coche
public class Parqueadero {
    private List<Coche> coches;//lista de coches

// Constructor para inicializar la lista de coches
    public Parqueadero() {
        coches = new ArrayList<>(); // Inicializa la lista de coches
    }

    // Método para añadir un coche a garaje
    public void añadirCoche(Coche coche) {
        coches.add(coche);
    }

     // Método para imprimir las marcas y los modelos de todos los coches
    public void imprimirmarcasModelo() {
        for (Coche coche : coches) {
            System.out.println("Marca: " + coche.getMarca()); // Imprime el marca de la Marca
            System.out.println("Modelo: " + coche.getModelo());// Imprime el marca de la Modelo
            System.out.println();
        }
    }
// Método principal para probar las clases
public static void main(String[] args) {
    Garaje garaje = new Garaje(); //Crea un objeto Garaje

   // Añadir coches al garaje
    garaje.añadirCoche(new Coche("Hyundai", 2020));
    garaje.añadirCoche(new Coche("Chevrolet", 2019));
    garaje.añadirCoche(new Coche("BMW", 2021));

    // Imprimir las marcas y los modelos de todos los coches
    garaje.imprimirmarcasModelo(); // Llama al método para imprimir marcas y modelos
}
}
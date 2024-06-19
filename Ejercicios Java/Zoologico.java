//17Crear una clase Animal con variables especie y edad.
//18Crear una clase Zoologico con una lista de animales.
//19Crear un método en Zoologico que imprima la especie de todos los animales.

import java.util.ArrayList;
import java.util.List;

// Definición de la clase coche
 class Animal {
    protected String especie; // Variable de instancia para la marca
    protected int edad; // Variable de instancia para el modelo

    // Constructor para inicializar las variables
    public Animal(String especie, int edad) {
        this.especie = especie;
        this.edad = edad;
    }

    // Método para encapsuslar el marca del empleado
    public String getEspecie() {
        return especie;
    }

    // Método para encapsuslar el modelo del empleado
    public int getEdad() {
        return edad;
    }

} 


// Definición de la clase garaje y hereda de coche
public class Zoologico {
    private List<Animal> animales;//lista de coches

// Constructor para inicializar la lista de coches
    public Zoologico() {
        animales = new ArrayList<>(); // Inicializa la lista de coches
    }

    // Método para añadir un coche a garaje
    public void añadirAnimal(Animal animal) {
        animales.add(animal);
    }

     // Método para imprimir las marcas y los modelos de todos los coches
    public void imprimirNombreEdad() {
        for (Animal animal : animales) {
            System.out.println("Animal: " + animal.getEspecie()); // Imprime el marca de la Marca
            System.out.println("Edad: " + animal.getEdad());// Imprime el marca de la Modelo
        }
    }
// Método principal para probar las clases
public static void main(String[] args) {
    Zoologico zoologico = new Zoologico(); //Crea un objeto Garaje

   // Añadir coches al garaje
   zoologico.añadirAnimal(new Animal("Leon", 5));
   zoologico.añadirAnimal(new Animal("Jirafa", 3));
   zoologico.añadirAnimal(new Animal("Tigre", 4));

    // Imprimir las marcas y los modelos de todos los coches
    zoologico.imprimirNombreEdad(); // Llama al método para imprimir marcas y modelos
}
}
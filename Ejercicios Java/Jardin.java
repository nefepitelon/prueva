//23Crear una clase Planta con variables tipo y altura.
//24Crear una clase Jardin con una lista de plantas.
//25Crear un método en Jardin que imprima el tipo de todas las plantas.

import java.util.ArrayList;
import java.util.List;

// Definición de la clase coche
 class Planta {
    protected String tipo; // Variable de instancia para la marca
    protected double altura; // Variable de instancia para el modelo

    // Constructor para inicializar las variables
    public Planta(String tipo, double altura) {
        this.tipo = tipo;
        this.altura = altura;
    }

    // Método para encapsuslar el marca del empleado
    public String getTipo() {
        return tipo;
    }

    // Método para encapsuslar el modelo del empleado
    public double getAltura() {
        return altura;
    }

} 


// Definición de la clase garaje y hereda de coche
public class Jardin {
    private List<Planta> plantas;//lista de coches

// Constructor para inicializar la lista de coches
    public Jardin() {
        plantas = new ArrayList<>(); // Inicializa la lista de coches
    }

    // Método para añadir un coche a garaje
    public void añadirPlanta(Planta planta) {
        plantas.add(planta);
    }

     // Método para imprimir las marcas y los modelos de todos los coches
    public void imprimirNombreEdad() {
        for (Planta planta : plantas) {
            System.out.println("tipo: " + planta.getTipo()); // Imprime el marca de la Marca
            System.out.println("altura: " + planta.getAltura());// Imprime el marca de la Modelo
        }
    }
// Método principal para probar las clases
public static void main(String[] args) {
    Jardin jardin = new Jardin(); //Crea un objeto Garaje

   // Añadir coches al garaje
   jardin.añadirPlanta(new Planta("Girasol", 5.3));
   jardin.añadirPlanta(new Planta("Rosa", 3.2));
   jardin.añadirPlanta(new Planta("Tulipan",2.5));

    // Imprimir las marcas y los modelos de todos los coches
    jardin.imprimirNombreEdad(); // Llama al método para imprimir marcas y modelos
}
}
import java.util.ArrayList;
import java.util.List;

// Definición de la clase coche
 class Producto {
    protected String nombre; // Variable de instancia para la marca
    protected double precio; // Variable de instancia para el modelo

    // Constructor para inicializar las variables
    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    // Método para encapsuslar el marca del empleado
    public String getNombre() {
        return nombre;
    }

    // Método para encapsuslar el modelo del empleado
    public double getPrecio() {
        return precio;
    }

} 


// Definición de la clase garaje y hereda de coche
public class Carrit {
    private List<Producto> productos;//lista de coches

// Constructor para inicializar la lista de coches
    public Carrit() {
        productos = new ArrayList<>(); // Inicializa la lista de coches
    }

    // Método para añadir un coche a garaje
    public void añadirProducto(Producto producto) {
        productos.add(producto);
    }

     // Método para imprimir las marcas y los modelos de todos los coches
    public void imprimirNombrePrecio() {
        for (Producto producto : productos) {
            System.out.println("nombre: " + producto.getNombre()); // Imprime el marca de la Marca
            System.out.println("precio: " + producto.getPrecio());// Imprime el marca de la Modelo
            System.out.println();
        }
    }
     // Método para calcular y devolver el total del precio de todos los productos en el carrito
    public double calcularTotal() {
        double total = 0.0;
        for (Producto producto : productos) {
            total += producto.getPrecio();
        }
        return total;
    }
// Método principal para probar las clases
public static void main(String[] args) {
    Carrit carrit = new Carrit(); //Crea un objeto Garaje

   // Añadir coches al garaje
   carrit.añadirProducto(new Producto("Leche", 1.5));
   carrit.añadirProducto(new Producto("Pan", 2.0));
   carrit.añadirProducto(new Producto("Huevos", 3.5));

    // Imprimir las marcas y los modelos de todos los coches
    carrit.imprimirNombrePrecio(); // Llama al método para imprimir marcas y modelos
    
    double total = carrit.calcularTotal();
    System.out.println("Total del carrito: " + total);
}
}
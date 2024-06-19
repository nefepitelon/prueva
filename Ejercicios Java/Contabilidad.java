//54 Crear una clase Factura con variables numero y monto.
//55 Crear una clase Contabilidad con una lista de facturas.
//56 Crear un método en Contabilidad que imprima el número y el monto de todas las facturas.

import java.util.ArrayList;
import java.util.List;

// Definición de la clase Factura
class Factura {
    private String nombre; // Variable de instancia para el nombre de la factura
    private double monto; // Variable de instancia para el monto de la factura

    // Constructor para inicializar las variables
    public Factura(String nombre, double monto) {
        this.nombre = nombre;
        this.monto = monto;
    }

    // Método para obtener el nombre de la factura
    public String getNombre() {
        return nombre;
    }

    // Método para obtener el monto de la factura
    public double getMonto() {
        return monto;
    }
}

// Definición de la clase Contabilidad que es pública
public class Contabilidad {
    private List<Factura> facturas; // Lista de facturas

    // Constructor para inicializar la lista de facturas
    public Contabilidad() {
        facturas = new ArrayList<>(); // Inicializa la lista de facturas
    }

    // Método para añadir una factura a la contabilidad
    public void añadirFactura(Factura factura) {
        facturas.add(factura);
    }

    // Método para imprimir los nombres y montos de todas las facturas
    public void imprimirNombresMontos() {
        for (Factura factura : facturas) {
            System.out.println("Nombre: " + factura.getNombre());
            System.out.println("Monto: " + factura.getMonto()); // Imprime el nombre y el monto de la factura
            System.out.println();
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Contabilidad contabilidad = new Contabilidad(); // Crea un objeto Contabilidad

        // Añadir facturas a la contabilidad
        contabilidad.añadirFactura(new Factura("Factura 1", 100.50));
        contabilidad.añadirFactura(new Factura("Factura 2", 200.75));
        contabilidad.añadirFactura(new Factura("Factura 3", 300.00));

        // Imprimir los nombres y montos de todas las facturas
        contabilidad.imprimirNombresMontos(); // Llama al método para imprimir nombres y montos
    }
}




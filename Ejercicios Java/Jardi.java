//75 Crear una clase Planta con variables tipo y altura.
//76 Crear una clase Jardin con una lista de plantas.
//77 Crear un método en Jardin que imprima el tipo de todas las plantas.

import java.util.ArrayList;
import java.util.List;

// Crear una clase Planta con variables tipo y altura.
class Planta {
    protected String tipo;
    protected double altura;

    // Constructor
    public Planta(String tipo, double altura) {
        this.tipo = tipo;
        this.altura = altura;
    }

    // Getters
    public String getTipo() {
        return tipo;
    }

    public double getAltura() {
        return altura;
    }
}

// Crear una clase Jardin con una lista de plantas.
public class Jardi {
    private List<Planta> plantas;

    // Constructor
    public Jardi() {
        plantas = new ArrayList<>();
    }

    // Método para agregar una planta al jardín
    public void agregarPlanta(Planta planta) {
        plantas.add(planta);
    }

    // Crear un método en Jardin que imprima el tipo de todas las plantas.
    public void imprimirTiposPlantas() {
        for (Planta planta : plantas) {
            System.out.println("Tipo: " + planta.getTipo());
            System.out.println();
        }
    }

    // Método principal para probar las clases
    public static void main(String[] args) {
        Jardi jardin = new Jardi(); // Crea un objeto Jardin

        jardin.agregarPlanta(new Planta("Rosa", 1.2));
        jardin.agregarPlanta(new Planta("Tulipán", 0.5));
        jardin.agregarPlanta(new Planta("Girasol", 1.8));

        // Imprimir los tipos de las plantas
        jardin.imprimirTiposPlantas();
    }
}

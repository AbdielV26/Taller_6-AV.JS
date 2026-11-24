/**
 * Taller 6 - Parte 3: Clase Producto para arreglo de objetos
 * Integrante A: ___________________________
 * Integrante B: ___________________________
 *
 * INSTRUCCIONES:
 * Copia aquí la clase Producto completa que aparece en el documento del taller.
 * Este archivo debe compilarse JUNTO con Parte3.java:
 *   javac src/Producto.java src/Parte3.java
 */
public class Producto {

    private String nombre;
    private double precio;
    private int cantidad;

    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getTotal() {
        return precio * cantidad;
    }

    @Override
    public String toString() {
        return nombre + " | $" + precio + " x " + cantidad + " = $" + getTotal();
    }
}
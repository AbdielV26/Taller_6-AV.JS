import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Collections; 

/**
 * Taller 6 - Parte 4: Colecciones ArrayList y LinkedList
 * Integrante A: Abdiel Valiente
 * Integrante B: Jesus Satos
 *
 * INSTRUCCIONES:
 * Copia aquí el código completo de la Parte 4 que aparece en el documento.
 * Se mostrarán 3 ventanas de JOptionPane en secuencia.
 * Toma captura de cada una:
 *   imagenes/p4a_ciudades.png
 *   imagenes/p4b_numeros.png
 *   imagenes/p4c_cola.png
 */

public class Parte4 {
    public static void main(String[] args) {

        // --- 4A: ArrayList de Ciudades ---
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Panamá");
        ciudades.add("Colón");
        ciudades.add("David");
        ciudades.add("Santiago");
        ciudades.add("Chitré");

        // Operaciones sobre ArrayList
        ciudades.add(1, "Penonomé"); // Insertar en índice 1
        ciudades.remove("Colón");    // Eliminar por nombre

        StringBuilder msgCiudades = new StringBuilder("=== 4A: ARRAYLIST DE CIUDADES ===\n");
        msgCiudades.append("Total de ciudades: ").append(ciudades.size()).append("\n");
        msgCiudades.append("Ciudad en índice 2: ").append(ciudades.get(2)).append("\n\nLista completa:\n");
        for (int i = 0; i < ciudades.size(); i++) {
            msgCiudades.append(i).append(". ").append(ciudades.get(i)).append("\n");
        }
        JOptionPane.showMessageDialog(null, msgCiudades.toString());


        // --- 4B: LinkedList de Números ---
        LinkedList<Integer> numeros = new LinkedList<>();
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.addFirst(10); // Agregar al inicio
        numeros.addLast(50);  // Agregar al final

        StringBuilder msgNumeros = new StringBuilder("=== 4B: LINKEDLIST DE NÚMEROS ===\n");
        msgNumeros.append("Lista original: ").append(numeros).append("\n");
        msgNumeros.append("Primero: ").append(numeros.getFirst()).append("\n");
        msgNumeros.append("Último: ").append(numeros.getLast()).append("\n");

        numeros.removeFirst(); // Eliminar primero
        numeros.removeLast();  // Eliminar último
        msgNumeros.append("Después de eliminar extremos: ").append(numeros);
        JOptionPane.showMessageDialog(null, msgNumeros.toString());


        // --- 4C: Queue (Cola FIFO) ---
        Queue<String> colaAtencion = new LinkedList<>();
        colaAtencion.offer("Cliente 1 - Ana");
        colaAtencion.offer("Cliente 2 - Luis");
        colaAtencion.offer("Cliente 3 - Carla");
        colaAtencion.offer("Cliente 4 - Pedro");

        StringBuilder msgCola = new StringBuilder("=== 4C: COLA DE ATENCIÓN (FIFO) ===\n");
        msgCola.append("Cola inicial: ").append(colaAtencion).append("\n");
        msgCola.append("Siguiente en turno (peek): ").append(colaAtencion.peek()).append("\n\n");
        msgCola.append("Atendiendo (poll): ").append(colaAtencion.poll()).append("\n");
        msgCola.append("Atendiendo (poll): ").append(colaAtencion.poll()).append("\n\n");
        msgCola.append("Cola restante: ").append(colaAtencion).append("\n");
        msgCola.append("Clientes en espera: ").append(colaAtencion.size());
        JOptionPane.showMessageDialog(null, msgCola.toString());
    }
}
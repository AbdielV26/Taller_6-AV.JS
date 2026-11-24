import javax.swing.JOptionPane;

/**
 * Taller 6 - Parte 1: Arreglos de una dimensión
 * Integrante A: Jesus Santos 
 * Integrante B: Abdiel Valiente 
 *  * Fecha: 23/11/2026
 *
 * NOTA: el código original del taller no estaba disponible, así que este es
 * un ejemplo típico de arreglos de una dimensión. Reemplázalo por el del documento.
 */
public class Parte1 {
    public static void main(String[] args) {

        // Declaración y creación del arreglo
        int[] notas = new int[5];

        // Llenado con datos del usuario
        for (int i = 0; i < notas.length; i++) {
            String entrada = JOptionPane.showInputDialog("Ingrese la nota " + (i + 1) + ":");
            notas[i] = Integer.parseInt(entrada);
        }

        // Recorrido: suma, promedio, mayor y menor
        int suma = 0;
        int mayor = notas[0];
        int menor = notas[0];

        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
            if (notas[i] > mayor) {
                mayor = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        double promedio = (double) suma / notas.length;

        // Construcción de la salida
        String resultado = "Notas: ";
        for (int i = 0; i < notas.length; i++) {
            resultado += notas[i] + " ";
        }
        resultado += "\nSuma: " + suma;
        resultado += "\nPromedio: " + promedio;
        resultado += "\nMayor: " + mayor;
        resultado += "\nMenor: " + menor;

        JOptionPane.showMessageDialog(null, resultado);
    }
}

import javax.swing.JOptionPane;

/**
 * Taller 6 - Parte 2: Arreglos de dos dimensiones
 * Integrante A: Abdiel Valiente
 * Integrante B: Jesus Satos 
 *
 * INSTRUCCIONES:
 * Copia aquí el código completo que aparece en el documento del taller.
 * Luego ejecuta, verifica la salida y responde las preguntas en respuestas/parte2.txt
 */

public class Parte2 {
    public static void main(String[] args) {

        // Dimensiones de la tabla (modificado a 4 estudiantes)
        int filas    = 4;  // estudiantes
        int columnas = 3;  // materias

        // Declaración del arreglo 2D
        int[][] calificaciones = new int[filas][columnas]; //

        // Nombres de materias (arreglo 1D paralelo)
        String[] materias = {"Matematica", "Español", "Ciencias"}; //

        // Nombres de estudiantes (agregado "Pedro")
        String[] estudiantes = {"Ana", "Luis", "Carla", "Pedro"}; //

        // LLENADO con datos fijos
        calificaciones[0][0] = 85;  calificaciones[0][1] = 72;  calificaciones[0][2] = 90; //
        calificaciones[1][0] = 60;  calificaciones[1][1] = 88;  calificaciones[1][2] = 75; //
        calificaciones[2][0] = 95;  calificaciones[2][1] = 70;  calificaciones[2][2] = 80; //
        calificaciones[3][0] = 78;  calificaciones[3][1] = 65;  calificaciones[3][2] = 92; //

        // IMPRIMIR la tabla
        StringBuilder reporte = new StringBuilder(); //[cite: 5]
        reporte.append("=== TABLA DE CALIFICACIONES ===\n"); //[cite: 5]
        reporte.append(String.format("%-10s", "Alumno")); //[cite: 5]
        for (String m : materias) {
            reporte.append(String.format("%-12s", m)); //[cite: 5]
        }
        reporte.append("Promedio\n"); //[cite: 5]
        reporte.append("-".repeat(50)).append("\n"); //[cite: 5]

        // Recorrer FILAS (estudiantes)
        for (int f = 0; f < filas; f++) {
            int sumaFila = 0; //[cite: 5]
            reporte.append(String.format("%-10s", estudiantes[f])); //[cite: 5]

            // Recorrer COLUMNAS (materias) de este estudiante
            for (int c = 0; c < columnas; c++) {
                reporte.append(String.format("%-12d", calificaciones[f][c])); //[cite: 5]
                sumaFila += calificaciones[f][c]; //[cite: 5]
            }
            double promedioFila = (double) sumaFila / columnas; //[cite: 5]
            reporte.append(String.format("%.2f\n", promedioFila)); //[cite: 5]
        }

        // Promedio por COLUMNA (materia)
        reporte.append("-".repeat(50)).append("\n"); //[cite: 5]
        reporte.append(String.format("%-10s", "Prom.mat")); //[cite: 5]
        for (int c = 0; c < columnas; c++) {
            int sumaCol = 0; //[cite: 5]
            for (int f = 0; f < filas; f++) {
                sumaCol += calificaciones[f][c]; //[cite: 5]
            }
            reporte.append(String.format("%-12.2f", (double) sumaCol / filas)); //[cite: 5]
        }

        JOptionPane.showMessageDialog(null, reporte.toString()); //[cite: 5]
    }
}
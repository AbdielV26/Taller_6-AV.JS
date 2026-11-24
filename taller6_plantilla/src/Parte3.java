import javax.swing.JOptionPane;

/**
 * Taller 6 - Parte 3: Arreglos de Objetos
 * Integrante A: abdiel Valiente 
 * Integrante B: Jesus Santos
 *
 * NOTA: el código original del taller no estaba disponible, así que este es
 * un ejemplo típico de arreglo de objetos. Reemplázalo por el del documento.
 *
 * Compilar:
 *   javac src/Producto.java src/Parte3.java
 * Ejecutar:
 *   java -cp src Parte3
 */
public class Parte3 {
    public static void main(String[] args) {

        // Arreglo de objetos Producto
        Producto[] inventario = new Producto[3];

        // Cada posición debe crearse con new, si no vale null
        for (int i = 0; i < inventario.length; i++) {
            String nombre = JOptionPane.showInputDialog("Nombre del producto " + (i + 1) + ":");
            double precio = Double.parseDouble(JOptionPane.showInputDialog("Precio de " + nombre + ":"));
            int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de " + nombre + ":"));
            inventario[i] = new Producto(nombre, precio, cantidad);
        }

        // Recorrido: listado, total del inventario y producto más caro
        String listado = "INVENTARIO\n";
        double totalInventario = 0;
        Producto masCaro = inventario[0];

        for (int i = 0; i < inventario.length; i++) {
            listado += inventario[i].toString() + "\n";
            totalInventario += inventario[i].getTotal();
            if (inventario[i].getPrecio() > masCaro.getPrecio()) {
                masCaro = inventario[i];
            }
        }

        listado += "\nTotal del inventario: $" + totalInventario;
        listado += "\nProducto más caro: " + masCaro.getNombre();

        JOptionPane.showMessageDialog(null, listado);
    }
}

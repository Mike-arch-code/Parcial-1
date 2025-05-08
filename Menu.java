import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Menu {

    
    public static void mostrarMenu() {
        try (BufferedReader br = new BufferedReader(new FileReader("Menus.txt"))) {
            String linea;
            System.out.println("Producto              Precio     Cantidad");
            System.out.println("------------------------------------------");

            while ((linea = br.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

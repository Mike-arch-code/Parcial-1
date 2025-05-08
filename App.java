import java.io.IOException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Simulador de Restaurante ---");
            System.out.println("1. Ver menú disponible");
            System.out.println("2. Realizar pedido");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // limpiar buffer

            switch (opcion) {
                case 1 -> Menu.mostrarMenu();
                    case 2 -> {
                        Pedido pedido = new Pedido("menus.txt");
                        pedido.realizarPedido();
                }
                case 3 -> {
                    System.out.println("Saliendo del sistema...");
                    return;
                }
                default -> System.out.println("Opción inválida. Intente de nuevo.");
            }
        }
    }
}

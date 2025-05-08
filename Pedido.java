import java.io.*;
import java.util.*;

public class Pedido {

    private String archivo;

    public Pedido(String archivo) {
        this.archivo = archivo;
    }

    public void realizarPedido() {
        String[] lineas = new String[3];

        try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            for (int i = 0; i < 3; i++) {
                lineas[i] = br.readLine().trim();
            }
        } catch (IOException e) {
            System.out.println("Error al leer el archivo.");
            return;
        }

        int opcion = new Scanner(System.in).nextInt();



        String[] p = lineas[opcion - 1].split("/");
        int cantidad = Integer.parseInt(p[2].trim());

        if (cantidad <= 0) {
            System.out.println("Agotado");
            return;
        }

        System.out.println(p[0].trim() + " $" + p[1].trim());

        lineas[opcion - 1] = p[0].trim() + " /" + p[1].trim() + "  /" + (cantidad - 1);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(archivo))) {
            for (String linea : lineas) {
                bw.write(linea + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error al escribir el archivo.");
        }
    }
}

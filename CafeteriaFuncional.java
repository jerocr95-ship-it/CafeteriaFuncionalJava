import java.util.*;
import java.util.function.*;
import java.util.stream.*;

public class CafeteriaFuncional {

    public static void main(String[] args) {

        // Lista de productos de la cafetería
        List<String> productos = Arrays.asList(
            "Cafe Americano",
            "Espresso",
            "Capuchino",
            "Cafe con Leche"
        );

        // Lista de precios en pesos uruguayos
        List<Double> precios = Arrays.asList(
            120.0, 100.0, 160.0, 140.0
        );

        System.out.println("=== SISTEMA DE CAFETERIA ===");

        // CONSUMER: mostrar productos
        Consumer<String> mostrarProducto =
            producto -> System.out.println("Producto: " + producto);

        System.out.println("\nPRODUCTOS DISPONIBLES:");
        productos.forEach(mostrarProducto);

        // PREDICATE: filtrar precios
        Predicate<Double> precioMayor =
            precio -> precio > 120;

        System.out.println("\nPRECIOS MAYORES A $120:");

        precios.stream()
            .filter(precioMayor)
            .forEach(System.out::println);

        // FUNCTION: aplicar descuento del 10%
        Function<Double, Double> descuento =
            precio -> precio * 0.90;

        System.out.println("\nPRECIOS CON DESCUENTO:");

        precios.stream()
            .map(descuento)
            .forEach(System.out::println);

        // SUPPLIER: generar numero de pedido
        Supplier<Integer> generarPedido =
            () -> new Random().nextInt(9000) + 1000;

        System.out.println("\nNUMERO DE PEDIDO:");
        System.out.println(generarPedido.get());

        // OPTIONAL: buscar producto
        Optional<String> productoBuscado =
            productos.stream()
                .filter(p -> p.equalsIgnoreCase("Espresso"))
                .findFirst();

        System.out.println("\nBUSQUEDA DE PRODUCTO:");

        productoBuscado.ifPresentOrElse(
            p -> System.out.println("Encontrado: " + p),
            () -> System.out.println("Producto no encontrado")
        );

        // REDUCE: calcular total
        double total = precios.stream()
            .reduce(0.0, Double::sum);

        System.out.println("\nTOTAL DE PRODUCTOS: $" + total);

        // COLLECT: crear una nueva lista
        List<String> productosFiltrados =
            productos.stream()
                .filter(p -> p.length() > 8)
                .collect(Collectors.toList());

        System.out.println("\nPRODUCTOS FILTRADOS:");
        productosFiltrados.forEach(System.out::println);

        System.out.println("\n=== FIN DEL PROGRAMA ===");
    }
}
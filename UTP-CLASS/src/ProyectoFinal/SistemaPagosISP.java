package ProyectoFinal;

import java.util.Scanner;
import java.util.ArrayList;

public class SistemaPagosISP {
    private static ArrayList<Cliente> clientes = new ArrayList<>();
    private static ArrayList<OrdenPago> ordenes = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean salir = false;
        while (!salir) {
            mostrarMenu();
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de linea

            switch (opcion) {
                case 1:
                    registrarCliente();
                    break;
                case 2:
                    registrarOrdenPago();
                    break;
                case 3:
                    mostrarClientes();
                    break;
                case 4:
                    mostrarOrdenes();
                    break;
                case 5:
                    marcarOrdenComoPagada();
                    break;
                case 6:
                    salir = true;
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida, intente nuevamente.");
            }
        }
    }

    public static void mostrarMenu() {
        System.out.println("\n--- Sistema de Pagos ISP ---");
        System.out.println("1. Registrar Cliente");
        System.out.println("2. Registrar Orden de Pago");
        System.out.println("3. Mostrar Clientes Registrados");
        System.out.println("4. Mostrar Ordenes de Pago");
        System.out.println("5. Marcar Orden como Pagada");
        System.out.println("6. Salir");
        System.out.print("Seleccione una opcion: ");
    }

    public static void registrarCliente() {
        System.out.print("Ingrese el codigo del cliente: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = scanner.nextLine();

        Cliente cliente = new Cliente(codigo, nombre);
        clientes.add(cliente);
        System.out.println("Cliente registrado exitosamente.");
    }

    public static void registrarOrdenPago() {
    System.out.print("Ingrese el codigo del cliente: ");
    String codigo = scanner.nextLine();
    Cliente cliente = buscarCliente(codigo);

    if (cliente != null) {
        System.out.print("Ingrese el monto mensual a pagar: ");
        double montoMensual = scanner.nextDouble();
        System.out.print("Ingrese la cantidad de meses: ");
        int meses = scanner.nextInt();

        // Calcular el monto total
        double montoTotal = montoMensual * meses;

        // Crear y registrar la orden de pago con el monto total
        OrdenPago orden = new OrdenPago(cliente, montoTotal, meses);
        ordenes.add(orden);
        System.out.printf("Orden de pago registrada exitosamente. Monto Total: %.2f%n", montoTotal);
    } else {
        System.out.println("Cliente no encontrado.");
    }
}

    public static Cliente buscarCliente(String codigo) {
        for (Cliente cliente : clientes) {
            if (cliente.getCodigo().equals(codigo)) {
                return cliente;
            }
        }
        return null;
    }

    public static void mostrarClientes() {
        System.out.println("\n--- Clientes Registrados ---");
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados.");
        } else {
            for (Cliente cliente : clientes) {
                System.out.printf("Codigo: %s - Nombre: %s%n", cliente.getCodigo(), cliente.getNombre());
            }
        }
    }

    public static void mostrarOrdenes() {
        System.out.println("\n--- Ordenes de Pago ---");
        if (ordenes.isEmpty()) {
            System.out.println("No hay ordenes registradas.");
        } else {
            for (OrdenPago orden : ordenes) {
                orden.mostrarDetalle();
            }
        }
    }

    public static void marcarOrdenComoPagada() {
        System.out.print("Ingrese el codigo del cliente: ");
        String codigo = scanner.nextLine();
        Cliente cliente = buscarCliente(codigo);

        if (cliente != null) {
            for (OrdenPago orden : ordenes) {
                if (orden.getCliente().getCodigo().equals(codigo) && !orden.getEstadoPago().equals("Pagado")) {
                    orden.marcarComoPagado();
                    System.out.println("Orden de pago marcada como pagada.");
                    return;
                }
            }
            System.out.println("No se encontraron ordenes pendientes para este cliente.");
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
}

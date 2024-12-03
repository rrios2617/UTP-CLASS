package ProyectoFinal;

import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public class OrdenPago {
    // Declarar las variables como final
    private final Cliente cliente;
    private final double monto;
    private final int meses;
    private final Date fechaVencimiento;
    private boolean pagado;

    // Constructor de la clase OrdenPago
    public OrdenPago(Cliente cliente, double monto, int meses) {
        this.cliente = cliente;
        this.monto = monto;
        this.meses = meses;
        this.fechaVencimiento = calcularFechaVencimiento();
        this.pagado = false;
    }

    // Metodo para calcular la fecha de vencimiento (ultimo dia del mes)
    private Date calcularFechaVencimiento() {
    Calendar calendar = Calendar.getInstance();

    // Ajustar al último día del mes anterior
    calendar.add(Calendar.MONTH, -1);
    calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    Date fechaFacturacion = calendar.getTime();

    // Añadir un plazo de 7 días para obtener la fecha de vencimiento
    calendar.add(Calendar.DAY_OF_MONTH, 7);
    Date fechaVencimiento = calendar.getTime();

    // Imprimir fechas para verificar en consola
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    System.out.printf("Fecha de Facturacion: %s - Fecha de Vencimiento: %s%n",
            sdf.format(fechaFacturacion), sdf.format(fechaVencimiento));

    return fechaVencimiento; // Retorna la fecha de vencimiento calculada
} 

    // Metodo para marcar una orden como pagada
    public void marcarComoPagado() {
        this.pagado = true;
    }

    // Metodo para obtener el estado de pago
    public String getEstadoPago() {
        return pagado ? "Pagado" : "Pendiente";
    }

    // Metodo para mostrar los detalles de la orden de pago
    public void mostrarDetalle() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.printf("Codigo Cliente: %s - Cliente: %s - Monto: %.2f - Vencimiento: %s - Estado: %s%n",
                cliente.getCodigo(), cliente.getNombre(), monto, sdf.format(fechaVencimiento), getEstadoPago());
    }

    // Metodos getter
    public Cliente getCliente() {
        return cliente;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }
}

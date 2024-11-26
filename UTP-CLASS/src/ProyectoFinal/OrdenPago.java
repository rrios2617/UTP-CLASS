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
        calendar.add(Calendar.MONTH, meses); // Agregar meses
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH)); // Ultimo dia del mes
        return calendar.getTime();
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

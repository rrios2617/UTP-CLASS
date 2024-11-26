package ProyectoFinal;

public class Cliente {
    // Declaracion de variables como final
    private final String codigo;
    private final String nombre;

    // Constructor de la clase Cliente
    public Cliente(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    // Metodos getter
    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }
}


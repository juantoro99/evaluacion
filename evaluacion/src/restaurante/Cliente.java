package restaurante;

public class Cliente extends Persona {
    String direccion;

    public Cliente(int id, String nombre, String telefono, String direccion) {
        super(id, nombre, telefono);
        this.direccion = direccion;
    }

    public boolean hacerReserva() {
        return true;
    }
}
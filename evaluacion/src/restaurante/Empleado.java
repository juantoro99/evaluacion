package restaurante;

import java.util.Date;

public class Empleado extends Persona {
    String puesto;

    public Empleado(int id, String nombre, String telefono, String puesto) {
        super(id, nombre, telefono);
        this.puesto = puesto;
    }

    public Date registrarEntrada() {
        return new Date();
    }
}
package restaurante;

public abstract class Persona {
    int id;
    String nombre;
    String telefono;

    public Persona(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }

    public String getContacto() {
        return nombre + " - " + telefono;
    }
}
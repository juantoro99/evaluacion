package restaurante;

public class Producto {
    int id;
    String nombre;
    float precio;
    Categoria categoria;

    public Producto(int id, String nombre, float precio, Categoria categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getInfo() {
        return nombre + " - $" + precio;
    }
}

package restaurante;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Pedido {
    int id;
    Date fechaHora;
    String estado;
    List<Producto> productos;

    public Pedido(int id) {
        this.id = id;
        this.fechaHora = new Date();
        this.estado = "Pendiente";
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public float calcularTotal() {
        float total = 0;
        for (Producto producto : productos) {
            total += producto.precio;
        }
        return total;
    }
}
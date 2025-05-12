package restaurante;

import java.util.ArrayList;
import java.util.List;

public class Mesa {
    int id;
    int numero;
    int capacidad;
    List<Pedido> pedidos;

    public Mesa(int id, int numero, int capacidad) {
        this.id = id;
        this.numero = numero;
        this.capacidad = capacidad;
        this.pedidos = new ArrayList<>();
    }

    public boolean reservar() {
        return true;
    }

    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public void cerrarMesa() {
        pedidos.clear();
    }
}
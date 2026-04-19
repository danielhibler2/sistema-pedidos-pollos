package com.pedidos;

import java.util.ArrayList;
import java.util.List;

public class SistemaPedidos {

    private List<Pedido> pedidos = new ArrayList<>();

    public void agregarPedido(String cliente, String producto) {
        pedidos.add(new Pedido(cliente, producto));
    }

    public void mostrarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("No hay pedidos registrados.");
        } else {
            for (Pedido p : pedidos) {
                System.out.println(p);
            }
        }
    }
}
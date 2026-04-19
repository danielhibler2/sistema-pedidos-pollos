package com.pedidos;

public class Pedido {
    private String cliente;
    private String producto;

    public Pedido(String cliente, String producto) {
        this.cliente = cliente;
        this.producto = producto;
    }

    public String getCliente() {
        return cliente;
    }

    public String getProducto() {
        return producto;
    }

    @Override
    public String toString() {
        return "Cliente: " + cliente + " | Producto: " + producto;
    }
}
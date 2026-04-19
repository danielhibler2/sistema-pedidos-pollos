package com.pedidos;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        SistemaPedidos sistema = new SistemaPedidos();

        int opcion;

        do {
            System.out.println("\n--- SISTEMA DE PEDIDOS ---");
            System.out.println("1. Agregar pedido");
            System.out.println("2. Ver pedidos");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del cliente: ");
                    String cliente = scanner.nextLine();

                    System.out.print("Producto: ");
                    String producto = scanner.nextLine();

                    sistema.agregarPedido(cliente, producto);
                    System.out.println("Pedido agregado.");
                    break;

                case 2:
                    sistema.mostrarPedidos();
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 3);

        scanner.close();
    }
}
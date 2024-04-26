package onlineshop;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ImplementacionInventario inventario = new ImplementacionInventario();
        ArrayList<Producto> listaProductos = inventario.obtenerProductos();

        for (Producto producto : listaProductos) {
            System.out.println("Producto: "+producto.getProduct_name()+" Precio: "+producto.getProduct_price()+" Stock: "+producto.getProduct_stock());
        }
    }
}
package onlineshop;

import java.util.ArrayList;

public class ImplementacionInventario implements Intentario{

    public ArrayList<Producto> listaProductos = new ArrayList<>();

    public ImplementacionInventario(){
        this.listaProductos.add(new Producto("CocaCola", 1500, 10));
        this.listaProductos.add(new Producto("Arroz", 1200, 5));
        this.listaProductos.add(new Producto("Lentejas", 1000, 8));
        this.listaProductos.add(new Producto("CandyRanch", 2000, 0));
    }

    public ArrayList<Producto> obtenerProductos(){
        
        ArrayList<Producto> listaDisponible = new ArrayList<>();

        for (Producto producto : listaProductos) {
            if(producto.getProduct_stock()>0){
                listaDisponible.add(producto);
            }
        }

        return listaDisponible;
    }
    
}
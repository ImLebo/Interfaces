package onlineshop;

public class Producto {

    private String product_name = "";
    private int product_price = 0;
    private int product_stock = 0;
    
    public Producto(String product_name, int product_price, int product_stock) {
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_stock = product_stock;
    }

    public String getProduct_name() {
        return this.product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public int getProduct_price() {
        return this.product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public int getProduct_stock() {
        return this.product_stock;
    }

    public void setProduct_stock(int product_stock) {
        this.product_stock = product_stock;
    }

    

    
}